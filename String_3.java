import java.util.Scanner;

public class String_3 {
    public static int length(String s) {
        int length = 0;
        for (char ch : s.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String name = sc.nextLine();

        int length = length(name);
        System.out.println("The length of string is : " + length);
        sc.close();
    }
}
