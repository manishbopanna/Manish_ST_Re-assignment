import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWeightConverter {
    private static WeightConverter wc;

    @BeforeClass
    public static void setup() {
        wc = new WeightConverter();
    }

    @Test
    public void test_kg_to_gms() {
        assertEquals(1000, wc.kg_to_grams(1));
    }

}
