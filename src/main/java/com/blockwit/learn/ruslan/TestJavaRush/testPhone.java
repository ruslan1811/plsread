package com.blockwit.learn.ruslan.TestJavaRush;

public class testPhone {
    public static void main (String args[]) {

        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone (1984);
        AbstractPhone videoPhone = new VideoPhone(2018);
        User user = new User("Андрей");
        user.callAnotherUser(224466, firstPhone);
        user.callAnotherUser(224466, phone);
        user.callAnotherUser(224466, videoPhone);



    }

}
