import java.util.*;
public class BillGenerate {
    public static void main(String[] args) {

        // Generate a bill to the customer
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencile");
        double pencile = sc.nextDouble();
        System.out.println("Enter the cost of pen");
        double pen = sc.nextDouble();
        System.out.println("Enter the cost of eraser");
        double eraser = sc.nextDouble();
        double bill = pencile + pen + eraser;
        double gst = bill * 0.18d;
        double totalBill = bill + gst;

        System.out.println("Total bill is : "+ totalBill + " with 18% GST");
        System.out.println("Thank you visit again !");
    }
}
