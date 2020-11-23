package tankes;
import javax.swing.*;
import java.awt.*;
public class Tankes extends JFrame{
    private DibujaTanke panel;
    private Y rc;
    private Productor p;
    private Consumidor c;
    private Agua agua;
    public Tankes(){
        setSize(400,400);
        setLocation(550,250);
        rc=new Y();
        agua=new Agua();
        panel = new DibujaTanke(agua);
        p = new Productor(panel,rc);
        c = new Consumidor(panel,rc);
        getContentPane().setLayout(new GridLayout());
        getContentPane().add(panel);
        p.start();
        c.start();
    }
    public static void main(String[] args) {
        Tankes fr = new Tankes();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
