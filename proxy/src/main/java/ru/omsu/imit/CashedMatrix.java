package ru.omsu.imit;

public class CashedMatrix implements IMatrix {
    private IMatrix matrix;
    private double cash;
    private boolean cashIsRight = false;

    public CashedMatrix(IMatrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getSize() {
        return matrix.getSize();
    }

    @Override
    public double getElem(int row, int col) {
        return matrix.getElem(row, col);
    }

    @Override
    public void setElem(double value, int row, int col) {
        matrix.setElem(value, row, col);
        cashIsRight = false;
    }

    @Override
    public double getDet() {
        if(cashIsRight) {
            System.out.println("Get value from cash");
            return cash;
        }
        cash = matrix.getDet();
        cashIsRight = true;
        return cash;
    }

    @Override
    public void transpose() {
        matrix.transpose();
    }
}
