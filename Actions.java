package com.vishalnigam;

/**
 * Created by ShwetaVishal on 4/6/2016.
 */
public enum Actions {
    X(new ActorX()), Y(new ActorY()), Z(new ActorZ());

    private IActor actor;
    private Actions(IActor actor) {
        this.actor = actor;
    }

    public void perform() {
        actor.perform();
    }
}
