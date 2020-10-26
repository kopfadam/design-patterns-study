package com.designpatterns.singleton;

final class CaptainDoubleCheck {

    //use volatile keyword if you have mutable object to ensure thread-safe, because JIT compiler can change it.
    private static volatile CaptainDoubleCheck captain;
    private CaptainDoubleCheck(){}

    public static CaptainDoubleCheck getCaptain(){
        if(captain == null){
            synchronized (CaptainDoubleCheck.class){
                if (captain == null)
                    captain = new CaptainDoubleCheck();
            }
        }
        return captain;
    }

    public static void dummyMethod(){
        System.out.println("hey i am a dummy method!");
    }
}
