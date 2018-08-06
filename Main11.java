import java.util.Scanner;
public class Main11 
{
     public static void main(String[] args) 
     {
        int i,n,s=2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.print("Sum of even numbers upto " + n + " is : 2");
        for(i = 2; i <= n; i++)
        {
        a[i] = (2 * i);
        s = s + a[i];
        if(a[i]==n)
        {
        
        System.out.print(" = " + (s-n));
        break;
        }
        System.out.print(" + " + a[i]);
        }
     }
    }