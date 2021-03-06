import java.util.Arrays;

public class IntOnlyArrayList
{
    /**
     * Private empty arrays
     */
    private int[] listOfNumbers = new int [0];
    private int[] listOfNumbers2 = new int [0];

    /**
     * Default constructer
     */
    public IntOnlyArrayList()
    {

    }

    /**
     * Public get method that is called by GetListArrays() and returns the array
     * @param index
     * @return listOfNumbers
     */
    public int[] get(int index)
    {
        listOfNumbers2 = new int [listOfNumbers.length + 1];

        for(int i = 0; i < listOfNumbers.length; i++)
        {
            listOfNumbers2[i] = listOfNumbers[i];
        }
        listOfNumbers2[listOfNumbers.length] = index;

        listOfNumbers = listOfNumbers2;
        return listOfNumbers;
    }

    /**
     * Public add method that adds an element(value) to the array.
     * You need to make a new array with an extra index and
     * copy the old array with elements + the new element to the new array
     * @param value
     */
    public void add(int value)
    {
        listOfNumbers2 = new int[listOfNumbers.length + 1];
        for(int i = 0; i < listOfNumbers.length; i++)
        {
            listOfNumbers2[i] = listOfNumbers[i];
        }
        listOfNumbers2[listOfNumbers2.length - 1] = value;

        listOfNumbers = listOfNumbers2;
    }

    /**
     * Public remove method that removes a specific index from the array.
     * You need to make a new array that do not have that specific index and
     * copy the old array with elements - the element that should be removed to the new array.
     * There needs to be a try-catch around if there would be asked to remove an index that do
     * not exist in the old array
     * @param index
     */
    public void remove(int index)
    {
        listOfNumbers2 = new int[listOfNumbers.length - 1];
        int newIndex = 0;

        try
        {
            for(int i = 0; i < listOfNumbers.length; i++)
            {
                if (index != i)
                {
                    listOfNumbers2[newIndex] = listOfNumbers[i];
                    newIndex++;
                }
            }
            listOfNumbers = listOfNumbers2;
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
    }

    /**
     * Array has length() that do the same as ArrayList size()
     * https://www.geeksforgeeks.org/difference-between-length-of-array-and-size-of-arraylist-in-java/
     * @return listOfNumbers.length
     */
    public int size()
    {
        return listOfNumbers.length;
    }

    @Override
    public String toString()
    {
        return listOfNumbers.length + Arrays.toString(listOfNumbers);
    }
}
