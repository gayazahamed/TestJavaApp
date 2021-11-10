package testjava;

public class MyCustomList<T> {
    public MyCustomList() {
        super();
        data = (T[]) new Object[10];
    }
    

    private transient T[] data;
    int size = 0;

    public static void main(String[] args) {
        MyCustomList<String> p = new MyCustomList<String>();
        p.add("first val");
        p.add("second val");
        p.add("third val");
        p.add("fourth val");
        System.out.println(p);
        System.out.println("-----------------");
        System.out.println(p.get(2));
    //        Collection cc = new LinkedList<String>();
    //        Object ooo = (Object) ("test");
    //        cc.add("str1");
    //        cc.add("str1");
    //        cc.add("str1");
    //        ArrayList<Object> ar = new ArrayList<Object>();
    //        ar.add(cc);
    //
    //
    //        System.out.println(ar);
        
      
    }


    public void add(T t) {
        data[size++] = t;
    }
    
    
    public T get(int i) {
        return data[i];
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
