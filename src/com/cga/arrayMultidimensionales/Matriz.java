package com.cga.arrayMultidimensionales;

import java.util.Arrays;

public class Matriz {

    public static int[][] generarMatriz(int fila, int columna){
        int[][] matrizNum = new int[fila][columna];

        for (int i=0 ; i<fila; i++){
            for (int j=0 ; j<columna; j++){
                matrizNum[i][j] =  (int) (Math.random()*99) + 1;
            }
        }

        return  matrizNum;
    }

    public static void mostrarMatriz(int[][] matriz){

        for (int i=0 ; i<matriz.length; i++){
            System.out.println();
            System.out.print("[ ");
            for (int j=0 ; j<matriz[i].length; j++){
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.print("]");
        }
        
    }

    public static int[][] ordenarMatriz(int[][] matriz){

        int aux = Integer.MIN_VALUE;

        for (int i=0 ; i<matriz.length; i++){
            for (int j=0 ; j<matriz[i].length; j++)
                for(int k=i; k<matriz.length ; k++)
                    for(int l=j; l<matriz[i].length ; l++)
                        if (matriz[i][j] > matriz[k][l]){
                            aux = matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = aux;
                        }
        }
                

        /* for(int[] i: matriz){
            Arrays.sort(i);
        } */

        // System.out.println(Arrays.deepToString(matriz));
        // mostrarMatriz(matriz);

        return matriz;
    }

    public static void segundaColumna(int[][] matriz){

        for (int i = 0; i < matriz.length;i++){
            System.out.println(matriz[i][1] + "|");
        }
    }

    public static void main(String[] args) {
        
        int[][] matriz = generarMatriz(5, 6);
        // System.out.println(Arrays.deepToString(matriz));
        
        mostrarMatriz(matriz);
        System.out.println();
        ordenarMatriz(matriz);
        System.out.println();
        mostrarMatriz(matriz);
        System.out.println("\n");
        segundaColumna(matriz);

    }

    
}
