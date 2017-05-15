/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFramework;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uhotdrawfigures.IFigure;


public class uDrawing extends uhotdrawfigures.uCompositeFigure {
    
    public uDrawing(){
        super();
        figures = new ArrayList<IFigure>();
    }
    
    // Metodo para la herramienta de seleccion de figuras. Ejercicio 47 en adelante.
    
    public IFigure findFigure(int x ,int y){
        IFigure figure = null;
        IFigure figuraAuxiliar = null;
        Iterator it = figures.iterator();       // Uso un iterador en vez de un for:each
        
        boolean bucle = false;
        
        while (it.hasNext() && (!bucle)){
            figure = (IFigure) it.next();
            if(figure.containstPoint(x, y)){
                bucle = true;
                figuraAuxiliar = figure;
            }
        }
       return figuraAuxiliar;   
    }
    
    // Mismo metodo para mas de una figura a la vez
    
    public List<IFigure> findFigures (Rectangle rectangulo){
        List<IFigure> figuras = new ArrayList <IFigure>();
        for (IFigure f : figuras){
            if (rectangulo.intersects(f.displayBox()))
                figuras.add(f);
        }
        return figuras;
    }
}