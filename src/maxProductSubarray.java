import java.util.*;

public class maxProductSubarray {

    public static int maxSubArray(int[] arr){
        int n = arr.length;
        int res = Integer.MIN_VALUE, pre = 1, suf = 1;
        for(int i=0;i<n;i++){
//            if(arr[i]==0) pre = 1;
//            if(arr[n-i-1]==0) suf = 1;
            pre = pre*arr[i];
            suf = suf*arr[n-i-1];
            res = Math.max(res,Math.max(pre,suf));

        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = maxSubArray(arr);
        System.out.println("Max Product of subarray is "+res);
    }
}
