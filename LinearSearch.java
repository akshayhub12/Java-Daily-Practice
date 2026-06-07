import java.util.*;

public class LinearSearch {

    // Fixed the typo in the method name and used .equals() for string comparison
    public static int linearSearch(String menu[], String key) {

        for (int i = 0; i < menu.length; i++) {
            // CORRECT: Use .equals() instead of ==
            if (menu[i].equals(key)) { 
                return i;
            }
        }
        return -1;
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String menu[] = { "samosa", "dosa", "edli", "coke", "milk", "tea"};
        
        System.out.print("Enter item to search: "); // Added for better user experience
        String key = sc.nextLine();
        
        int index = linearSearch(menu, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index : " + index);
        }
        
        sc.close(); // Good practice to close the scanner
    }
}