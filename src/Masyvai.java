import java.util.Arrays;

public class Masyvai {
    public static void main(String[] args) {
        int masyvas[] = {3, 45 ,45 ,1 ,-5 ,64, 145,199,66,14,-12,54,15};

        int maziausias = masyvas[0];
        int didziausias = masyvas[0];

        for (int i=0; i<masyvas.length; i++){
            if (masyvas[i]< maziausias) maziausias = masyvas[i];
            if (masyvas[i] > didziausias) didziausias = masyvas[i];
        }
        System.out.println(Arrays.toString(masyvas) + " maziausias skaicius yra " + maziausias + " ,o didziausias " + didziausias);
    }
}
