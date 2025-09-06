package tools;
public class AdvCalc extends Calc {
   
   public int multiply(int a, int b) {
       return a * b;
   }
   public int division(int a, int b) {
       if (b == 0) {
           throw new ArithmeticException("Division by zero is not allowed");
       }
       return a / b;
   } 
}
