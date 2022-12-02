package com.designpattern.prototype.decouple;

import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;

@Log
public class TreePrototypeTest {
    @Test
    public void treePrototypeTest() {
        Tree tree1 = new PineTree(1.2, 2.1);
        Position position = new Position(2, 9);
        tree1.setPosition(position);

        Tree copy = tree1.copy();
        position.setX(8);
        position.setY(2);

        System.out.println(copy.getPosition());
        System.out.println(tree1.getPosition());
        Assert.assertNotEquals(copy.getPosition(), tree1.getPosition());
    }
}
