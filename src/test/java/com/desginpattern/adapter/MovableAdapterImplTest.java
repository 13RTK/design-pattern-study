package com.desginpattern.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovableAdapterImplTest {
    @Test
    public void movableAdapterTest() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter adapter = new MovableAdapterImpl(bugattiVeyron);

        assertEquals(431.30312, adapter.getSpeed(), 0.00001);
    }
}