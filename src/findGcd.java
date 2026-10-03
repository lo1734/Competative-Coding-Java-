import java.util.*;

public class findGcd {

    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int fun(int n, int[] arr){
        if(arr==null || arr.length==0) return 0;
        int res = arr[0];
        for(int i=1;i<n;i++){
            res = gcd(res, arr[i]);
            if(res == 1) return 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("original array: ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
        int res = fun(n,arr);
        System.out.println("Gcd of the array is: "+res);
    }

}


