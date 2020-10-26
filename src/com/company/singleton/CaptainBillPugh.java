package com.company.singleton;

class CaptainBillPugh {

    private CaptainBillPugh(){}

    // an helper class we made lazy and thread-safe with this helper class
    private static class SingletonHelper{

        private static final CaptainBillPugh captain = new CaptainBillPugh();
    }

    public static CaptainBillPugh getCaptain(){

        return SingletonHelper.captain;
    }

    public static void dummyMethod(){

        System.out.println("hey i am a dummy method!");
    }
}
