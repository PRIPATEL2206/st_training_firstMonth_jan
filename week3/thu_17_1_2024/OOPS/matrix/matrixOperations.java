package matrix;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class matrixOperations {

    private final double[][] data;

    public matrixOperations(int rows, int cols) {
        data = new double[rows][cols];
    }

    public void setData(int row, int col, double value) {
        data[row][col] = value;
    }

    public double getData(int row, int col) {
        return data[row][col];
    }

    public int getRowCount() {
        return data.length;
    }

    public int getColumnCount() {
        return data[0].length;
    }

    public matrixOperations add(matrixOperations other) {
        if (this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("matrixOperations dimensions must match");
        }

        matrixOperations result = new matrixOperations(data.length, data[0].length);
        ForkJoinPool.commonPool().invoke(new ParallelAdd(this.data, other.data, result.data, 0, data.length));
        return result;
    }

    private static class ParallelAdd extends RecursiveAction {
        private static final int THRESHOLD = 1000;

        private final double[][] a;
        private final double[][] b;
        private final double[][] result;
        private final int startRow;
        private final int endRow;

        ParallelAdd(double[][] a, double[][] b, double[][] result, int startRow, int endRow) {
            this.a = a;
            this.b = b;
            this.result = result;
            this.startRow = startRow;
            this.endRow = endRow;
        }

        @Override
        protected void compute() {
            if (endRow - startRow <= THRESHOLD) {
                for (int i = startRow; i < endRow; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        result[i][j] = a[i][j] + b[i][j];
                    }
                }
            } else {
                int mid = (startRow + endRow) / 2;
                ParallelAdd left = new ParallelAdd(a, b, result, startRow, mid);
                ParallelAdd right = new ParallelAdd(a, b, result, mid, endRow);
                invokeAll(left, right);
            }
        }
    }

    public static void main(String[] args) {
        matrixOperations matrixOperations1 = new matrixOperations(1000, 1000);
        matrixOperations matrixOperations2 = new matrixOperations(1000, 1000);

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                matrixOperations1.setData(i, j, i * j);
                matrixOperations2.setData(i, j, i + j);
            }
        }

   
        matrixOperations result = matrixOperations1.add(matrixOperations2);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(result.getData(i, j) + " ");
            }
            System.out.println();
        }
    }
}
