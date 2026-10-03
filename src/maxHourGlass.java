import java.util.Scanner;

public class maxHourGlass {

    public static int maxHG(int[][] arr,int r, int c){
        int res = Integer.MIN_VALUE;
        if(r<3||c<3) return res;
        for(int i=0;i<r-2;i++){
            for(int j=0;j<c-2;j++){
                int sum = arr[i][j] + arr[i][j+1]+arr[i][j+2]
                                    + arr[i+1][j+1]
                         +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                res = Math.max(res, sum);
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows ans columns: ");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int res = maxHG(arr,r,c);
        System.out.print(res);
    }
}
