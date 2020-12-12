package com.creditsystem;

import com.creditsystem.entity.Client;
import com.creditsystem.entity.Credit;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

class ClientTest {
    @Test
    void sumOfCredits() {
        List<Credit> allCredit = new ArrayList<>();
        allCredit.add(new Credit(50000, 2, 15));
        allCredit.add(new Credit(40000, 2, 15));
        Client client = new Client(678L, "Иван", "Иванов",25, "мужской", "г.Самара", "89999999");
        client.setCredits(allCredit);
        int sum = client.sumOfCredits(client);
        Assert.assertEquals(90000, sum);
    }
}