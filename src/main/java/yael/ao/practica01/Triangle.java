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

    public Triangle(int xPosition, int yPosition, int size, Color color) {
        super(xPosition, yPosition, size, color);
    }
    
      
    
    public int[] getXPoints(){
        int[] xPoints = new int[3];
        
        xPoints[0] = xPosition;
        xPoints[1] = xPosition + (size / 2);
        xPoints[2] = xPosition - (size / 2);
        
        return xPoints;
    }
    
    public int[] getYPoints(){
        int[] yPoints = new int[3];
        
        yPoints[0] = yPosition;
        yPoints[1] = (int)(yPosition + Math.sqrt(Math.pow(size, 2) - Math.pow(size/2, 2)));
        yPoints[2] = yPoints[1];
        
        return yPoints;
        
    }

    @Override
    public void drawInCanvas(Graphics2D graphics) {
        graphics.setColor(color);
        graphics.fillPolygon(getXPoints(), getYPoints(), 3); 
    }
    
    
    
}
