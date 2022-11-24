package com.desginpattern.prototype.decouple;

import com.google.gson.Gson;

public class PlasticTree extends Tree {
    @Override
    public Tree copy() {
        Gson gson = new Gson();
        return gson.fromJson(gson.toJson(this), this.getClass());
    }

    public PlasticTree(double mass, double height) {
        super(mass, height);
    }
}
