import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Círculo extends JPanel {
        
    public Círculo() 
    {        
        super.setPreferredSize( new Dimension( 1024, 768 ) ); 
        super.setBackground( Color.lightGray );
    }
    
    public void paintComponent( Graphics g ) 
    {
        super.paintComponent(g); 
        g.setColor(Color.BLUE);
        g.fillOval(10, 10, 200, 200);
        g.setColor(Color.CYAN);
        g.fillOval(10, 250, 200, 200);
        g.setColor(Color.pink);
        g.fillOval(250, 10, 200, 200);
        g.setColor(Color.YELLOW);
        g.fillOval(250, 250, 200, 200);
        g.setColor(Color.MAGENTA);
        g.fillOval(490, 10, 200, 200);
        g.setColor(Color.ORANGE);
        g.fillOval(490, 250, 200, 200);
        g.setColor(Color.RED);
        g.fillOval(10, 500, 300, 100);
        g.setColor(Color.GREEN);
        g.fillOval(350, 500, 300, 100);
        
    }
           
    public static void main(String[] args) 
    {
        Círculo painel = new Círculo();
        
        JFrame f = new JFrame();
        f.setContentPane( painel ); 
        f.setTitle( "Círculo" ); 
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 1024, 768 ); 
        f.setLocationRelativeTo( f );                
        f.setVisible( true );
    }
    
}