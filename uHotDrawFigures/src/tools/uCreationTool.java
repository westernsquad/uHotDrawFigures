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
import uhotdrawfigures.uAbstractFigure;
import uhotdrawfigures.uRectangleFigure;
//x

public class uCreationTool extends uAbstractTool {
    
    public uAbstractFigure prototype ;

    public uCreationTool(uAbstractFigure aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public IFigure creationFigure(){
        return prototype.clone();
    }
    
    public uCreationTool (uDrawingView drawingView , uAbstractFigure abstracFigure){
        prototype = abstracFigure;
        view = drawingView;
        
        
    }

    @Override
    public void mouseDown(MouseEvent e) {
        
    }

    @Override
    public void mouseUp(MouseEvent e) {
        IFigure f=creationFigure();      // Le dices las dimensiones que pintar
        Rectangle r=f.displayBox();
        Point p=new Point(e.getX()-r.x,e.getY()-r.y);
        f.moveBy(p.getX(),p.getY());
        view.getDrawing().añadirF(f);
    }

    @Override
    public void mouseMove(MouseEvent e) {
        
    }

    @Override
    public void mouseDrag(MouseEvent e) {
        
    }
    
    
    
}
