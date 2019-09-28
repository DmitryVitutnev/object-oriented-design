package ru.imit.omsu;

public class StringWorker {

    private StringBuilder sb;

    public StringWorker() {
        sb = new StringBuilder();
    }


    public String repeatString(String s, int number) {
        sb.delete(0, sb.length());
        for(int i = 0; i < number; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public String concatStrings(String... strings) {
        sb.delete(0, sb.length());
        for(int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }



}
