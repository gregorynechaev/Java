import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionalNumberTest {


    @Test
    void testSetValue() {
        FractionalNumber a = new FractionalNumber();
        a.setValue(43.565346);
        a.setDigitsAfterDot(3);
        assertEquals(a.getValue(), 43.565);
    }


    @Test
    void testRound() {
        FractionalNumber a = new FractionalNumber();
        a.setValue(4.7568756);
        assertEquals(a.rounding(2).getValue(), 4.76);
    }


    @Test
    void testMultiply() {
        FractionalNumber a = new FractionalNumber();
        FractionalNumber b = new FractionalNumber();
        a.setValue(6.4);
        b.setValue(43.565346);
        assertEquals(a.multiply(b).getValue(), 278.8182144);
    }


    @Test
    void testAdd() {
        FractionalNumber a = new FractionalNumber();
        FractionalNumber b = new FractionalNumber();
        a.setValue(5.02);
        b.setValue(4.54);
        b.setDigitsAfterDot(1);
        assertEquals(a.add(b).getValue(), 9.52);
    }

    @Test
    void testSubtract() {
        FractionalNumber a = new FractionalNumber();
        FractionalNumber b = new FractionalNumber();
        a.setValue(11.0);
        b.setValue(82.2);

        assertEquals(a.subtract(b).getValue(), -71.2);
    }


    @Test
    void testDivide() {
        FractionalNumber a = new FractionalNumber();
        FractionalNumber b = new FractionalNumber();
        a.setValue(20.333);
        b.setValue(100.0);

        assertEquals(a.divide(b).rounding(5).getValue(), 0.20333);
    }
}
