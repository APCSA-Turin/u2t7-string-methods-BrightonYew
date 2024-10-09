package U2T7_P2_MoreStringMethods;
import java.util.Scanner;
public class comparasion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string 1");
        String word1 = scan.nextLine();

        System.out.println("Enter string 2");
        String word2 = scan.nextLine();

        if (word1.equals(word2)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
            if (word1.compareTo(word2) < 0) {
                System.out.println(word1 + " comes before " + word2 + " alphabetically.");
            } else {
                System.out.println(word2 + " comes before " + word1 + " alphabetically.");
            }
        }

        scan.close();
    }
}
