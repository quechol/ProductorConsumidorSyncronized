package tankes;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import static java.lang.Thread.sleep;
public class Consumidor extends Thread{
    private Y rc;
    private DibujaTanke panel;
    public Consumidor(DibujaTanke panel, Y rc){
        this.panel=panel;
        this.rc=rc;
    }
    public void run(){
        while(true){
            if (rc.getY()<250){
                panel.agua.getAgua().remove(panel.agua.getAgua().size()-1);
                panel.repaint();
                rc.setY(rc.getY()+5);
                try{    
                    sleep(1000);
                }catch(InterruptedException e){}
            }
        }
    }
}
