public class Fibonacci {

    // Metod za generisanje Fibonacci matrice
    public static int[][] generateFibonacciMatrix(int N) {
        // Proveri da li je N pozitivan broj
        if (N <= 0) {
            throw new IllegalArgumentException("Dimenzija matrice mora biti pozitivan broj.");
        }

        // Inicijalizacija matrice
        int[][] matrix = new int[N][];

        // Kreiranje Fibonacci niza
        int[] fibonacciSequence = new int[N];
        if (N > 0) {
            fibonacciSequence[0] = 1;
        }
        if (N > 1) {
            fibonacciSequence[1] = 1;
        }
        for (int i = 2; i < N; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        // Popunjavanje matrice
        for (int i = 0; i < N; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = fibonacciSequence[j];
            }
        }

        return matrix;
    }

    // Glavni metod za testiranje
    public static void main(String[] args) {
        int N = 5; // Primer vrednosti za N
        int[][] fibonacciMatrix = generateFibonacciMatrix(N);

        // Štampanje matrice za proveru
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < fibonacciMatrix[i].length; j++) {
                System.out.print(fibonacciMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}