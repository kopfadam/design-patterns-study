package com.designpatterns.singleton;

//not really needed final keyword but it is better to use if we have subclass
final class Captain {

    private static Captain captain;

    // should be private to prevent instantiated in other classes(can not use "new" keyword)
    private Captain(){ }

    // thread safe
    public static synchronized Captain getCaptain(){
        //lazy initialization
        if(captain == null)
            captain = new Captain();
        return captain;
    }

    public static void dummyMethod(){
        System.out.println("hey i am a dummy method!");
    }
}
