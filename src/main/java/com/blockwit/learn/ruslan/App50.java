package com.blockwit.learn.ruslan;

class Plane {

    int capacity;
    int speed;
    int range;





}


public class App50 {


    public static void main(String args[]) {

        Plane plane = new Plane();

        plane.capacity = 300;

        plane.speed = 10000;

        plane.range = 8000;


        System.out.println("У нас есть самолет, \nон вмещает "
                + plane.capacity + " пассажиров.\n" +
                "Макс. скорость: " + plane.speed +
                "\nМакс. дальность полета: " + plane.range);


    }

}

