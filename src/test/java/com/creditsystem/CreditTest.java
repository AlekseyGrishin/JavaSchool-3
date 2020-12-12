package com.creditsystem;

import com.creditsystem.entity.Credit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CreditTest {


    public int sum;

    @Before
    public int getSum() {
        return sum;
    }

    @Test
    void repayCredit() {
        Credit credit = new Credit(50000,15,5);
        sum = credit.getSum();
        int enterSum = 5000;
        int amount = sum - enterSum;
        Assert.assertEquals(45000, amount);
    }
}