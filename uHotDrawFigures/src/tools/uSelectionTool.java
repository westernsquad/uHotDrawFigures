/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;
import uhotdrawfigures.IFigure;


public class uSelectionTool extends uAbstractTool{ 

private uDrawingView v;
private ITools fChild;

    public uSelectionTool(){};
    
    public uSelectionTool(uDrawingView v1){
        v=v1;
    }
    
    
    IFigure findFigure(int x,int y){
        return v.getDrawing().findFigure(x,y);
    }
    public void mouseDown(MouseEvent e){
        IFigure figure=findFigure(e.getX(),e.getY());
        if(figure!=null){
            fChild=new uDragTool(v,figure);
        } else{
            fChild=new uSelectAreaTool(v);
        }
        fChild.mouseDown(e);
    }
    public void mouseUp(MouseEvent e){
        fChild.mouseUp(e);
    }
    public void mouseDrag(MouseEvent e){
        fChild.mouseDrag(e);
    }
    public void mouseMove(MouseEvent e){
    }
}

