// import java.util.Scanner;

public class CharacterReplacement {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        char charToReplace = 'o';
        char replacementChar = '*';

        String modifiedString = replaceCharacter(originalString, charToReplace,
                replacementChar);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String replaceCharacter(String str, char charToReplace, char replacementChar) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charToReplace) {
                charArray[i] = replacementChar;
            }
        }

        return new String(charArray);
    }
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // String Str = sc.nextLine();
    // char charToReplace = 'a';
    // char replaceCharacter = '*';
    // for (int i = 0; i < Str.length(); i++) {
    // if (Str.charAt(i) == charToReplace) {
    // char(Str[i]) = replaceCharacter;
    // }
    // }
    // sc.close();
    // }
}
