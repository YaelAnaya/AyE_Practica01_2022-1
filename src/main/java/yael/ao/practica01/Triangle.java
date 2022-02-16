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
public class Triangle extends Figure{
    private int[] xPoints;
    private int[] yPoints;
    
    public Triangle(int xPosition, int yPosition, int size, Color color) {
        super(xPosition, yPosition, size, color);
        xPoints = new int[3];
        yPoints = new int[3];
    }
    
//    public int[] getXPoints(){
//        
//    }
//    
//    public int[] getYPoints(){
//        
//    }

    @Override
    public void drawInCanvas(Graphics2D graphics) {
        graphics.setColor(color);
        
        
    }
    
    
    
}
