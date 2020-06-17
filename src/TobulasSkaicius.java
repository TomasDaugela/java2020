import java.util.Scanner;

public class TobulasSkaicius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite Skaiciu: ");
        int maxSkaicius = scanner.nextInt();

        System.out.println("Iskome tobulu skaiciu nedidesniu uz " + maxSkaicius);

        long start = System.currentTimeMillis();

        int tikrinamasSkaicius = 1;
        while (tikrinamasSkaicius <= maxSkaicius){

            if(arSkaiciusTobulas(tikrinamasSkaicius)){
                System.out.println("Radau! " + tikrinamasSkaicius);
            }
            tikrinamasSkaicius += 1;
        }
        long stop = System.currentTimeMillis();

        System.out.println("vykdymo trukme: " + (stop - start) + "ms");
    }
    private static boolean arSkaiciusTobulas(int tikrinamasSkaicius){
        int suma = 0;

        for (int i = 1; i < tikrinamasSkaicius; i++){
            if(tikrinamasSkaicius % i ==0){
                suma +=i;
            }
        }

        if (suma == tikrinamasSkaicius) return true;
        else return false;
    }
}
