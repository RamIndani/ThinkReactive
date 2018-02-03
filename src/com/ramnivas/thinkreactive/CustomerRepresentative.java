package com.ramnivas.thinkreactive;

import java.util.concurrent.TimeUnit;

/**
 * Created by ramnivasindani on 2/3/18.
 */
public class CustomerRepresentative {

    public static String getCode(String info) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return info + info.length();
    }
}
