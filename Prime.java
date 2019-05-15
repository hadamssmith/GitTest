//NAME:Ajetunmobi Adam
// computation of prime number

import java.util.Scanner;

public class Prime {

    public static void main(String... args){
        
        int status=0;

        System.out.println("Enter the number: ");

        Scanner input = new  Scanner(System.in);
        int n = input.nextInt();
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0) {

               status = 1;
               break;
            }
        } if(status != 0 && n <= 1) {
            System.out.println("is not a prime number");
        }
            else 
            {
                System.out.println("is not a prime number");
            }
    
}
}