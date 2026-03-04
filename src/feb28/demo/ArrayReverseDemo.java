package feb28.demo;

public class ArrayReverseDemo {
    public static void main(String[] args) {

        int arr[] = {56, 43, 2323, 6, 53, 10};
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Array after reverse ");
        // for every integer num in the given array print that num
        for (int num : arr) {
            System.out.print(num + " " );
        }

    }
}
