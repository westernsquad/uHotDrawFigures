/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
//x
import java.awt.event.MouseEvent;
public interface ITools {
    public abstract void mouseDown(MouseEvent aEvent);
    public abstract void mouseUp(MouseEvent aEvent);
    public abstract void mouseMove(MouseEvent aEvent);
    public abstract void mouseDrag(MouseEvent aEvent);
    
}

