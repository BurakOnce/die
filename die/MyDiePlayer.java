/*
Strateji 4
Her turda
ya 1 veya 6 gelene kadar 
yada tur skoru 13 yada büyük olana kadar 
yada alınan tur skoru ile toplam skorun toplamı 33 yada büyük olana kadar atmaya devam et
*/ 
public class MyDiePlayer implements DiePlayer {
    
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
    {
        if (turnTotal == 1 && turnTotal == 6)
        return false;

        else if (turnTotal < 13) 
        {
        myScore += turnTotal;
        return true;
        } 

        else if (myScore + turnTotal >= 33)
        {
        return false;
        } 

        else
        return false; 
    }

}
