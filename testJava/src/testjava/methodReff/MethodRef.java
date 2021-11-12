package testjava.methodReff;

public class MethodRef {
    public MethodRef() {
        super();
    }

    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodRef::saySomething;
        // Calling interface method
       sayable.say();
         
    }


}
