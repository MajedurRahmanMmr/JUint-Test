import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {


    @Test
    public void sumTwoInteger() {
        Operation oparation = new Operation();

        assertEquals(11, oparation.sumTwoInteger(5, 6));
        assertEquals(1, oparation.sumTwoInteger(-5, 6));

        assertEquals(0, oparation.sumTwoInteger(5, -6));
        assertEquals(0, oparation.sumTwoInteger(-15, -61));

    }
}
