public class ModifyArrays
{
    IntOnlyArrayList intOnlyArrayList = new IntOnlyArrayList();

    public void GetListArrays()
    {
        intOnlyArrayList.get(0);
        System.out.println("Here is the array: " + intOnlyArrayList.toString());
    }

    public void ModifyAddListArrays()
    {
        intOnlyArrayList.add(1);
        intOnlyArrayList.add(2);
        intOnlyArrayList.add(4);
        intOnlyArrayList.add(8);
        System.out.println("Add value 1, 2, 4, 8 to the index 1, 2, 3, 4 in the array: " + intOnlyArrayList.toString());
    }

    public void ModifyRemoveListArrays()
    {
        intOnlyArrayList.remove(3);
        System.out.println("Remove value 4 at index 3: " + intOnlyArrayList.toString());
    }

    public void SeeSizeListArray()
    {
        intOnlyArrayList.size();
        System.out.println("What size is the array? " + intOnlyArrayList.toString());
    }

}
