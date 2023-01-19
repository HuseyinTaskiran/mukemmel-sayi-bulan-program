import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, t;
        int val = 0;

        System.out.print("Bir sayı gir : ");
        n = inp.nextInt();
        t = n-1;
        while (t > 0) {
            if (n % t == 0) {
                val += t;
            }
            t-=1;
        }
        if (val == n) {
            System.out.println(n + " mükemmel bir sayıdır. " );
        } else {
            System.out.println(n + " mükemmel bir sayı değildir. " );
        }
    }
}







