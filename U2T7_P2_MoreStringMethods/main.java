package U2T7_P2_MoreStringMethods;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //VARIABLES
        int gameScore = 0;
        String currentWord = "";
        String previousWord = "";
        int numIndex = 1;
        String firstTwoLetters = "";
        int sameLengthBonus = 3;
        //first part of if statement is only for the first word
        while (gameScore < 50) {
            if (numIndex == 1) {
                System.out.println("Enter the first word");
                currentWord = scan.nextLine();
                numIndex ++;
            } else {
                previousWord = currentWord;
                System.out.println("Enter the next word. This will be number " + numIndex);
                currentWord = scan.nextLine();
                numIndex ++;

                if (currentWord.compareTo(previousWord) > 0) {
                    gameScore += 2;
                }

                if (currentWord.compareTo(previousWord) < 0) {
                    gameScore -= 5;
                }

                if (currentWord.compareTo(previousWord) == 0) {
                    gameScore -= 10;
                }

                firstTwoLetters = currentWord.substring(0, 2);

                int lengthOfprev = (previousWord.length() - 2);
                String lastTwoLetters = previousWord.substring(lengthOfprev);
                if (firstTwoLetters.equals(lastTwoLetters) == true) {
                    gameScore += 5;
                }

                String firstLetter = previousWord.substring(0, 1);
                if (currentWord.indexOf(firstLetter) >= 0) {
                    gameScore += 3;
                }

                if (currentWord.length() == previousWord.length()) {
                    gameScore += sameLengthBonus;
                }

                System.out.println("The score is " + gameScore);
            }
        }

        scan.close();
    }
}
