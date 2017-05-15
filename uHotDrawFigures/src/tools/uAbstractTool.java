/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;

public abstract class uAbstractTool implements ITools{
    
    uDrawingView view ;

    public uDrawingView getView() {
        return view;
    }

    public void setView(uDrawingView view) {
        this.view = view;
    }
     
    @Override
    public abstract void mouseDown(MouseEvent e);
    @Override
    public abstract void mouseUp(MouseEvent e);
    @Override
    public abstract void mouseMove(MouseEvent e);
    @Override
    public abstract void mouseDrag(MouseEvent e);
   
}
