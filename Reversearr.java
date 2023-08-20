public class Reversearr {
    static void swapfn(int arr[], int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    static void printArr(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        printArr(arr, 5);
        System.out.println("reversed array");
        swapfn(arr, 0, 4);
        printArr(arr, 5);
    }
}