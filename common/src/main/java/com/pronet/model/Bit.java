package com.pronet.model;

/**
 * Created by prith on 20-06-2017.
 */
public class Bit {
    private boolean state;

    public Bit(boolean state) {
        this.state = state;
    }

    public void set(){
        state = true;
    }

    public void reset() {
        state = false;
    }

    public boolean read() {
        return state;
    }
}
