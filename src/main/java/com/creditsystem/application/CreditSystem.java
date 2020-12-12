package com.creditsystem.application;

import com.creditsystem.entity.Client;
import com.creditsystem.entity.Credit;

import java.util.List;

public class CreditSystem {

    private int sum;
    private List<Credit> credits;

    public int getCredit(Client client){
        return sum;
    }

    public int repayCredit(Credit credit, int enterSum){
        int amount = sum - enterSum;
        System.out.println("Вы внесли " + enterSum + " руб, оставшаяся сумма - " + amount);
        return amount;
    }

}
