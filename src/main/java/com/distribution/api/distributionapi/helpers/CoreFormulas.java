package com.distribution.api.distributionapi.helpers;

import org.springframework.stereotype.Component;

import com.distribution.api.distributionapi.entities.Dma;

@Component
public class CoreFormulas {

    public Dma dma = new Dma();

    // [LOGIC]
    // calculating all core fields
    private void calcInletInduk() {
        dma.inletInduk = 3.4;
    }

    private void calcInletDMA() {
        dma.inletDMA = 1882;
    }

    // [SHOW]
    // print out all of data calculated
    public Dma show(String dmaID) {
        // [LOGIC]
        // call all logic here, but you can skip few of logic with some conditions
        // case: if the dma is not parent dma, then skip few calculation logic
        // otherwise: just call it all
        this.calcInletInduk();
        this.calcInletDMA();

        // validate and response it
        return this.dma;
    }
}
