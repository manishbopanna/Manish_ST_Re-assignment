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
        assertEquals(100, wc.kg_to_grams(1));
    }

    @Test
    public void test_gms_to_mg() {
        assertEquals(100, wc.grams_to_mg(1));
    }

    @Test
    public void test_pds_to_kg() {
        assertEquals(20, wc.pds_to_kg(1));
    }
}