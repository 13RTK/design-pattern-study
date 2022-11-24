package com.desginpattern.builder.couple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class House {
    private int windowNum;
    private int doorNum;
    private int roomNum;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasStatues;
    private boolean hasGarden;
    private int wallNum;
}
