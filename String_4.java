public class String_4 {

    public static void largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int i = nums.length - 1; i >= 0; i--) {
            sb.append(nums[i]);
        }
        System.out.println(sb.toString());

        String str = "";
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                System.out.println(sb.charAt(i));
                str += sb.charAt(i);
            } else if (sb.charAt(i) == '0') {
                count++;
            }
        }
        int j = 1;
        while (j <= count) {
            str += '0';
            j++;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        // int nums[] = { 3, 30, 34, 5, 9 };
        // int nums[] = { 10, 2 };
        int nums[] = { 432, 43243 };

        largestNumber(nums);
        // System.out.println("The string is : " + str);
    }
}
