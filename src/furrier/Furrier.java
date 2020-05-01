
package furrier;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Furrier extends JFrame implements ActionListener {
    private final JButton intBtn , derivBtn , seriesBtn , transBtn ; 
    
    public Furrier()
    {
        Container container = super.getContentPane();
        container.setLayout(new FlowLayout());
        
        intBtn = new JButton("التكاملات "); 
        container.add(intBtn); 
        intBtn.setToolTipText("");  
        intBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        intBtn.addActionListener(this);
        
        derivBtn = new JButton("الاشتقاقات "); 
        container.add(derivBtn); 
        derivBtn.setToolTipText("");  
        derivBtn.addActionListener(this);
        
        seriesBtn = new JButton("تحويل فوريير "); 
        container.add(seriesBtn); 
        seriesBtn.setToolTipText("");
        seriesBtn.addActionListener(this);
        
        transBtn = new JButton("سلاسل فوريير "); 
        container.add(transBtn); 
        seriesBtn.setToolTipText("");
        seriesBtn.addActionListener(this);
        
        super.setSize( 500 , 500 ); 
        super.setVisible( true );
    }

        @Override
        public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public static void main(String[] args) {
        Furrier application = new Furrier();
         application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 }
       
    }

    

