import java.util.*;
import java.lang.*;
class Main 
{
    public static void main(String x[])
    {
        int a,k;
        Scanner sc=new Scanner(System.in);
        Random random= new Random();
        System.out.println("ENTER any number to play and 0 for exit");
        k=sc.nextInt();
        while(k!=0)
        {
            System.out.println("ENTER 1 FOR ROCK,2 FOR PAPER, 3 FOR SCISSOR");
            a=sc.nextInt();
            int i= random.nextInt(3)+1;
            if(i==a)
            System.out.println("TIE");
            if(i==1 && a==2)
            System.out.println(" YOU WIN, YOUR OPPONENT CHOSE ROCK");
             if(i==1 && a==3)
            System.out.println("YOU LOST, YOUR OPPONENT CHOSE ROCK");
             if(i==2 && a==3)
            System.out.println("YOU WIN, YOUR OPPONENT CHOSE PAPER");
             if(i==2 && a==1)
            System.out.println("YOU LOST, YOUR OPPONENT CHOSE PAPER");
             if(i==3 && a==1)
            System.out.println("YOU WIN, YOUR OPPONENT CHOSE SCISSOR");
             if(i==3 && a==2)
            System.out.println("YOU LOST, YOUR OPPONENT CHOSE SCISSOR");
            System.out.println("ENTER any number to play and 0 for exit");
        k=sc.nextInt();
        }
            
            
        }
        
    
}
