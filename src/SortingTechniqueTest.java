import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingTechniqueTest {
    @Test
    public void testBubbleSort() {
        ArrayList<Integer> testList = new ArrayList<>(List.of(4,5,3,2,1));
        SortingTechnique.testSorts(testList);
        assertEquals(testList.toString(), "[1, 2, 3, 4, 5]");


    }
}