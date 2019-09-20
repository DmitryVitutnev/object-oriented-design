package ru.omsu.imit;

public interface IMatrix {

    int getSize();
    double getElem(int row, int col);
    void setElem(double value, int row, int col);
    double getDet();
    void transpose();

}