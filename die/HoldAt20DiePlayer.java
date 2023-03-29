/*
Strateji 1
Her turda
ya 1 gelene kadar 
yada tur skoru 20 yada büyük olana kadar 
yada alınan tur skoru ile toplam skorun toplamı 100 yada büyük olana kadar atmaya devam et
*/
public class HoldAt20DiePlayer implements DiePlayer 
{

   public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) 
   {

      if (turnTotal == 1)
         return false;

      else if (turnTotal < 20) 
      {
         myScore += turnTotal;
         return true;
      } 

      else if (myScore + turnTotal >= 100) 
      {
         return false;
      } 

      else
      return false;
   }

}
