package com.pronet.components.bitoperated;

import com.pronet.components.connect.LogicGateCircuitComponent;
import com.pronet.error.LogicException;
import com.pronet.logic.Circuit;
import com.pronet.logic.CircuitComponent;
import com.pronet.model.Bit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prith on 21-06-2017.
 */
public class XORGate implements Circuit {

    List<List<Circuit>> circuitComponents = new ArrayList<>();

    public XORGate() {
        circuitComponents.add(getNandGatesAsList(1));
        circuitComponents.add(getNandGatesAsList(2));
        circuitComponents.add(getNandGatesAsList(1));
    }

    private List<Circuit> getNandGatesAsList(int n) {
        List<Circuit> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            result.add(new NandGate());
        }
        return result;
    }

    @Override
    public void set(Bit[] inputs) {
        //each logic component has a unique way that it is implmented and there is nothing we can do about it
        if(inputs.length != 2) throw new LogicException("too many/few inputs for this component");
        circuitComponents.get(0).get(0).set(inputs);
        Bit[] level1output = circuitComponents.get(0).get(0).read();
    }

    @Override
    public Bit[] read() {
        return new Bit[0];
    }

    @Override
    public void addComponent(CircuitComponent component) {

    }

}
