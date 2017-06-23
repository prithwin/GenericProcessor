package com.pronet.components.bitoperated;

import com.pronet.components.connect.LogicGateCircuitComponent;
import com.pronet.components.util.CircuitUtil;
import com.pronet.logic.CircuitComponent;
import com.pronet.model.Bit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prith on 21-06-2017.
 */
public class GenericLinearComponent {

    List<CircuitComponent> circuitComponents = new ArrayList<>();

    public void addComponent(CircuitComponent component){
        circuitComponents.add(component);
    }

    public void set(Bit[] inputs) {
        circuitComponents.get(0).set(inputs);
        CircuitUtil.serialCompute(circuitComponents);
    }

    public Bit[] read() {
        return circuitComponents.get(circuitComponents.size() - 1).read();
    }
}
