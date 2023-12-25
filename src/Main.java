import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kombinasyon formülü
        // C(n,r) = n! / (r! * (n-r)!)

        int n, r, c, total = 1;

        Scanner scn = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        n = scn.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        r = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i >= r)
                total *= i;
        }

        c = total / (r * (n - r));
        System.out.println("C(" + n + "," + r + ") = " + c);
    }
}