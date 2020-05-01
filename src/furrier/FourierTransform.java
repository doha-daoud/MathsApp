
package furrier;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FourierTransform extends JFrame implements ActionListener {
     private final JLabel tLabel;
     private final JTextField fild1,displayFeld;
     private final JButton button11,button22;
     
    public FourierTransform(){ 
        Container container = super.getContentPane();
        container.setLayout(new FlowLayout());
      
       
       tLabel = new JLabel(" ادخل المعادلة هنا ");
       container.add(tLabel);
      
      //الحقل الاول لادخال معادلة تحويل فوريير
       fild1 = new JTextField(20);
       fild1.setFont(new Font("Serif",Font.PLAIN,15));
       container.add(fild1);
       
      //زر لاظهار النتيجة
       button11 = new JButton("اظهار النتيجة");
       container.add(button11);
       
       Handler7 Handler7 = new Handler7();
       button11.addItemListener(Handler7);
       
       //تعريف حفل اظهار النتيجة
       displayFeld = new JTextField(20);
       container.add(displayFeld);
       
       //تعريف زر النسخ 
       button22 = new JButton("نسخ");
       container.add(button22);
       
       Handler8 Handler8=new Handler8();
       button22.addItemListener(Handler8);
       
        super.setSize( 400, 300 ); 
        super.setVisible( true );
 
        
    }
    
   @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public static void main(String[] args) {
       Integration  MyWindo2 = new Integration();
         MyWindo2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 }    
     
 public class Handler7 implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     
 }
     
 
 
 
 public  class Handler8 implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     
 }
     
     
     
     
}
