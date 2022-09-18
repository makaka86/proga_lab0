package ru.itmo.prog.samples;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        long[] arrayX = new long[13];
        float[] arrayC = new float[10];
        double[][] arrayA = new double[13][10];
        int i = 0;
        int m = 25;

        while (i < 13) {
            arrayX[i] = m;
            i++;
            m -= 2;
        }

        System.out.println(Arrays.toString(arrayX));
        System.out.println();

        for (int k = 0; k < 10; k++)
            arrayC[k] = genRandFloat();

        System.out.println(Arrays.toString(arrayC));
        System.out.println();


        for (int idx = 0; idx < arrayA.length; idx++)
            for (int j = 0; j < arrayA[idx].length; j++)
            {
                if (arrayX[idx] == 15)
                    arrayA[idx][j] = Math.pow((Math.cos(Math.pow((j / 2), j)) / 2), (Math.pow(((Math.pow((j * (j + 1)), 2) - 4) / (Math.cos(j))), 3)));
                else if (arrayX[idx] == 7 | arrayX[idx] == 9 | arrayX[idx] == 11 | arrayX[idx] == 17 | arrayX[idx] == 23 | arrayX[idx] == 25)
                    arrayA[idx][j] = Math.pow((1 - (Math.cos(Math.exp(Math.abs(j))))) / (Math.exp(Math.pow(Math.E ,j))) , 3);
                else
                    arrayA[idx][j] = Math.pow( (0.25 + Math.pow(Math.PI * Math.pow( 2 / (Math.pow(0.25 * (j - 0.25) ,j) + 2) , 2),3)) / (Math.pow( ( ( (Math.cbrt(Math.cbrt(j)) + 1) / 2) / 3),Math.exp(Math.pow(Math.cos(j) , 2)))), 2);
            }
        printArrA(arrayA);
    }

    public static float genRandFloat()
    {
        Random random = new Random();
        return random.nextFloat() * (13 - (-9)) + (-9);
    }

    public static void printArrA(double[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int v = 0; v < arr[i].length; v++)
                System.out.printf("%.4f ",arr[i][v], " ");
            System.out.println();
        }
    }
}
