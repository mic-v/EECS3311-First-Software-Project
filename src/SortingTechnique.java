import java.util.Collections;
import java.util.List;

public class SortingTechnique {
    /**
     * Bubble sort a generic list
     * @param list
     * @param <E>
     */
    public static <E extends Comparable <? super E>> void sorts (List<E> list)
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
    public static void bubbleSort(List<Shape> list) {
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = 0; j < list.size() - i - 1; j++)
            {
                if(list.get(j).compareTo(list.get(j + 1)) > 0)
                {
                    Point pos1 = list.get(j).getPos();
                    Point pos2 = list.get(j+1).getPos();
                    System.out.println("Pos1: " + pos1.x + " " + pos1.y);

                    System.out.println("Pos2: " + pos2.x + " " + pos2.y);


                    Collections.swap(list, j, j+1);
                    list.get(j).setPosition(pos1);
                    list.get(j + 1).setPosition(pos2);

                    System.out.println("Pos1: " + pos1.x + " " + pos1.y);

                    System.out.println("Pos2: " + pos2.x + " " + pos2.y);
                    /*
                    list.set(j, list.get(j + 1));
                    list.get(j + 1).setPosition

                    list.set(j + 1, temp);
                    list.get(j + 1).setPosition(temp.getPos());

                     */
                }
            }
        }
    }
}
