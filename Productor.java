package tankes;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
public class Productor extends Thread{
    private Y rc;
    private DibujaTanke panel;
    public Productor(DibujaTanke panel, Y rc){
        this.panel=panel;
        this.rc=rc;
    }
    public void run(){
        while(true){
            if(rc.getY()>50){
                panel.agua.getAgua().add(new Rectangle2D.Double(50,rc.getY(), 100, 5));
                panel.repaint();
                rc.setY(rc.getY()-5);
                try{
                    sleep(600);
                }catch(Exception e){}
            }
        }
    }
}
