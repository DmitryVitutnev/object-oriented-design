package ru.omsu.imit;

public class Main {

    public static void main(String[] args) {
        IMatrix matrix = new Matrix(1, 2, 3, 4, 5, 6, 7, 8, 10);

        matrix = new CashedMatrix(matrix);

        System.out.println(matrix.getDet());
        System.out.println(matrix.getDet());

        matrix.setElem(0, 2, 2);

        System.out.println(matrix.getDet());
        System.out.println(matrix.getDet());

    }

}
