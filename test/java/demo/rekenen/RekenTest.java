package demo.rekenen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by Michel Koolwaaij on 13-11-19.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RekenTest {
    private int[] getallen;
    private Rekenaar sut;

    @BeforeAll
    public void initTests(){
        getallen = new int[]{5,3,7,2,8,1,2};
        sut= new Rekenaar();
    }

    @Test
    public void testOptellen(){
        int totaal = sut.bereken(getallen, new Optellen());

        assertEquals(28,totaal);

    }

    @Test
    public void testHoogsteGetal(){
        int totaal = sut.bereken(getallen, new HoogsteGetal());

        assertEquals(8,totaal);

    }

    @Test
    public void testVermenigvuldigen(){
        int totaal = sut.bereken(getallen, new Vermenigvuldigen());

        assertEquals(3360,totaal);

    }

    @Test
    public void testLaagsteGetal(){
        int totaal = sut.bereken(getallen, new LaagsteGetal());

        assertEquals(1,totaal);

    }
}
