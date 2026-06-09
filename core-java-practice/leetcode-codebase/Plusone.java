import java.util.*;

public class Plusone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        boolean allNine = true;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                allNine = false;
                break;
            }

            digits[i] = 0;
        }

        if (allNine) {
            int[] result = new int[n + 1];
            result[0] = 1;

            for (int x : result) {
                System.out.print(x + " ");
            }
        } else {
            for (int x : digits) {
                System.out.print(x + " ");
            }
        }

        sc.close();
    }
}