import java.util.Scanner;

public class blockSwap {

    public static void rev(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void rotateArray(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        rev(arr,0,k-1);
        rev(arr, k,n-1);
        rev(arr, 0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.print("rotate array with k value: ");
        int k = sc.nextInt();
        System.out.print("original array: ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
        rotateArray(arr,k);
        System.out.print("Rotated array: ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+ " ");
    }
}
