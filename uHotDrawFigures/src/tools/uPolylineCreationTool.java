/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.Graphics;
import uhotdrawfigures.uPolylineFigure;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;
import uhotdrawfigures.IFigure;
import uhotdrawfigures.uAbstractFigure;
import uhotdrawfigures.uRectangleFigure;


/**
 *
 * @author westernsquad
 */
public class uPolylineCreationTool extends uCreationTool{
    uCreationTool figus;
    uPolylineFigure plf;
    
    public uPolylineCreationTool(uDrawingView drawingView, uAbstractFigure abstractFigure) {
        super(drawingView, abstractFigure);
    }
  
    @Override
    public IFigure creationFigure (){
     return new uPolylineFigure();
             }
  
    @Override
    public void mouseDown(MouseEvent aEvent) {
        IFigure f =new uPolylineFigure();
        plf=new uPolylineFigure();
        Point p =new Point(aEvent.getX(),aEvent.getY());
         plf.getPuntos().add(new Point(p));
         view.getDrawing().añadirF(plf);
        
        }
     @Override
    public void mouseDrag(MouseEvent e) {            //  pinta libremente.
        Point p = new Point(e.getX(),e.getY());
        plf.getPuntos().add(new Point(p));
        
    }
    
   
   public IFigure clone() throws CloneNotSupportedException {
        uPolylineFigure figure=null;
        figure = (uPolylineFigure ) super.clone();//PREGUNTAR POR Q NO SE CLONAAAA!!!
        return figure;
    }
    

    
}
