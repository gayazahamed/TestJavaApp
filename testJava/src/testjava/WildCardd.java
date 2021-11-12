package testjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardd {
    public WildCardd() {
        super();
    }


    //upper bound

    static double sumOfNumbers(List<? extends Number> nums) {
        double sum = 0.0;
        for (Number n : nums) {
            sum += n.doubleValue();
        }
        return sum;
    }
    
    
    static List insertNumbers(List<? super Number> nums) {
        nums.add(1);
        nums.add(1.2);
        nums.add(3L);
        return nums;
    }

    public static void main(String[] args) {


        System.out.println(sumOfNumbers(Arrays.asList(1, 2, 3)));
        System.out.println(sumOfNumbers(Arrays.asList(1.9, 2, 3)));
        System.out.println(sumOfNumbers(Arrays.asList(1.9, 2, 3L)));
        System.out.println("................");
        
        List ll = new ArrayList<Number>();
        System.out.println(insertNumbers(ll));
        
        
        List l2 = new ArrayList<String>();
        System.out.println();
        System.out.println(insertNumbers(l2));
        
        ArrayList<String> l3 = new ArrayList<String>();
         
        System.out.println();
    }
}
