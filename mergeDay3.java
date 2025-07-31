public class mergeDay3 {
    public static void mergeArrays(int[] masterArray, int[] data)
    {
        int countData = data.length;

        int startIndex =  masterArray.length - countData ; 

        for (int dataIndex =0 ; startIndex < masterArray.length ; startIndex++, dataIndex++)
        {
            masterArray[startIndex] = data[dataIndex];
        }
    }

    public static void printArray(int[] numbers)
    {
        for (int index=0; index < numbers.length; index++)
        {
            System.out.println(numbers[index]);
        }
    }

    static void invoke_mergeArrays()
    {
        int[] masterArray = { 1,2,3,0,0,0,0};
        //int[] masterArray = { 1,2,3};
        int[] data = {5,9,20,24};

        mergeArrays(masterArray, data);

        printArray(masterArray);
    }
}
