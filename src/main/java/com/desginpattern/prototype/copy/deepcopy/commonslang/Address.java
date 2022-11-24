package com.desginpattern.prototype.copy.deepcopy.commonslang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable{
    private int x;
    private int y;
}
