package com.creditsystem.entity;

import java.util.List;
import java.util.Objects;

public class Client implements Comparable<Client>{
    private long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;
    private String address;
    private String phone;
    private List<Credit> credits;

    public Client(long id, String firstName, String lastName, Integer age, String sex, String address, String phone){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public int sumOfCredits(Client client){
        int sum = 0;
        for(Credit credit : client.getCredits()){
            sum += credit.getSum();
        }
        return sum;
    }


    @Override
    public String toString() {
        return "{\"_class\":\"Client\", " +
                "\"id\":\"" + id + "\"" + ", " +
                "\"firstName\":" + (firstName == null ? "null" : "\"" + firstName + "\"") + ", " +
                "\"lastName\":" + (lastName == null ? "null" : "\"" + lastName + "\"") + ", " +
                "\"age\":" + (age == null ? "null" : "\"" + age + "\"") + ", " +
                "\"sex\":" + (sex == null ? "null" : "\"" + sex + "\"") + ", " +
                "\"address\":" + (address == null ? "null" : "\"" + address + "\"") + ", " +
                "\"phone\":" + (phone == null ? "null" : "\"" + phone + "\"") +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(firstName, client.firstName) &&
                Objects.equals(lastName, client.lastName) &&
                Objects.equals(age, client.age) &&
                Objects.equals(sex, client.sex) &&
                Objects.equals(address, client.address) &&
                Objects.equals(phone, client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, sex, address, phone);
    }

    @Override
    public int compareTo(Client o) {
        int nameCompareResult = this.getFirstName().compareTo(o.getFirstName());
        if (nameCompareResult == 0){
            return Long.compare(this.getId(), o.getId());
        }
        return nameCompareResult;
    }
}
