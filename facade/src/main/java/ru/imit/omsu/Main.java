package ru.imit.omsu;

public class Main {


    public static void main(String[] args) {

        StringWorker sw = new StringWorker();


        System.out.println(sw.repeatString("a", 10));

        String[] chars = new String[50];
        for(int i = 0; i < chars.length; i++) {
            chars[i] = "" + (char) (48 + i);
        }
        System.out.println(sw.concatStrings(chars));

    }





}
