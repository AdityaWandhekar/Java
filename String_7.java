public class String_7 {
    // largest String.

    public static String largest(String str[]) {
        String largest = str[0];

        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        String str[] = { "apple", "mango", "banana" };

        String large = largest(str);
        System.out.println("The largest string is : " + large);
    }
}
