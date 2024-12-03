import java.util.Scanner;

public class arrayBidimensional {
    public static void main(String[] args) {
        arrayBidimensional prog = new arrayBidimensional();

        Scanner sc = new Scanner(System.in);

        int numeroUsuari;
        int[] array1;
        int[] array2;
        int[][] arrayTotal;

        System.out.print("Dona'm el tamany del primer array: ");
        numeroUsuari = sc.nextInt();
        array1 = new int[numeroUsuari];
        prog.omplirArray(array1, 100);
        prog.printarArray(array1);

        System.out.print("Dona'm el tamany del segon array: ");
        numeroUsuari = sc.nextInt();
        array2 = new int[numeroUsuari];
        prog.omplirArray(array2, 100);
        prog.printarArray(array2);

        if (array1.length > array2.length) {
            arrayTotal = new int[2][array1.length];
        } else {
            arrayTotal = new int[2][array2.length];
        }

        for (int i = 0; i < arrayTotal[0].length; i++) {
            if ((array1.length - 1) >= i) {
                arrayTotal[0][i] = array1[i];
            } else {
                arrayTotal[0][i] = 0;
            }

            if ((array2.length - 1) >= i) {
                arrayTotal[1][i] = array2[i];
            } else {
                arrayTotal[1][i] = 0;
            }
        }

        sc.close();
    }

    public int[] omplirArray(int[] matriu, int maxim) {
        for (int i = 0; i < matriu.length; i++) {
            matriu[i] = (int) (Math.random() * (maxim + 1));
        }

        return matriu;
    }

    public void printarArray(int[] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(matriu[i] + " ");
        }
        System.out.println(" ");
    }

    public void printarArray(int[][] matriu){
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[0].length; j++) {
                System.out.println(matriu[i][j]+" ");                
            }            
        }
    }
}
