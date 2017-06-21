package com.pronet.components.bitoperated;

import com.pronet.logic.Circuit;
import com.pronet.logic.CircuitComponent;
import com.pronet.model.Bit;
import java.util.List;
import java.util.ArrayList;

/**
 * a circuit based implementation for a NAND gate.
 * TODO: change circuit component to reflect multiway chaining and multiple outputs
 */
public class NandGate implements Circuit {

    List<CircuitComponent> circuitComponents = new ArrayList<>();

    public void addComponent(CircuitComponent component){
        circuitComponents.add(component);
    }

    public void set(Bit[] inputs) {
        circuitComponents.get(0).set(inputs);
        for(int i = 1 ; i < circuitComponents.size() ; i++) {

            Bit[] lineOut = circuitComponents.get(i-1).read();
            int n = circuitComponents.get(i-1).getOutputSize();
            Bit[] lineIn = new Bit[n];
            for (int j = 0 ; j < n ; j++) {
                lineIn[j] = lineOut[j];
            }
            circuitComponents.get(i).set(lineOut);
        }
    }

    public Bit[] read() {
        return circuitComponents.get(circuitComponents.size() - 1).read();
    }
}
