package demo.rekenen;

/**
 * Created by Michel Koolwaaij on 13-11-19.
 */
public class HoogsteGetal implements BerekenStrategie {
    public int bereken(int getal1, int getal2) {
        return getal1>getal2 ? getal1 : getal2;
    }
}
