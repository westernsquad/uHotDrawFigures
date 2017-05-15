/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;
import uhotdrawfigures.IFigure;
import uhotdrawfigures.uRectangleFigure;


public class uRectangleCreationTool extends uAbstractTool {

    @Override
    public void mouseUp(MouseEvent e) {
        IFigure f=new uRectangleFigure(0,0,20,30);      // Le dices las dimensiones que pintar
        Rectangle r=f.displayBox();
        Point p=new Point(e.getX()-r.x,e.getY()-r.y);
        f.moveBy(p.getX(),p.getY());
        view.getDrawing().añadirF(f);
    }
    
    public uRectangleCreationTool(uDrawingView view){
        this.view = view;
    }
    
    @Override
    public void mouseDown(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMove(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDrag(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IFigure clone() throws CloneNotSupportedException {
        uRectangleFigure figure=null;
        figure = (uRectangleFigure) super.clone();//PREGUNTAR POR Q NO SE CLONAAAA!!!
        return figure;
    }

  
}
