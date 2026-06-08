import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String a = Integer.toString(number);
        String rev = "";

        for (int i = 0; i < a.length(); i++) {
            rev = a.charAt(i) + rev;
        }

        if (rev.equals(a)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}