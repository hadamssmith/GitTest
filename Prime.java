//NAME:Ajetunmobi Adam
// computation of prime number

import java.util.Scanner;

public class Prime {

    public static void main(String... args){
        
        int n,status=0;

        System.out.println("Enter the number: ");

        Scanner sc = new  Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%2==0)
                status = status+1;
        }
        if(status>2)
        {
            System.out.println("Number is not prime");

        }
        else
        {
            System.out.println("Number is Prime");
        }
    
    

        
    }
}