package math.problems;

public class FindLowestDifference {
    public static void bubbleSort(int Array[]) {
        int a;
        //int Array[] = {0, 12, 34, 11, 55, 90, -1};
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - 1; j++) {
                if (Array[j] > Array[j + 1]) {
                    a = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = a;
                }
            }

        }
    }

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        bubbleSort(array1);
        bubbleSort(array2);
        if(array1[0]<array2[0]) System.out.print("the lowest difference is "+array1[0]+" from array1");
        else System.out.print("the lowest difference is "+array2[0]+" from array2");


    }

}