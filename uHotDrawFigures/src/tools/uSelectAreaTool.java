/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;
import uhotdrawfigures.IFigure;
import uhotdrawfigures.uRectangleFigure;

public class uSelectAreaTool extends uAbstractTool
{
    uDrawingView v;
    uRectangleFigure rf;
    public uSelectAreaTool(uDrawingView dv){
        v=dv;
    }
    public void mouseDown(MouseEvent e){
        rf=new uRectangleFigure(e.getX(),e.getY(),0,0);
        v.getDrawing().añadirF(rf);
    }
    public void mouseUp(MouseEvent e){
        v.getDrawing().removeFigure(rf);          // Remove de uDrawing
        v.clearSelection();
        for(IFigure f:v.getDrawing().findFigures(rf.displayBox())){
            v.addToSelection(f);
        }
    }
    public void mouseDrag(MouseEvent e){
        int rx=rf.displayBox().x;
        int ry=rf.displayBox().y;
        int w=e.getX()-rx;
        int h=e.getY()-ry;
        rf.setSize(w,h);
    }
    public void mouseMove(MouseEvent e){
    }
}

