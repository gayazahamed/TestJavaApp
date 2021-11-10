package testjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Person<T> {
    public Person() {
        super();
        data = (T[]) new Object[10];
    }

    private transient T[] data;
    int size = 0;

    public static void main(String[] args) {
        Person<String> p = new Person<String>();
        p.add("first val");
        p.add("second val");
        p.add("third val");
        p.add("fourth val");
        System.out.println(p);
        Collection cc = new LinkedList<String>();
        Object ooo = (Object) ("test");
        cc.add("str1");
        cc.add("str1");
        cc.add("str1");
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(cc);
        System.out.println(ar);
    }


    public void add(T t) {
        data[size++] = t;
    }


    @Override
    public String toString() {
        for (T str : data) {
            if (str != null)
                System.out.println(str);
        }
        return "printed";
    }
}
