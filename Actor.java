package com.vishalnigam;

/**
 * Created by ShwetaVishal on 4/6/2016.
 */
interface IActor {
    public void perform();
}

public abstract class Actor implements IActor {


}

class ActorX extends Actor {
    public void perform() {
        System.out.print("performing...X");
    }
}

class ActorY extends Actor {
    public void perform() {
        System.out.print("performing...Y");
    }
}

class ActorZ extends Actor {
    public void perform() {
        System.out.print("performing...Z");
    }
}