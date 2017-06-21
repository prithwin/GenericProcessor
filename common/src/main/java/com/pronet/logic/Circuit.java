package com.pronet.logic;

import java.util.List;
import java.util.ArrayList;
import com.pronet.model.Bit;

/**
 * Created by prith on 21-06-2017.
 * core interface representing a circuit.
 */
public interface Circuit {
    Bit TRUE = new Bit(true);
    Bit FALSE = new Bit(false);

    public void set(Bit[] inputs);
    public Bit[] read();

    public void addComponent(CircuitComponent component);
}
