
package yael.ao.practica01;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author yaela
 */
public abstract class Figure {
    protected int xPosition;
    protected int yPosition;
    protected Color color;
    protected int size;

    public Figure(int xPosition, int yPosition, int size, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.size = size;
        this.color = color;

    }
    
    public abstract void drawInCanvas(Graphics2D graphics);
    
    
}
