package JavaMatices;

import java.util.Scanner; 

public class lowerTraingle {
    public static void main(String args[])
    {
        int a[][] = new int[5][5];
        System.out.println("Enter the order of your Matrics ");
        System.out.println("Enter the rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the columns:");
        int m = sc.nextInt();
        sc.close();
        if(n == m)
         {        
             System.out.println("Enter your elements:");
             Scanner ss = new Scanner(System.in);
              for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {      
 
                     a[i][j] = ss.nextInt();
                     System.out.print(" ");
                 }
                 ss.close();
            }
              System.out.println("You have entered:");
              for(int i=0; i<n; i++)
               {
                for(int j=0;j<n;j++)
                {      
                     System.out.print(a[i][j] + " ");
                 }
                System.out.println("");
               }
              System.out.println("The Lower Triangular Matrix is:");
              for(int i=0;i<n;i++)
               {
                for(int j=0;j<n;j++)
                 {
                  if(i>=j)
                   {
                     System.out.print(a[i][j] +" ");
                   }
                else
                {
                    System.out.print("0"+" ");
                } 
              }
            System.out.println("");
           }
        }
         else
        {
            System.out.println("you have entered improper order");
        }
   }
}
