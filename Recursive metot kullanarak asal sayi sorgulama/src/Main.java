import java.util.Scanner;
public class Main {

    static boolean asal(int n1) {

        boolean asalMi = true;

        if (n1 <= 1) {
            asalMi = false;
        } else {
            for (int i = 2; i < n1; i++) {
                if (n1 % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        }

        if (asalMi) {
            System.out.println(n1 + " bir asal sayıdır.");
        } else {
            System.out.println(n1 + " bir asal sayı değildir.");
        }

        return asalMi;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int n1 = scan.nextInt();

        System.out.println(asal(n1));







    }
}