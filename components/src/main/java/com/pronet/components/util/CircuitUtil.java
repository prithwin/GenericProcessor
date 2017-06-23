package com.pronet.components.util;

import com.pronet.logic.CircuitComponent;
import com.pronet.model.Bit;

import java.util.List;

/**
 * Created by prith on 21-06-2017.
 */
public class CircuitUtil {

    public static void serialCompute(List<CircuitComponent> circuitComponents) {
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

    public static void parelellCompute(List<List<CircuitComponent>> CircutComponents) {

    }
}
