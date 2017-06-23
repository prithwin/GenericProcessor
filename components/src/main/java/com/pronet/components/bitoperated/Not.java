package com.pronet.components.bitoperated;

import com.pronet.logic.LogicGate;
import com.pronet.model.Bit;
import com.pronet.error.LogicException;

/**
 * Created by prith on 20-06-2017.
 */
public class Not implements LogicGate {
    private boolean output;

    private static final int INPUT = 1;
    private static final int OUTPUT = 1;

    public void set(Bit[] input) {
        if(input.length != 1) throw new LogicException("Too many/few bits in the input");
        this.output = !input[0].read();
    }

    public boolean readRaw() {
        return output;
    }

    public int getInputSize(){
        return INPUT;
    }

    public int getOutputSize() {
        return OUTPUT;
    }
}
