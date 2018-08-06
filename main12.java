import java.util.Scanner;
public class main12 
{
     public static void main(String[] args) 
     {
        int i = 1, n, a = 0, b = 1, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = in.nextInt();
          System.out.println("First " + n +" Fibonacci Nummbers are :");
        System.out.println(a);
        System.out.println(b);
        while (i <= n-2)
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }

    }
  }