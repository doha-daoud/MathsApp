
package furrier;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Integration extends JFrame implements ActionListener{ 
     private final JLabel inLabel;
     private final JTextField field1,field2,field3,displayField;
     private final JButton button1,button2;
     private final JRadioButton radio1,radio2;
     private final ButtonGroup  radioGroup;
     
  public Integration(){
      Container container = super.getContentPane();
      container.setLayout(new FlowLayout());
      
      inLabel = new JLabel("ادخل التكامل هنا:");
       container.add(inLabel);
      
      //الحقل الاول لادخال التكامل
       field1 = new JTextField(20);
       field1.setFont(new Font("Serif",Font.PLAIN,15));
       container.add(field1);
      
       
       //تعريف الازرار لاجل التكامل المحدود و غير المحدود
       radio1 = new JRadioButton("التكامل محدود",true);
       container.add(radio1);
       radio2 = new JRadioButton("التكامل غير محدود",false);
       container.add(radio2);
       radioGroup = new ButtonGroup();
       radioGroup.add(radio1);
       radioGroup.add(radio2);
       
       Handler1 Handler1 = new Handler1();
       radio1.addItemListener(Handler1);
       
       

       
       //تعريف الحقلين اللذان يمثلان حدود التكامل اذا اختار المستخدم التكامل المحدود
       field2 = new JTextField(20);
       field2.setFont(new Font("Serif",Font.PLAIN,15));
       container.add(field2);
       field3 =new JTextField(20);
       field3.setFont(new Font("Serif",Font.PLAIN,15));
       container.add(field3);
       
       
       // تعريف زر التمام للنتيجة
       button1 = new JButton("اظهار النتيجة");
       container.add(button1);
       
       Handler2 Handler2= new Handler2();
       button1.addItemListener(Handler2);
       
       //تعريف حفل اظهار النتيجة
       displayField = new JTextField(20);
        container.add(displayField);
        
       //تعريف زر النسخ 
       button2 = new JButton("نسخ");
       container.add(button2);
       
       Handler3 Handler3=new Handler3();
       button2.addItemListener(Handler3);

        super.setSize( 400, 300 ); 
        super.setVisible( true );
  
  }
     

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public static void main(String[] args) {
       Integration  MyWindo = new Integration();
         MyWindo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 }  
  class Handler1 implements ItemListener 
  {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource()==)
        }
  
  
  }
  
  public class Handler2 implements ItemListener
  {

        @Override
        public void itemStateChanged(ItemEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
  
  }
  
  public class Handler3 implements ItemListener
  {

        @Override
        public void itemStateChanged(ItemEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
  }
  
  
  }// end of Integration.java

