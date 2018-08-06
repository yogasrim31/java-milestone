import java.util.Scanner;
public class Main7
{
    public static void main(String[] args) 
    {
        int i,p, min;
        Scanner s = new Scanner(System.in);
        int a[] = new int[6];
        System.out.println("Enter the elements in the array :");
        for(i = 0; i < 6; i++)
        {
            p = s.nextInt();
            if(p >= 0)
            a[i] = p;
            else 
            {
            System.out.println("Enter only positive numbers");
            i--;
            }
        }
        System.out.println("The elements in the array are :");
        for(i = 0; i < 6; i++)
        {
        System.out.println(a[i]);
        }
        System.out.print("\nThe smallest element in the array  is ");
         min = a[0];
        for(i = 0; i < 6; i++)
        {
           if(a[i] < min)
           {
             min = a[i]; 
           }
        }
        System.out.print(min + " and the number less than " + min + " is " );
        if(min==0)
            System.out.print("0");
        else
        System.out.print(min-1);
        }            
}