package com.pronet.components.connect;

import com.pronet.logic.CircuitComponent;
import com.pronet.logic.LogicGate;
import com.pronet.model.Bit;

/**
 * Created by prith on 21-06-2017.
 */
public class LogicGateCircuitComponent implements CircuitComponent{
    private LogicGate gate;

    public LogicGateCircuitComponent(LogicGate gate) {
        this.gate = gate;
    }

    @Override
    public void set(Bit[] input) {
        gate.set(input);
    }

    @Override
    public Bit[] read() {
        Bit[] output = {gate.read()};
        return output;
    }

    @Override
    public int getInputSize() {
        return gate.getInputSize();
    }

    @Override
    public int getOutputSize() {
        return gate.getOutputSize();
    }
}
