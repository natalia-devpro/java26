package lesson9;

public class Matrix implements IMatrix{
    private double[][] numbers;

    public Matrix(int rows, int cols){
        numbers = new double[rows][cols];
    }

    public Matrix(double[][] numbers){
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return this.numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if(this.getRows() <= rowIndex){
            System.out.println("У нас нет такого кол-ва строк!!!");
            return -1;
        }

        if(this.getColumns() <= colIndex){
            System.out.println("У нас нет такого кол-ва колонок!!!");
            return -1;
        }

        return this.numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if(this.getRows() <= rowIndex){
            System.out.println("У нас нет такого кол-ва строк!!!");
            return;
        }

        if(this.getColumns() <= colIndex){
            System.out.println("У нас нет такого кол-ва колонок!!!");
            return;
        }

        this.numbers[rowIndex][colIndex] = value;
    }


    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this -> matrix1
        // otherMatrix -> matrix2
        if(this.getRows() != otherMatrix.getRows()){
            System.out.println("Матрицы складывать нельзя! Кол-во строк не совпадает");
            return null;
        }

        if(this.getColumns() != otherMatrix.getColumns()){
            System.out.println("Матрицы складывать нельзя! Кол-во колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this.getColumns(); j++){
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this.getColumns(); j++){
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }

    }
}
