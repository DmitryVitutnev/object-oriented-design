import builder.CottageBuilder;
import builder.HighriseBuilder;

public class Main {


    public static void main(String[] args) {

        CottageBuilder cb = new CottageBuilder();
        HighriseBuilder hb = new HighriseBuilder();

        System.out.println(cb.build());
        System.out.println(hb.build());


    }


}
