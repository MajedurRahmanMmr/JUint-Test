import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OperationTest {

    Operation operation = new Operation();

    @Test
    public void sumTwoInteger() {

        assertEquals(11, operation.sumTwoInteger(5, 6));
        assertEquals(1, operation.sumTwoInteger(-5, 6));

        assertEquals(0, operation.sumTwoInteger(5, -6));
        assertEquals(0, operation.sumTwoInteger(-15, -61));

    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void sortAndMakeUniqueItemListTest() {
        List<Integer> integerList = asList(1, -3, 4, -5, 6, -5);
        operation.sortAndMakeUniqueItemList(integerList);
        List<Integer> emtyList = new ArrayList<>();
        assertEquals(emtyList, operation.sortAndMakeUniqueItemList(emtyList));
        List<Integer> largeList = asList(1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 3);
        assertEquals(asList(1, 3, 5, 6), operation.sortAndMakeUniqueItemList(largeList));
        assertEquals(asList(-5, -3, 1, 4, 6), operation.sortAndMakeUniqueItemList(integerList));

    }
}
