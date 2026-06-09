import java.util.Scanner;

public class SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;

        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {

            int digit = s.charAt(i) - '0';

            product *= digit;
            sum += digit;
        }

        return product - sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(subtractProductAndSum(n));

        sc.close();
    }
}