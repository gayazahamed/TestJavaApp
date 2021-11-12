package testjava;

public class MethodGenerics {
    public MethodGenerics() {
        super();
    }
    
    
    static <Y> Y Tripple(Y value){
        return value;
    } 
    
    static <X extends Number> X doubleValue(X value){
        return value;
    } 
    
    public static void main(String[] args) {
       System.out.println(doubleValue(100));
     //  System.out.println(doubleValue("stringd"));
       
       
       System.out.println(Tripple(100));
       System.out.println(Tripple("stringd"));
       
   }
}
