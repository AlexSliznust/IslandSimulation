package com.nicorp.demo2.animals.demo2.animals;

import com.nicorp.demo2.animals.demo2.config.ConfigReader;
import org.json.JSONObject;

public class Fox extends Carnivore{

    public Fox(String name) {
        super(name, 10, 5, 5, 0.2f, 1.0);

        JSONObject config = ConfigReader.getAnimalConfig("Fox");
        this.weight = config.getInt("weight");
        this.maxHunger = config.getInt("maxHunger");
        this.maxAge = config.getInt("maxAge");
        this.foodForFullSaturation = config.getFloat("foodForFullSaturation");
        this.reproductionChance = config.getFloat("reproductionChance");
    }

    @Override
    protected Animal createChild(String name) {
        return new Fox(name);
    }
}