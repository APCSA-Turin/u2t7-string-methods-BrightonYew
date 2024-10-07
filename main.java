import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1Cut;
        int num2Cut;

        System.out.println("Enter a word");
        String word1 = scan.nextLine();

        System.out.println("Enter another word");
        String word2 = scan.nextLine();

        if (word1.length() > word2.length()) {
            System.out.println(word1 + " is longer");
        } else if (word2.length() > word1.length()) {
            System.out.println(word2 + " is longer");
        } else {
            System.out.println("Both words are the same length");
        }

        num1Cut = (word1.length() / 2);
        System.out.println("First half: " + word1.substring(0, num1Cut));
        System.out.println("Second half: " + word1.substring(num1Cut));

        num2Cut = (word2.length() / 2);
        System.out.println("First half: " + word2.substring(0, num2Cut));
        System.out.println("Second half: " + word2.substring(num2Cut));

        if (word1.indexOf(word2) == -1 ) {
            System.out.println(word2 + " is not found in " + word1);
        } else {
            System.out.println(word2 + " is found in " + word1);
        }
        scan.close();
    }
}