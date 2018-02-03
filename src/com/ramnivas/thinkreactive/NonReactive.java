package com.ramnivas.thinkreactive;

import java.util.concurrent.TimeUnit;

/**
 * Created by ramnivasindani on 2/3/18.
 */
public class NonReactive {


    public static void main(String[] args) throws InterruptedException{
        System.out.println("1. Contact customer representative");
        System.out.println("2. Request activation code");
        String code = CustomerRepresentative.getCode("RamIndani");
        System.out.println("BREW YOUR COFFEE");
        continueYourWork();
        System.out.println("3. Got activation code");
        System.out.println("4. Activating card with "+(code));
        System.out.println("COFFEE IS READY");
    }

    private static void continueYourWork() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
