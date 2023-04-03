/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase1_07032023;

/**
 *
 * @author nicos
 */
public class Punto {

    private int x, y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(int _x, int _y) {
        x = _x;
        y = _y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Punto p) {
        if (p == null) {
            return false;
        }

        return ((x == p.getX()) && (y == p.getY()));

    }

}
