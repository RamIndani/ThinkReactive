package com.ramnivas.thinkreactive;

import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * Created by ramnivasindani on 2/3/18.
 */
public class Reactive {
    public static void main(String[] args) {
        System.out.println("1. Contact customer representative");
        System.out.println("2. Request activation code");
        requestActivationCode("RamIndani");
        System.out.println("BREW YOUR COFFEE");
        continueYourWork();
        System.out.println("COFFEE IS READY");
    }

    private static void continueYourWork() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void requestActivationCode(String firstName) {
        Observable.just(firstName)
                .map(code -> CustomerRepresentative.getCode(code))
                .subscribeOn(Schedulers.io())
                .subscribe(code -> activate(code));
    }

    private static void activate(final String code) {
        System.out.println("3. Got activation code");
        System.out.println("4. Activating card with "+code);
    }
}
