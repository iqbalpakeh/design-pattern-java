package com.mpakeh.singletone;

public class SingletonePatternDemo {

    public static void run() {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject(); //Get the only object available

        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }

}
