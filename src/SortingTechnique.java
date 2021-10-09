import java.util.Collections;
import java.util.List;

/**
 * Specific sorting class for Shapes
 * Specific sorting implementation for DisplayShapes application
 * that sorts Shapes within in a list
 */
public class SortingTechnique {
    /**
     * Bubble sort a generic list
     * @param list
     * @param <E>
     */
    public static <E extends Comparable <? super E>> void testSorts (List<E> list)
    {
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = 0; j < list.size() - i - 1; j++)
            {
                if(list.get(j).compareTo(list.get(j + 1)) > 0)
                {
                    Collections.swap(list, j, j+1);
                }
            }
        }
    }

    /**
     * Bubble sort for a shape list
     * @param list
     */
    public static void sort(List<Shape> list) {
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = 0; j < list.size() - i - 1; j++)
            {
                if(list.get(j).compareTo(list.get(j + 1)) > 0)
                {
                    Point pos1 = list.get(j).getPosition();
                    Point pos2 = list.get(j+1).getPosition();


                    Collections.swap(list, j, j+1);
                    list.get(j).setPosition(pos1);
                    list.get(j + 1).setPosition(pos2);
                    

                }
            }
        }
    }
}
