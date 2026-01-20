import java.util.*;

public class StringCompression {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to compress: ");
        String input = sc.nextLine();

        String compressed = compressString(input);

        System.out.println("Original:   " + input);
        System.out.println("Compressed:    " + compressed);
        
        sc.close();
    }
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}