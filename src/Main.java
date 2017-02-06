import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pigLatinWord;
        String vowels = "aeiouAEIOU";
        int i;
        char a;
        String beforeSplit = "";
        String userInput;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println();
        System.out.println("Since it's a very useful and popular language, I'm assuming you'd like to translate some words.");
        System.out.println();

        do {

            System.out.println("Enter a word to be translated: ");
            pigLatinWord = scan.nextLine();
            String lowerCase = pigLatinWord.toLowerCase();
            a = Character.toLowerCase(pigLatinWord.charAt(0));
            System.out.println();

             if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {

                System.out.println(pigLatinWord + "way");
                System.out.println();

            } else {

                for (i = 0; i < lowerCase.length(); i++){

                    if (vowels.contains(String.valueOf(lowerCase.charAt(i)))){

                        split(pigLatinWord, i);
                        break;
                }

            }

        }

            System.out.println("Would you like to continue? yes/no");
            userInput = scan.nextLine();

        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Bye!");

    }

    private static void split(String pigLatinWord, int i) {
        String beforeSplit;
        beforeSplit = pigLatinWord.substring(0, i);
        System.out.println(pigLatinWord.substring(i) + beforeSplit + "ay");
        System.out.println();
    }

}

