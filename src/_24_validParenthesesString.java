import java.util.*;

public class _24_validParenthesesString {

    public static boolean isValid(String s){
        int n = s.length();
        int minOpen = 0,maxOpen = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('){
                minOpen++;
                maxOpen++;
                System.out.println(c+" minOpen: "+minOpen+"maxOpen: "+maxOpen);
            }else if(c==')'){
                minOpen--;
                maxOpen--;
                System.out.println(c+" minOpen: "+minOpen+"maxOpen: "+maxOpen);
                // ()()(())
            }else if(c=='*'){
                minOpen--;
                maxOpen++;
                System.out.println(c+" minOpen: "+minOpen+ " maxOpen: "+maxOpen);
            }
            if(maxOpen<0) return false;
            if(minOpen<0) minOpen = 0;
        }
        return minOpen == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s)?"This is valid string.":"This is not valid string.");

    }
}
