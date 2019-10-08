package org.sapphon.adapterexample.model;

import org.sapphon.adapterexample.model.Apple;
import org.sapphon.adapterexample.model.Orange;

public class AppleOrangeAdapter extends Orange {

    public AppleOrangeAdapter(Apple input){
        this.skinColor = input.skinColor + " (not very orangey!)";
        this.variety = input.variety;
        this.acidity = calculateAcidityFromSweetnessAndDryness(input.ciderSweetness, input.ciderDryness);
        this.pithWidth = -1;
    }

    public static int calculateAcidityFromSweetnessAndDryness(int sweetness, int dryness){
        return Math.min(Integer.MAX_VALUE, Integer.MAX_VALUE - sweetness * 3 + dryness);
    }
}
