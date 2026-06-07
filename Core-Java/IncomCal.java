import java.util.*;
public class IncomCal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int income = sc.nextInt();
       double tax ;
       //  if income is less than 5L  0%
       if (income < 500000) {
        System.out.println("0 Tax ");
       }
       //  if income is greater 5L && Less than 10L  20%
       else if (income > 500000 && income < 10_00000){
        tax = (income * 0.2);
        System.out.println(" tax = "+ tax);
       } 
       //  if income is more than 10L   30%
       else {
        tax = (income * 0.3);
        System.out.println("tax = "+ tax);
       }
    }
}