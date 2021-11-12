package testjava.methodReff;
 
public class FunctionIntTest {
   
   public static void main(String[] args) {
        
       FunctionalInterface1<String> adder1 = System.out::println;
       adder1.test("jjjjjjjj");
       System.out.println();
       
   }
       
}
