package com.desginpattern.prototype.decouple;

import com.google.gson.Gson;

public class PineTree extends Tree{
    public PineTree(double mass, double height) {
        super(mass, height);
    }

    @Override
    public Tree copy() {
        Gson gson = new Gson();
        return gson.fromJson(gson.toJson(this), this.getClass());
    }
}
