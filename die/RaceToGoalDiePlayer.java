/*
Strateji 3
oyuncunun toplam skoru tsi olsun,  maxTS de tüm oyuncular arasındaki maksimum toplam skor olsun.
Eğer  tsi >= 71 yada maxTS >= 71, toplam 100’ü bulana (yani oyunu kazanana) kadar atmaya devam et.
Diğer durumlarda
tur skoru >= 21 +  round((maxTS - tsi) / 8), olana kadar 
yada tur skoru ile toplam skorun toplamı 100 yada büyük olana kadar atmaya devam et.
*/
public class RaceToGoalDiePlayer implements DiePlayer {
    
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
    {
      

        if (turnTotal < 71) 
        {
        myScore += turnTotal;
        return true;
        } 

        else if ((myScore >= 71 && maxScore >=71) && myScore <= 100)
        {
        myScore += turnTotal;
        return true;
        } 

        else if (myScore == 100)
        {
        return false;
        } 

        else
        return false;

                 if (turnTotal < 21 + round(maxScore - turnTotal)/2){
                 myScore += turnTotal;
                 return true; 
                 }

                 else if (myScore == 100)
                 {
                 return false;
                 } 

                 else
                 return false;
}

}
