package com.blockwit.learn.ruslan.TestJavaRush;

public class SmartPhone extends CellPhone{

    private String operationSystem;

    public SmartPhone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    public void install (String program) {
        System.out.println("Устанавливаю " + program + " для " + operationSystem);
    }

}
