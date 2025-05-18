package org.example.homework1.models;

import org.example.homework1.interfaces.Movable;

public class Point implements Movable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() { y++; }

    @Override
    public void moveDown() { y--; }

    @Override
    public void moveLeft() { x--; }

    @Override
    public void moveRight() { x++; }

        public void printPosition() {
            System.out.println("Point at (" + x + ", " + y + ")");
    }
}
