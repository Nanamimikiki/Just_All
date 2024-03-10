package random;

public class BinarySearch {
    int binarySearch(int[] array, int x){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int middle = start + (end - 1) / 2;
            if(array[middle] == x){
                return middle;
            }
            if(array[middle] < x){
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
