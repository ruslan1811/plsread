package com.blockwit.learn.ruslan.TestJavaRush;

public class SomePhone {

    private int year;
    private String company;

    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;

    }

    private void openConnection() {

    }

    public void call() {
        openConnection();
        System.out.print("Вызываю номер");
    }


    public void ring() {
        System.out.println("Дзынь-дзынь");
    }



}
