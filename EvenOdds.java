import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Integers to read :");
		Long n = sc.nextLong();
		Long even = 0l;
		Long odd = 0l;
		for (int i = 1; i <=n ; i++) {
			System.out.println("Eneter a integer");
			Long num = sc.nextLong();
			if ( num %2 == 0 ) {
				System.out.println("Integer is Even");
				even += num;
			} else {
				System.out.println("Integer is odd");
				odd += num;
			}
		}
		System.out.println("Sum of even integers is "+ even);
		System.out.println("Sum of odd integers is "+ odd);
		sc.close();
	}
}