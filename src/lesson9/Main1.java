package lesson9;

public class Main1 {
    public static void main(String[] args) {
        double[][] forMatrix1 = { {3, 6, 4},
                                  {4, 7, 3},
                                  {4, 3, 4},
                                  {2, 6, 1}, };

        double[][] forMatrix2 = { {6, 1, 1},
                                  {3, 5, 0},
                                  {9, 7, 8},
                                  {2, 5, 0}, };

        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);

        IMatrix matrixAdd  = matrix1.add(matrix2);
        matrixAdd.printToConsole();





    }
}
