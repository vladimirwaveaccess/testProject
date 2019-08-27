package com.company.LS7OOP;

import java.util.Arrays;

public class MatrixDemo {
    public static void main(String[] args) {
        double[][] inputMatrix1 = {{2, 0, -1}, {0, -2, 2}};
        double[][] inputMatrix2 = {{4, 1, 0}, {3, 2, 1}, {0, 1, 0}};
        double[][] inputMatrix3 = {{1, -2, 3}, {0, 4, -1}, {5, 0, 0}};
        double[][] outputMatrix = new double[2][3];

        Matrix matrix1 = new Matrix(inputMatrix1, 2, 3);
        Matrix matrix2 = new Matrix(outputMatrix,2, 3);

        Matrix matrix3 = new Matrix(inputMatrix3,3, 3);
        Matrix matrix4 = new Matrix(inputMatrix3,3, 3);


        matrix2.setMatrix(matrix1.matrixMultiplicationByMatrix(inputMatrix2));
        matrix2.printMatrix();
        matrix4.setMatrix(matrix3.matrixMultiplicationByNumber(3));
        matrix4.printMatrix();

    }
}
