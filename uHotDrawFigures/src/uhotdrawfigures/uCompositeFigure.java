/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;
import java.util.ArrayList;

public class uCompositeFigure extends uAbstractFigure {
    
    public  List <IFigure> figures ;
    
    public uCompositeFigure(){
        figures = new ArrayList <IFigure>();  
    }

    public List<IFigure> getFigures() {
        return figures;
    }
    
    public void añadirF(IFigure f){
        figures.add(f); 
    }
    
    public void removeFigure(IFigure f){
        figures.remove(f);
    }
    
    @Override
   public void draw (Graphics g){
        for(IFigure f: figures){
            f.draw(g);
        }
   }
   
    @Override
   public void moveBy (double x , double y){
        for(IFigure f: figures){
            f.moveBy(x,y);
        }
   }

    @Override
   public boolean containstPoint (double x, double y){
        for(IFigure f: figures){
           if( f.containstPoint(x,y)){
               return true;
           }
            
        }
       return false; 
   }
   
    @Override
   public Rectangle displayBox(){
       Rectangle r = new Rectangle();
       r = figures.get(0).displayBox();
       for (IFigure f: figures){
           r = r.union(f.displayBox());
       }
       
       return r;
   }
   
   
   
   
   
    
}
