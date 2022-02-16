/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yael.ao.practica01;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author yaela
 */
public class IrregularPolygon extends Figure{
    
    private ArrayList<Integer> xPoints;
    private ArrayList<Integer> yPoints;

    public IrregularPolygon(ArrayList<Integer> xPoints, ArrayList<Integer> yPoints,
                            int size, Color color) {
        
        super(0, 0, size, color);
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }
    
    /**
     * Con este método lo que se hace es convertir el ArrayList de Integers a
     * Arrays de tipo primitivo int, para poder dibujar el polígono.
     *
     * @param list La lista que convertiremos a Array de tipo primitivo.
     * @return El Array de tipo primitivo.
     */
    public int[] convertToArray(ArrayList<Integer> list) {
        int[] arrayAuxiliar = new int[size];
        for (int i = 0; i < size; i++) {
            arrayAuxiliar[i] = list.get(i);
        }
        return arrayAuxiliar;
    }
    
    @Override
    public void drawInCanvas(Graphics2D graphics) {
    }
    
    
}
