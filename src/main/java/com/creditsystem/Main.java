package com.creditsystem;

import com.creditsystem.entity.Client;
import com.creditsystem.entity.Credit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Credit> allCredit = new ArrayList<>();
        allCredit.add(new Credit(50000, 2, 15));
        allCredit.add(new Credit(40000, 2, 15));
        Client client = new Client(678L, "Иван", "Иванов",25, "мужской", "г.Самара", "89999999");
        client.setCredits(allCredit);
        int sum = client.sumOfCredits(client);
        System.out.println("Данные клиента: " + client);
        System.out.println("Кредиты клиента: " + allCredit);
        System.out.println("Сумма всех кредитов равна = " + sum);

        // Сортировка по ID клиента
        List<Client> clients = new ArrayList<Client>();
        clients.add(new Client(178L, "Иван", "Иванов",25, "мужской", "г.Самара", "89999999"));
        clients.add(new Client(478L, "Иван", "Иванов",25, "мужской", "г.Самара", "89999999"));
        clients.add(new Client(378L, "Иван", "Иванов",25, "мужской", "г.Самара", "89999999"));
        Collections.sort(clients, (left, right) -> (int) (left.getId() - right.getId()));
        System.out.println(clients);

        // Сортировка по сумме кредитов
        Client clientIvanov = new Client(378L, "Иван", "Иванов",25, "мужской", "г.Самара", "89999999");
        List<Credit> allCreditIvanov = new ArrayList<>();
        allCreditIvanov.add(new Credit(50000, 2, 15));
        allCreditIvanov.add(new Credit(40000, 2, 15));
        clientIvanov.setCredits(allCreditIvanov);
        int sumOfCreditsIvanov = clientIvanov.sumOfCredits(clientIvanov);
        Client clientPetrov = new Client(678L, "Иван", "Петров",25, "мужской", "г.Самара", "89999999");
        List<Credit> allCreditPetrov = new ArrayList<>();
        allCreditPetrov.add(new Credit(35000, 2, 15));
        allCreditPetrov.add(new Credit(40000, 2, 15));
        clientPetrov.setCredits(allCreditPetrov);
        int sumOfCreditsPetrov = clientPetrov.sumOfCredits(clientPetrov);
        Client clientSidorov = new Client(478L, "Иван", "Сидоров",25, "мужской", "г.Самара", "89999999");
        List<Credit> allCreditSidorov = new ArrayList<>();
        allCreditSidorov.add(new Credit(10000, 2, 15));
        allCreditSidorov.add(new Credit(40000, 2, 15));
        clientSidorov.setCredits(allCreditSidorov);
        int sumOfCreditsSidorov = clientSidorov.sumOfCredits(clientSidorov);
        List<Integer> sortBySumCredit = new ArrayList<>();
        sortBySumCredit.add(sumOfCreditsIvanov);
        sortBySumCredit.add(sumOfCreditsPetrov);
        sortBySumCredit.add(sumOfCreditsSidorov);
        Collections.sort(sortBySumCredit, (left, right) -> (int) (left - right));
        System.out.println("Сортировка по сумме кредитов: " + sortBySumCredit);


        // Сортировка по по клиенту и сумме кредитов, где сортировка по ФИО приоритетнее
        System.out.println("Сортировка по по клиенту и сумме кредитов, где сортировка по ФИО приоритетнее:");
        TreeSet<Client> set = new TreeSet<>();
        set.add(new Client(178L, "Иван", "Иванов",25, "мужской", "г.Самара", "89999999"));
        set.add(new Client(278L, "Антон", "Петров",25, "мужской", "г.Самара", "89999999"));
        set.add(new Client(478L, "Александр", "Сидоров",25, "мужской", "г.Самара", "89999999"));
        set.add(new Client(378L, "Яков", "Голованов",25, "мужской", "г.Самара", "89999999"));
        for(Client client1 : set){
            System.out.println(client1);
        }
    }
}
