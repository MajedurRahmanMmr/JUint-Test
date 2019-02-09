import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Operation {
    public int sumTwoInteger(int i, int j) {
        int sum = (i + j);
        return sum < 0 ? 0 : sum;
    }


    public List<Integer> sortAndMakeUniqueItemList(List<Integer> asList) {

        if (asList.isEmpty()) {
            return asList;
        }

        if (asList.size() > 10) {
            throw new IndexOutOfBoundsException();
        }

        Collections.sort(asList);

        asList = asList.stream().distinct().collect(Collectors.toList());

        return asList;
    }
}
