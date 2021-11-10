package testjava;

public class MethodGenerics {
    public MethodGenerics() {
        super();
    }
    
    static <X extends Number> X doubleValue(X value){
         Number n = (Number)(value);
        Number n2 = 100;
        return value;
    } 
    
    public static void main(String[] args) {
       System.out.println(doubleValue(100));
       
       
       
   }
}
