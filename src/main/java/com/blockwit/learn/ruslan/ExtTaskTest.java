package com.blockwit.learn.ruslan;

class WordsHelperTest {

    int number;
    int word;

    int makeWord(int getNumber) {
        number = getNumber + 1;
        return number;

    }


    void printText() {

        System.out.println(number + " текст");
    }

    void printRubleWord(int getNumber) {

        switch (getNumber) {

            case 1:
                System.out.println( getNumber + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println( getNumber + " рубля");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println( getNumber + " рублей");
                break;


        }


    }

}



public class ExtTaskTest {


    public static void main (String args[])  {

        WordsHelperTest word = new WordsHelperTest();
        //word1.makeWord(1);

        // word1.printText();
        //word1.printRubleWord(4);

        for (int i=1; i <11; i++) {

            word.printRubleWord(i);

        }



    }

}
