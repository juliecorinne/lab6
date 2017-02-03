import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pigLatinWord;
        String vowels = "aeiouAEIOU";
        int i;
        char a;
        int split = 0;
        String beforeSplit = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println();
        System.out.println("Since it's a very useful and popular language, I'm assuming you'd like to translate some words.");
        System.out.println();
        System.out.println("Enter a word to be translated: ");
        pigLatinWord = scan.nextLine();

        String lowerCase = pigLatinWord.toLowerCase();
        a = Character.toLowerCase(pigLatinWord.charAt(0));

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {

            System.out.println(pigLatinWord + "way");

        } else {

            for (i = 0; i < lowerCase.length(); i++){

                if (vowels.contains(String.valueOf(lowerCase.charAt(i)))){

                    split = i;
                    beforeSplit = pigLatinWord.substring(lowerCase.indexOf(split), split);
                    //beforeSplit = pigLatinWord.substring(split, lowerCase.indexOf(i));
                    System.out.println(pigLatinWord.substring(split) + beforeSplit + "ay");
                    break;

                }

            }

        }

    }

}

