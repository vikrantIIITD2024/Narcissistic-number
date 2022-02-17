import java.util.Arrays;
import java.util.Scanner;


public class narcissistic_number{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int f = 0;
        int length_of_an_integer = counter(a); 
        int ans = solve(a,f,length_of_an_integer);
        if(ans == a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
    public static int counter(int a)
    {
        int count = 0;  
        while(a != 0)  
        {  

            a = a / 10;  

            count = count + 1;  
        }  
        return count;  
    }
    public static int solve(int a, int f, int length_of_an_integer){
        if(a ==0){
            return f;
        }
        f = f + (int) Math.pow(a%10, length_of_an_integer);
        return solve(a/10, f, length_of_an_integer);
    }
}

