package com.pronet.components.bitoperated;

import com.pronet.components.connect.LogicGateCircuitComponent;
import com.pronet.components.util.CircuitUtil;
import com.pronet.logic.Circuit;
import com.pronet.logic.CircuitComponent;
import com.pronet.model.Bit;
import java.util.List;
import java.util.ArrayList;

/**
 * a circuit based implementation for a NAND gate.
 * TODO: change circuit component to reflect multiway chaining and multiple outputs
 */
public class NandGate extends GenericLinearComponent implements Circuit {
    public NandGate() {
        this.circuitComponents.add(new LogicGateCircuitComponent(new And()));
        this.circuitComponents.add(new LogicGateCircuitComponent(new Not()));
    }
}
