import java.util.Arrays;

public class Matrica {
    public static void main(String[] args) {


        int a[][] = {
                {5,9},
                {2,6}
        };
        int b[][] = {
                {3,5},
                {0,5}
        };

        int ab[][] = new int[2][2];


        int sum = 0;
        for (int i = 0; i<2; i++)
        {
            for (int j=0; j<2; j++)
            {
                for (int k=0; k<2; k++)
                {
                    sum = sum + a[i][k] * b[k][j];
                }
                ab[i][j] = sum;
            }
        }
        for (int i=0;i<2;i++)
        {
            for (int j=0; j<2; j++)
            {
                System.out.print(ab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
