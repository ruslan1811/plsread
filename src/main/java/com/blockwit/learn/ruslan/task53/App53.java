package com.blockwit.learn.ruslan.task53;

import com.blockwit.learn.ruslan.task53.Pet;

public class App53 {
    public static void main (String args[]) {

            com.blockwit.learn.ruslan.task53.Pet pet = new com.blockwit.learn.ruslan.task53.Pet();
            pet.name = "Чебурашка";
            pet.color = "Коричневый";
            pet.yearOfBirth = 1966;

            pet.calculateAge();
            System.out.println(pet.calculateAge());

        }
    }