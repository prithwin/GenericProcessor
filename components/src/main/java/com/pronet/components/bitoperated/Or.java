package com.pronet.components.bitoperated;

import com.pronet.error.LogicException;
import com.pronet.logic.LogicGate;
import com.pronet.model.Bit;

/**
 * Created by prith on 21-06-2017.
 */
public class Or implements LogicGate {
    private boolean output;
    private static final int INPUT = 2;
    private static final int OUTPUT = 1;

    public void set(Bit[] input) {
        if(input.length != 2) throw new LogicException("Too many/few bits in the input");
        output = input[0].read() || input[1].read();
    }

    public boolean readRaw() {
        return output;
    }

    @Override
    public int getInputSize() {
        return INPUT;
    }

    @Override
    public int getOutputSize() {
        return OUTPUT;
    }
}
