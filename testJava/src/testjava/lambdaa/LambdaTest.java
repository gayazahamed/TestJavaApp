package testjava.lambdaa;


interface A {
    public void show(int i , int j);
}

class AA implements A {
    public void show(int i , int j){
        System.out.println("Show me");
    }
}
public class LambdaTest {
    public LambdaTest() {
        super();
    }

    //Lambda exp is implementation of functional interface


public static void main(String[] args) {
       A a = (i,j) ->  System.out.println("testttt me  " +(i+j));
       a.show(1,2);
   }

public static void maink(String[] args) {
    A a = new A(){
        public void show(int i , int j) {
            System.out.println("Show me");
        } 
    };
    a.show(10,20);
   }

    public static void mainO(String args[]) {
        A a;
        a = new AA();
        a.show(11,22);
    }
}


