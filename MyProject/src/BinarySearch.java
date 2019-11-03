import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = {4, 5, 8, 3, 9, 1, 2, 6};
        int target = 8;

        int size = arr.length;

        int result = binarySearch(arr, target);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
    //ARRAY HAS TO BE SORTED
    // Returns index of x if it is present in arr[], else return -1
    static int binarySearch(int arr[], int target) {

        Arrays.sort(arr);//must be sorted
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            var value = arr[mid];
            if (value == target)
                return mid;

            if (value < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        // if we reach here, then element was not present
        return -1;
    }

}
