public class String_5 {
    // String Builder.
    public static void main(String[] args) {
        String sb = new String();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb += ch;
        }
        System.out.println(sb.toString() + "  ");
    }
}
