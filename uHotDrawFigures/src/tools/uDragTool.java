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

public class uDragTool extends uAbstractTool
{
    private uDrawingView v;
    private IFigure figure;
    
    public uDragTool(uDrawingView dv,IFigure f){
        v=dv;
        figure=f;
    }
    @Override
    public void mouseDown(MouseEvent e){
    }
    @Override
    public void mouseUp(MouseEvent e){
    }
    @Override
    public void mouseDrag(MouseEvent e){
        Rectangle r=figure.displayBox();
        Point p=new Point(e.getX()-r.x,e.getY()-r.y);
        figure.moveBy(p.getX() , p.getY());                // Mi moveBy de IFigure es con 2 double no con un punto. En el codigo dado viene con un Point p 
    }
    public void mouseMove(MouseEvent e){
    }
}

