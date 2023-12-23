public class MainProgram {
 
    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, -2, 99, 3, 12};
    }
 
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
 
    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                return i;
            }
        }
        return -1;
    }
 
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] array = new int[table.length - startIndex];
 
        for (int i = startIndex, j = 0; i < table.length; i++, j++) {
            array[j] = table[i];
        }
        
        return indexOfSmallest(array) + startIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        System.out.println(array);
        for(int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(array);
        }             
    }
 
}