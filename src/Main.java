import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pigLatinWord;
        String vowels = "aeiouAEIOU";
        int i;
        char a;
        String beforeSplit = "";
        String userInput = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println();
        System.out.println("Since it's a very useful and popular language, I'm assuming you'd like to translate some words.");
        System.out.println();
        System.out.println("Enter a word to be translated: ");
        pigLatinWord = scan.nextLine();

        String lowerCase = pigLatinWord.toLowerCase();
        a = Character.toLowerCase(pigLatinWord.charAt(0));



        do {


             if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {

                System.out.println(pigLatinWord + "way");

        } else {

            for (i = 0; i < lowerCase.length(); i++){

                if (vowels.contains(String.valueOf(lowerCase.charAt(i)))){

                    beforeSplit = pigLatinWord.substring(0, i);
                    System.out.println(pigLatinWord.substring(i) + beforeSplit + "ay");
                    System.out.println();
                    break;
                }

            }

        }

            System.out.println("Would you like to continue? yes/no");
            scan.nextLine();
            userInput = scan.nextLine();

        } while (userInput.equalsIgnoreCase("yes"));

    }

}

