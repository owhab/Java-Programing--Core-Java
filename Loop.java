import java.util.Scanner;

class Loop{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int f, l, sum;
        
        
        System.out.print("Please Enter the First Value: ");
        f = in.nextInt();
        
        System.out.print("Please Enter the Last Value: ");
        l = in.nextInt();
        
        sum = 0;
        
        for (int i = f; i <= l; i++)
        {
            System.out.println(i);
            sum = sum + i;
        }
        
        
        System.out.println("The Summation is: "+sum);
        
        
        
        
        
    }
}
