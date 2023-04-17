package com.blockwit.learn.ruslan.TestJavaRush;

public class ThomasEdisonPhone extends AbstractPhone {


    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер телефона, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");

    }
}
