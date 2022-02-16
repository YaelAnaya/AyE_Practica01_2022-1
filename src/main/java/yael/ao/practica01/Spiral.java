/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yael.ao.practica01;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author yaela
 */
public class Spiral extends Figure {
    private final int INCREMENT;
    private final int INITIALRADIUS;

    public Spiral(int xPosition, int yPosition, int size, 
                  int increment, int initialRadius, Color color) {
        
        super(xPosition, yPosition, size, color);
        this.INCREMENT = increment;
        this.INITIALRADIUS = initialRadius;
    }

    
    @Override
    public void drawInCanvas(Graphics2D graphics) {
    }

}
