
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;

import uHotDrawFramework.uDrawing;
import uHotDrawFramework.uDrawingEditor;
import uHotDrawFramework.uDrawingView;
import uhotdrawfigures.IFigure;
import uhotdrawfigures.uRectangleFigure;
import uhotdrawfigures.UelipseFigure;
import uhotdrawfigures.uBorderDecoratorFigure;
import uhotdrawfigures.uDecoratorFigure;
import uhotdrawfigures.uPolylineFigure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author westernsquad
 */
public class main {
    
   
    
    public static void main(String[] args){
         
         
         uDrawingView v = new uDrawingView();
        
         //b.	Crear una instancia de la clase uDrawing y asignarla a la variable d, 
         uDrawing d = new uDrawing();
         uRectangleFigure f1 = new uRectangleFigure();
         UelipseFigure f2 = new UelipseFigure();
        
         Rectangle cja = new Rectangle(50,50,60,60);
         f2.setCaja(cja);
         
         Rectangle caja = new Rectangle(10,10,30,30);
         f1.setCaja(caja);
         
         //decorator
          uBorderDecoratorFigure bor = new uBorderDecoratorFigure();
          UelipseFigure f3 = new UelipseFigure();
          Rectangle cajae = new Rectangle(100,100,30,30);
          f3.setCaja(cajae);
          bor.setInnerFigure(f3);
          d.añadirF(bor);//mirar por q me dibuja la figura y no el borde
            //decorator
           
         
         //a partir del ejercicio 37
            //PREGUNTAR!!!!
           
          uDrawingEditor e =new uDrawingEditor();
           e.getView().setDrawing(d);  
         //añadir figuras al dibujo
            d.añadirF(f1);
        
            d.añadirF(f2);
          //añadir figuras al dibujo 
         
         //i.	Asignar el dibujo d a la vista v.
         v.setDrawing(d);
         
         v.setPreferredSize(new Dimension(320,240));
        
         //e.setDrawingView(v);
         e.setVisible(true); 
         e.pack();
        
          e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }

   
    
}
