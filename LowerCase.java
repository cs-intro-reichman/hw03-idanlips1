/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(lowerCase(str));
       
    }

    public static String lowerCase(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (curChar == ' ') {
                newString += ' ';
            } else if (curChar >= 'A' && curChar <= 'Z') {
                newString += (char) (curChar + 32);
            } else {
                newString += curChar;
            }
        }
        return newString;
    }
}
