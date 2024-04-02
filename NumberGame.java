import java.util.*;
public class NumberGame {
    public static void main(String[] args) {        
        System.out.println("\nGuess the number between 1 to 100 ...!!\nAnd you have only 10 attempts to Guess the number");
        System.out.print("If you want to start Game please Press 1:");
        Scanner s=new Scanner(System.in);
        int permission=s.nextInt();
        if(permission==1)
        {
            guess_number(generate_random_num());
        }
    }

    static int generate_random_num()
    {
        Random r=new Random();
        int number=r.nextInt(100);
        return number;
    }

    static void guess_number(int number)
    {
       Scanner sc=new Scanner(System.in);
       int i=0;
       System.out.print("Guess the number:");
       while(i<10)
       { 
         int user_number=sc.nextInt();
         i++;
         if(number==user_number)
         { 
           System.out.println("\n==================================================================================");
           System.out.println("\t\tCongratulations.....\n\t\tYou have guessed the correct number in "+i+" attempts.\n\t\tYour Score:"+(100-((i-1)*10)));
           System.out.println("\n==================================================================================");
           break;
         }
         else if(number<user_number)
         {
           System.out.println("Number is smaller than entered number.("+(10-i)+"attempts remaining)");
         }
         else if(number>user_number)
         {
           System.out.println("Number is greater than entered number.("+(10-i)+"attempts remaining)");
         }
      
       }
       
       if(i==10)
       {
        System.out.print("You can't guess the number.\nNumber is "+number+".\nIf you want to try again please Press 1 :");
        int permission=sc.nextInt();
        if(permission==1)
        {
            guess_number(generate_random_num());
        }
        else
        {
            System.out.println("Thanks for playing the Game...");
        }
       }     
    }
}