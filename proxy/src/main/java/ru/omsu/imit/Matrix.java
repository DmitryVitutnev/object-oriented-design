package ru.omsu.imit;

import java.util.Arrays;
import java.util.Objects;

public class Matrix implements IMatrix {

    private double[] array;
    private int size;

    public Matrix(int n){
        size = n;
        array = new double[size * size];
    }

    public Matrix(double ... args) {
        size = (int) Math.floor(Math.sqrt(args.length));
        array = new double[size * size];
        for(int i = 0; i < size*size; i++) {
            array[i] = args[i];
        }
    }

    public Matrix(IMatrix prototype) {
        size = prototype.getSize();
        array = new double[size * size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                setElem(prototype.getElem(i, j), i, j);
            }
        }
    }

    public double getElem(int row, int col) {
        return array[row * size + col];
    }

    public void setElem(double value, int row, int col) {
        array[row * size + col] = value;
    }

    private void plusRow(int targetRowIndex, int rowIndex, double multiplier) {
        for(int i = 0; i < size; i++) {
            setElem(getElem(targetRowIndex, i) + getElem(rowIndex, i) * multiplier, targetRowIndex, i);
        }
    }

    public double getDet() {
        Matrix m = new Matrix(this);

        for(int i = 0; i < m.size; i++) {
            if(m.getElem(i, i) == 0) {
                for(int j = i + 1; j < m.size; j++) {
                    if(m.getElem(j, i) != 0) {
                        m.plusRow(i, j, 1);
                        break;
                    }
                }
            }
            if(m.getElem(i, i) == 0) {
                return 0;
            }
            for(int j = i + 1; j < m.size; j++) {
                if(m.getElem(j, i) != 0) {
                    m.plusRow(j, i, -m.getElem(j, i) / m.getElem(i, i));
                }
            }
        }

        double ret = 1;

        for(int i = 0; i < m.size; i++) {
            ret *= m.getElem(i, i);
        }

        return ret;
    }

    public int getSize() {
        return size;
    }

    protected IMatrix getMinor(int row, int col){
        IMatrix minor = new Matrix(getSize() - 1);
        for(int i = 0; i < getSize() - 1; i++) {
            for(int j = 0; j < getSize() - 1; j++) {
                int r, c;
                if(i >= row) {
                    r = i + 1;
                }
                else {
                    r = i;
                }
                if(j >= col) {
                    c = j + 1;
                }
                else {
                    c = j;
                }
                minor.setElem(getElem(r, c), i, j);
            }
        }
        return minor;
    }

    public void transpose() {
        for(int i = 0; i < getSize(); i++) {
            for(int j = i + 1; j < getSize(); j++) {
                double x = getElem(i, j);
                setElem(getElem(j, i), i, j);
                setElem(x, j, i);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return size == matrix.size &&
                Arrays.equals(array, matrix.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}