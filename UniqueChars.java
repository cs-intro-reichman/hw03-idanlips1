/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string,
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String unique = "";
        boolean duplicate;
        char temp;
        int index;

        for (int i = 0; i < s.length(); i++) {
            duplicate = false;

            if (s.charAt(i) != ' ') {
                index = s.indexOf(s.charAt(i));
                temp = s.charAt(index);

                if ((s.charAt(i) == temp) && (i != index))
                    duplicate = true;
            }

            if (!duplicate)
                unique += s.charAt(i);
        }

        return unique;
    }
}
