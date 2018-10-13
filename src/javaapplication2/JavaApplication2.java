
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Talha Zubaer
 */
public class JavaApplication2 {
    double num1;
    double num2;
    

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter First Number");
        double num1=sc.nextDouble();
        
        System.out.println("Enter second Number");
        double num2=sc.nextDouble();
        
        //calling methods
        add(num1,num2);
        subtract(num1,num2);
        multiply(num1,num2);
        
//        double res=num1+num2;
//        System.out.println("The Result is "+res);
         //will do this with a method

        
    }
    
    public static void add(double x,double y){
    
        double res;
        res = x+y;
        System.out.println("The addition is "+res);
        
}
    public static void subtract(double x, double y){
        
        double sub;
        sub=x-y;
        System.out.println("The Subtraction is "+sub);
    
}
    
    public static void multiply(double m, double n){
        
        double mult;
        mult=m*n;
        System.out.println("The Multiplication is "+mult);
    
}
}
    
