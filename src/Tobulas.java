import java.util.Scanner;

public class Tobulas {

    public static void main(String[] args) {
        int n =0;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Irasykite Skaicu:");
        n = s.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("Skaicius yra Tobulas");
        } else {
            System.out.println("Skaicius nera Tobulas");
        }
        return;
    }
}