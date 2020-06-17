package p08;

import java.util.Arrays;

public class MaxMinElementas {

    public static void main(String[] args) {
        int[] m = {-10, 2 ,0 ,2,25,1,100,5,14};
        System.out.println(Arrays.toString(m));

        sprendimas(m);

        atspausdintiMasyva(m);
    }

    static void sprendimas(int[] masyvas){
        int pirmaDidziausia = rastiPirmaDidziausia(masyvas);
        int pirmaMaziausia = rastiPirmaMaziausia(masyvas);

        sukeistiElementus(masyvas, pirmaDidziausia, pirmaMaziausia);
    }
    static void atspausdintiMasyva(int[] a)
    {
        System.out.println(Arrays.toString(a));
    }
    static int rastiPirmaDidziausia(int[] masyvas){
        int rastasIdeksas = 0;
        int rastaReiksme = masyvas[0];
        //
        for(int i = 1; i<masyvas.length; i++){
            if (masyvas[i] > rastaReiksme){
                rastasIdeksas = i;
                rastaReiksme = masyvas[i];
            }
        }

        return rastasIdeksas;
    }
    static int rastiPirmaMaziausia(int[] masyvas){
        int rastasIdeksas = 0;
        int rastaReiksme = masyvas[0];
        //
        for(int i = 1; i<masyvas.length; i++){
            if (masyvas[i] < rastaReiksme){
                rastasIdeksas = i;
                rastaReiksme = masyvas[i];
            }
        }

        return rastasIdeksas;

    }

    static void sukeistiElementus(int[] masyvas, int i,int j){
        int x = masyvas[i];
        masyvas[i] = masyvas[j];
        masyvas[j] = x;
    }
}
