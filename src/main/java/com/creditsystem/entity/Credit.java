package com.creditsystem.entity;

public class Credit {
    private int sum;
    private int time;
    private double percent;
    public Credit(int sum, int time, double percent){
        this.percent = percent;
        this.time = time;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "sum=" + sum +
                ", time=" + time +
                ", percent=" + percent +
                '}';
    }
}
