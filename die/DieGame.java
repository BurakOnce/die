/*
Burak Once   burakonce9@gmail.com
Die Game
*/

public class DieGame {
    public static final int GOAL_SCORE = 100; 
    private int[] scores;

    

    public DieGame(DiePlayer[] players){
       
    }

    public int playTurn(DiePlayer p, int playerNum){
        int a1;
        Die d = new Die();
       do{
         a1 += d.nextRoll();

         if(a1==1){
            return 0;
        }
         userDiePlayer u = new userDiePlayer();
         u.isRolling(a1,a1,0,null);
  
       }while(!(d.nextRoll()==1));
       scores[0]=a1;
        return a1 ;
    }

    public int play(){
        int a1;
        Die d = new Die();
       do{
         a1 += d.nextRoll();

         if(a1==1){
            return 0;
        }
         userDiePlayer u = new userDiePlayer();
         u.isRolling(a1,a1,0,null);
  
       }while(!(d.nextRoll()==1));
       scores[1]=a1;
        return a1 ;
    
    }

    
    public int getMaxScore(){
        if(scores[0]>scores[1])
        return scores[0] ;

        else 
        return scores[1];
}

    public void printScores(){
System.out.println("1.oyuncu skoru" + scores[0] +  "\n2.oyuncu skoru" + scores[1]);
}

}
