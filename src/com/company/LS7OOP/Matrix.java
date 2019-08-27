package com.company.LS7OOP;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    private double[][] matrix;
    private int row;
    private int column;

    public Matrix(double[][] matrix, int row, int column) {
        this.matrix = matrix;
        this.row = row;
        this.column = column;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return row == matrix1.row &&
                column == matrix1.column &&
                Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(row, column);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                ", row=" + row +
                ", column=" + column +
                '}';
    }

    public double[][] matrixSum(double[][] inputMatrix) {
        double[][] outputMatrix = new double[getRow()][getColumn()];

        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                outputMatrix[i][j] = getMatrix()[i][j] + inputMatrix[i][j];

            }
        }
        return outputMatrix;
    }

    public double[][] matrixMultiplicationByNumber(int number) {
        double[][] outputMatrix = new double[getRow()][getColumn()];

        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                outputMatrix[i][j] = getMatrix()[i][j] * number;
            }
        }
        return outputMatrix;
    }

    public void printMatrix() {

        for (int i = 0; i < getRow(); i++) {
            System.out.println(Arrays.toString(getMatrix()[i]));
        }
    }

    public double[][] matrixMultiplicationByMatrix(double[][] inputMatrix) {
        double[][] outputMatrix = new double[getRow()][getColumn()];
        double rez = 0;
        double prom1, prom2;
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                for (int k = 0; k < getColumn(); k++) {
                    prom1 = getMatrix()[i][k];
                    prom2 = inputMatrix[k][j];
                    rez += prom1 * prom2;
                }
                outputMatrix[i][j] = rez;
                rez = 0;
            }
        }
        return outputMatrix;
    }
}
