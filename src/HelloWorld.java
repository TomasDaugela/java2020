import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {

        int i;
        long l;
        short s;
        byte b;

        float f;
        double d;

        boolean boo = true;
        boolean boo2 = 2 > 3;
        boolean boo3 = boo && (boo2 && 10<9);

        char c = '\u2655'; //karuna
        String text = "Afrika '\u2655' \n ir \t Europa \\Azija \"Microsoft\"";

        System.out.println("123"+4);
        System.out.println(boo2);
        System.out.println(boo3);
        System.out.println(text);

        System.out.println("As");
        System.out.println("kate");

        // textNieko =
        String textNieko = null;
        Date data = null;

        //priskirimai

        int i1 = 100;
        int i2 = i1;
        i=200;
        System.out.println(i2);

        int[] i3 = {10, 20, 30};
        int[] i4 = i3;
        i3[0] = 9;

        for (int index = 0; index < i4.length; index++) {
            System.out.print(i4[index]+" ");
        }
        System.out.println();

        int[] i5 = new int [3];
        i5[2] = 99;
        for (int index = 0; index < i4.length; index++) {
            System.out.print(i5[index]+" ");
        }
        System.out.println();

        int[][] m1 = {
                {10,11,12}, //m1[0]
                {22,23,24}, //m1[1]
                {5,10,15,20} //m1[2]
        };
        System.out.println("m1 masyvo ilgis yra: " + m1.length);
        for(int eilutesIndex = 0; eilutesIndex < m1.length; eilutesIndex++){
            //atspausdinti eilute
            int[] eilute = m1[eilutesIndex];
            for (int stulepelioIndex = 0; stulepelioIndex < eilute.length; stulepelioIndex++){
                System.out.print(eilute[stulepelioIndex]+ " ");
            }
            System.out.println();
        }
        System.out.println("------------");

        int[]m2 = m1[1];
        int m23 = m2[2]; //24
        m23= m1[1][2]; //24

        int[][] m3 = new int[3][];
        m3[0] = new int [10];
        m3[1] = new int [5];
        m3[2] = new int [2];

        m3[2][1] = 10;

        //for each ciklas
        for(int[] eilute : m1){
            for(int elem : eilute){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        //while
        int ind = 3;
        while(--ind > 0){
            System.out.println(Math.random());

            //

        }

        int a1 = 10;
        //       1 + 11(a1=11) + 11(a1=12)
        int a2 = 1 + ++a1 + a1++;
        System.out.println("a1="+ a1 + " a2=" + a2);


        long Grudai = 1;
        for (int langeliai = 2; langeliai <= 64; langeliai++) {
            Grudai = Grudai * 2;
            System.out.println("langelis" + langeliai + " Grudu Skaicius= " + Grudai);
        }
    }
}
