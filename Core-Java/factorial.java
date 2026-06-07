import java.util.Scanner;

public class factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a number to get factorial");
		Long n = sc.nextLong();
		Long fact = 1l;
		for ( int i = 1; i <= n ; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+ n +" is "+ fact);
        sc.close();
	}
}