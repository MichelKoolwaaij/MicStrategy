package demo.rekenen;

/**
 * Created by Michel Koolwaaij on 13-11-19.
 */
public class Rekenaar {
    public int bereken(int[] getallen, BerekenStrategie strategie) {
        int totaal=getallen[0];

        for (int i=1; i<getallen.length;i++){
            totaal = strategie.bereken(getallen[i], totaal);
        }
        return totaal;
    }
}
