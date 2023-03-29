/* kullaniciya devam edip etmeyecegini soracak olan class */
import java.util.Scanner;
public class userDiePlayer implements DiePlayer{
    
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){

        System.out.println("Bu turdaki toplam skorun: " + turnTotal);
        System.out.println("Tamam mi Devam mi ?");

        Scanner scanner = new Scanner(System.in); 
        String s = scanner.nextLine(); 
        scanner.close();
            if(s.equals(""))
            {
            return true;
            }
            return false;           
    }
}

