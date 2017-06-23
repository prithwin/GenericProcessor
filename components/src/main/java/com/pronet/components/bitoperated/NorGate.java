package com.pronet.components.bitoperated;

import com.pronet.components.connect.LogicGateCircuitComponent;
import com.pronet.components.util.CircuitUtil;
import com.pronet.logic.Circuit;
import com.pronet.logic.CircuitComponent;
import com.pronet.model.Bit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prith on 21-06-2017.
 */
public class NorGate extends GenericLinearComponent implements Circuit {
    public NorGate() {
        this.circuitComponents.add(new LogicGateCircuitComponent(new Or()));
        this.circuitComponents.add(new LogicGateCircuitComponent(new Not()));
    }
}
