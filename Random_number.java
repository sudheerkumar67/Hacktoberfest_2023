import java.util.*;
import java.util.Random;
class Game
    {
        private int num,n,over=0;
        Game()
        {
            Random r=new Random();
            num=r.nextInt(101);
        }
        void get()
        {
            do
            {
                System.out.println("Guess the no :-");
                Scanner sc=new Scanner (System.in);
                n=sc.nextInt(); 
                if(num==n)  
                {
                    System.out.println("Guessed number is correct !!"); over=1;
                }
                else if(num>n)  System.out.println("Guessed number is less than the actual one !!");
                else System.out.println("Guessed number is more than the actual one !!");
            } while(over==0);
        }
    }
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Generating random no...");
		Game obj=new Game();
		obj.get();		
	}
}
