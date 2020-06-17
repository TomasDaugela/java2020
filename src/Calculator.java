import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Kalkuliatorius");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite Pirma Skaiciu: ");
        int pirmas = scanner.nextInt();

        System.out.println("Iveskite antra Skaiciu: ");
        int antras = scanner.nextInt();

        System.out.println("Iveskite Operacija:");
        String operacija = scanner.next();

        int rezultatas = skaiciavimas(operacija, pirmas, antras);
        System.out.println(pirmas + " " + operacija + " " + antras + " = "+ rezultatas);
    }

    //cia as galiu kurti kitas funkcijas
    static int skaiciavimas(String op, int p1, int p2){
        int rezultatas = 0;

        if (Objects.equals(op, "+")){
            rezultatas = p1 + p2;
        }else if (Objects.equals(op, "-")){
            rezultatas = p1 - p2;
        }else if (Objects.equals(op, "/")){
            rezultatas = p1 / p2;
        }else if (Objects.equals(op, "*")){
            rezultatas = p1 * p2;
        }else if (Objects.equals(op, "%")){
            rezultatas = p1 % p2;
        }
        return rezultatas;
    }
}
