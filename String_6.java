public class String_6 {
    // Compresed string
    public static String comprsed(String str) {
        String newS = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;

                i++;
            }
            newS += str.charAt(i);
            if (count > 1) {
                newS += count.toString();
            }
        }
        return newS;
    }

    public static void main(String[] args) {
        String s = "aaabbccccd";
        String str = comprsed(s);
        System.out.println("The comprsed string is : " + str);
    }
}
