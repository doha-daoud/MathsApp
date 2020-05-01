/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furrier;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Derivation extends JFrame implements ActionListener{
     private final JLabel dLabel;
     private final JTextField dfield1 ,dfield2,ddisplayField;
     private final JButton dbutton1,dbutton2;
     private final JCheckBox box1, box2;
     
      public Derivation(){
      Container container = super.getContentPane();
      container.setLayout(new FlowLayout());
       
      dLabel = new JLabel("ادخل معادلة الاشتقاق هنا :");
      container.add(dLabel);  
      
      //الحقل الاول لادخال الاشتقاق
       dfield1 = new JTextField(20);
       dfield1.setFont(new Font("Serif",Font.PLAIN,15));
       container.add(dfield1);
       
       //تعريف الاختيار الاشتقاق عند نقطة معينة ام لا
       box1=new JCheckBox("الاشتقاق عند نقطة ");
       container.add(box1);
       box2=new JCheckBox("الاشتقاق العادي");
       container.add(box2);
       
       Handler4 Handler4=new Handler4();
       box1.addItemListener(Handler4);
       box2.addItemListener(Handler4);
       
       
       //تعريف حقل ادخال نقطة الاشتقاق
       dfield2 = new JTextField(20);
       dfield2.setFont(new Font("Serif",Font.PLAIN,15));
       container.add(dfield2);
       
       // تعريف زر التمام للنتيجة
       dbutton1 = new JButton("اظهار النتيجة");
       container.add(dbutton1);
       
       Handler5 Handler5 = new Handler5();
       dbutton1.addItemListener(Handler5);
       
       //تعريف حفل اظهار النتيجة
       ddisplayField = new JTextField(20);
        container.add(ddisplayField);
        
       //تعريف زر النسخ 
       dbutton2 = new JButton("نسخ");
       container.add(dbutton2);
       
        Handler6 Handler6 = new Handler6();
       dbutton2.addItemListener(Handler6);

        super.setSize( 400, 300 ); 
        super.setVisible( true );
       
      }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
       Integration  MyWindo1 = new Integration();
         MyWindo1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 }   
   
    
  
  public class Handler4 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
      
  }
    
    
  public class Handler5 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
      
      
      
  }
   
   
    
  
  public class Handler6 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
  }
  
  

  
    
    
}//end of der
