package p09;

import p09.Enums.Color;

import java.sql.SQLOutput;

public class EnumIntro {

    public static void main(String[] args) {
        System.out.println("Enum Intro");

        Color spalva = Color.Green;
        System.out.println("spalva= " + spalva);
        System.out.println("spalva.name= " + spalva.name());
        System.out.println("spalva.ordinal= " + spalva.ordinal());

        spalva = Color.Red;
        System.out.println("spalva= " + spalva);
        System.out.println("spalva.name= " + spalva.name());
        System.out.println("spalva.ordinal= " + spalva.ordinal());

        spalva = null;
        System.out.println("spalva= "+ spalva);

        String tekstas = null;
        System.out.println(tekstas ==null? "nieko" : tekstas);

        tekstas = "null";
        System.out.println(tekstas);
    }

}
