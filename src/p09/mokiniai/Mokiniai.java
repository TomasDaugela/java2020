package p09.mokiniai;


import p09.mokiniai.Info;

public class Mokiniai {

    /*
        1. Vardas
        2. Pavarde
        3. Klase

    */
    static int mokiniuSkaicius =  5;
    static Info[] mokinys = new Info[mokiniuSkaicius];

    public static void main(String[] args) {

        Info mokinys1 = new Info();
        mokinys1.vardas = "Jonas";
        mokinys1.pavarde = "Jonaitis";
        mokinys1.klase = 1;
        mokinys[0] = mokinys1;

        Info mokinys2 = new Info();
        mokinys2.vardas = "Petras";
        mokinys2.pavarde = "Petrenas";
        mokinys2.klase = 2;
        mokinys[1] = mokinys2;

        Info mokinys3 = new Info();
        mokinys3.vardas = "Jurga";
        mokinys3.pavarde = "Jurgaite";
        mokinys3.klase = 2;
        mokinys[2] = mokinys3;

        Info mokinys4 = new Info();
        mokinys4.vardas = "Stanislovas";
        mokinys4.pavarde = "Stanislovicius";
        mokinys4.klase = 1;
        mokinys[3] = mokinys4;


        print(0);
        print(1);
        print(2);
        print(3);
    }

    static void print(int indeksas) {
        System.out.println(mokinys[indeksas].vardas + " " +
                mokinys[indeksas].pavarde + " " +
                mokinys[indeksas].klase);
    }
    static void perkeltiKlase(int indeksas) {
        mokinys[indeksas].klase = mokinys[indeksas].klase + 1;
    }


}

