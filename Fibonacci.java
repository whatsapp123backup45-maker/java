import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, i, n;

        System.out.println("Enter the limit:");

        a = 0;
        b = 1;

        n = sc.nextInt();

        System.out.println("The Fibonacci Series is:");

        System.out.println(a);
        System.out.println(b);

        for (i = 0; i < n - 2; i++) {

            c = a + b;

            System.out.println(c);

            a = b;
            b = c;
        }

        sc.close();
    }
}
