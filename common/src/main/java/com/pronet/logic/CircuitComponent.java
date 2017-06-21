package com.pronet.logic;

import com.pronet.model.Bit;

/**
 * Created by prith on 21-06-2017.
 */
public interface CircuitComponent {
    void set(Bit[] input);
    Bit[] read();
    int getInputSize();
    int getOutputSize();
}
