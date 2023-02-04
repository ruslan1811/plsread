package com.blockwit.learn.ruslan;


//53. Написать класс животного. У него должны быть:
// дата рождения, цвет, название. Также написать метод,
// который возвращает сколько животному лет.



class Pet {
    int yearOfBirth;
    String color;
    String name;

    int calculateage (int date) {
        int age = 2023 - date;
        return age;


    }


}


public class App53 {


    public static void main (String args[]) {

        Pet pet = new Pet();
        pet.name = "Чебурашка";
        pet.color = "Коричневый";
        pet.yearOfBirth = 1966;



        pet.calculateage(pet.yearOfBirth);
        System.out.println(pet.calculateage(pet.yearOfBirth));


        }
}



