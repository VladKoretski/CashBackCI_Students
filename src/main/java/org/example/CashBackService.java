package org.example;

public class CashBackService {

    public int cashBackCalculation(int purchaseAmount,boolean subscribed)
    {
        int bonus;
        if (subscribed)
        {
            bonus = (int) (purchaseAmount *  0.05);
        } else {
            bonus = (int) (purchaseAmount * 0.01);
        }
        if ( bonus > 1000) {
            bonus = 1000;
        }
        return bonus;
    }
}