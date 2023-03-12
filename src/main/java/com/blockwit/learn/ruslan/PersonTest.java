package com.blockwit.learn.ruslan;


public class PersonTest {

public static void main(String args[]) {

    Person person1 = new Person();
    person1.setNameAndAge("Роман", 40);
        String s1 = "Вова";
        Person person2 = new Person();
    person2.setNameAndAge(s1, 30);



  int year1 =   person1.calculaterYearsToRetierment();
    int year2 =  person2.calculaterYearsToRetierment();
person1.speak();
    person2.speak();


}


}

class Person {
String name;
int age;

int calculaterYearsToRetierment() {

    int years = 65 - age;
    return years;


}

void speak() {
    for (int i = 0; i < 3; i ++) {
        System.out.println("Меня зовут " + name + ", и мой возраст " + age + " лет");
    }
}

void sayHello() {
    System.out.println("Привет!");


}


void setNameAndAge(String userName, int userAge) {
    name = userName;
age = userAge;

}

}



