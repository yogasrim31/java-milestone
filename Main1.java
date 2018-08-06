import java.util.Scanner;
public class Main1
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements in the array :");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("The elements in the array are :");
        for(int i = 0; i < n; i++)
        {
        System.out.println(a[i]);
        }
        System.out.print("\nThe elements divivsible by 3 are : ");
        for(int i = 0; i < n; i++)
        {
            if((a[i]%3)==0)
            {
             System.out.println(a[i]);
            }
        }
            System.out.print("NULL");
            
        }            
}