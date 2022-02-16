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
public class Square extends Figure{

    public Square (int xPosition, int yPosition, int size, Color color){
        super(xPosition, yPosition, size, color);
    }
    

    @Override
    public void drawInCanvas(Graphics2D graphics) {
        graphics.setColor(color);
        graphics.fillRect(xPosition, yPosition, size, size);
    
    }
    
    
}
