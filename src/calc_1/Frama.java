package calc_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Frama extends JFrame implements ActionListener {
     JButton b1 = new JButton("  1  ");
    JButton b2 = new JButton("  2  ");
    JButton b3 = new JButton("  3  ");
    JButton b4 = new JButton("  4  ");
    JButton b5 = new JButton("  5  ");
    JButton b6 = new JButton("  6  ");
    JButton b7 = new JButton("  7  ");
    JButton b8 = new JButton("  8  ");
    JButton b9 = new JButton("  9  ");
    JButton b10 = new JButton("  0  ");
    JButton b11 = new JButton("  sin  ");
    JButton b12 = new JButton("  cos  ");
    JButton b13 = new JButton("  tan  ");
    JButton b14 = new JButton("  x^2  ");
    JButton b15 = new JButton("  .  ");
    JButton b16 = new JButton("  +  ");
    JButton b17 = new JButton("  -  ");
    JButton b18 = new JButton("  /  ");
    JButton b19 = new JButton("  *  ");
    JButton b20 = new JButton("  Del  ");
    JButton b21 = new JButton("  Ac  ");
    JButton b22 = new JButton("  =  ");
    JButton b23 = new JButton("  %  ");
    JButton b24 = new JButton("  1/x  ");
    JButton b25 = new JButton("  Off  ");
    JButton b26 = new JButton(" - / + ");
    JButton b27 = new JButton(" n! ");
    JButton b28 = new JButton(" log ");
    JButton b29 = new JButton(" Sqrt ");
    JButton b30 = new JButton(" abs ");
    JButton b31 = new JButton(" pi ");
    JPanel p1 = new JPanel();
    JTextField t1 = new JTextField ();
    public double num1 , num2 , result , radians , value ;
    int fact = 1 , operation ;
public Frama(){
    this.setTitle("calculator");
    this.setSize(300, 350);
    this.setLocation(300, 100);
    this.setResizable(false);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p1.setBackground(Color.BLACK);
    p1.setLayout(null);
    this.add(p1);
    t1.setBackground(Color.PINK);
    t1.setBounds(20, 10, 260, 50);
    p1.add(t1);
    b10.setBackground(Color.CYAN);
    b10.setForeground(Color.BLACK);
    b10.setBounds(2, 285, 85, 25);
    b15.setBackground(Color.WHITE);
    b15.setForeground(Color.BLACK);
    b15.setBounds(90, 285, 83, 25);
    b22.setBackground(Color.WHITE);
    b22.setForeground(Color.BLACK);
    b22.setBounds(180, 285, 110, 25); 
    b1.setBackground(Color.CYAN);
    b1.setForeground(Color.BLACK);
    b1.setBounds(2, 250, 55, 25);
    b2.setBackground(Color.CYAN);
    b2.setForeground(Color.BLACK);
    b2.setBounds(60, 250, 55, 25);
    b3.setBackground(Color.CYAN);
    b3.setForeground(Color.BLACK);
    b3.setBounds(118, 250, 55, 25); 
    b16.setBackground(Color.WHITE);
    b16.setForeground(Color.BLACK);
    b16.setBounds(180, 235, 53, 25);
    b17.setBackground(Color.WHITE);
    b17.setForeground(Color.BLACK);
    b17.setBounds(237, 235, 53, 25);
    b4.setBackground(Color.CYAN);
    b4.setForeground(Color.BLACK);
    b4.setBounds(2, 220, 55, 25);
    b5.setBackground(Color.CYAN);
    b5.setForeground(Color.BLACK);
    b5.setBounds(60, 220, 55, 25);
    b6.setBackground(Color.CYAN);
    b6.setForeground(Color.BLACK);
    b6.setBounds(118, 220, 55, 25);
    b19.setBackground(Color.WHITE);
    b19.setForeground(Color.BLACK);
    b19.setBounds(180, 200, 53, 25);
    b18.setBackground(Color.WHITE);
    b18.setForeground(Color.BLACK);
    b18.setBounds(237, 200, 53, 25);
    b7.setBackground(Color.CYAN);
    b7.setForeground(Color.BLACK);
    b7.setBounds(2, 190, 55, 25);
    b8.setBackground(Color.CYAN);
    b8.setForeground(Color.BLACK);
    b8.setBounds(60, 190, 55, 25);
    b9.setBackground(Color.CYAN);
    b9.setForeground(Color.BLACK);
    b9.setBounds(118, 190, 55, 25);
    b11.setBackground(Color.WHITE);// sin
    b11.setForeground(Color.BLACK);//
    b11.setBounds(2, 100, 65, 25);//
    b12.setBackground(Color.WHITE);// cos
    b12.setForeground(Color.BLACK);//
    b12.setBounds(70, 100, 70, 25);//
    b13.setBackground(Color.WHITE);// tan
    b13.setForeground(Color.BLACK);//
    b13.setBounds(143, 100, 70, 25);//
    b24.setBackground(Color.WHITE); // 1/x
    b24.setForeground(Color.BLACK);//
    b24.setBounds(2, 130, 65, 25); //
    b14.setBackground(Color.WHITE);// x^2
    b14.setForeground(Color.BLACK);//
    b14.setBounds(70, 130, 70, 25);//
    b23.setBackground(Color.WHITE); // %
    b23.setForeground(Color.BLACK);//
    b23.setBounds(143, 160, 70, 25);//
    b21.setBackground(Color.WHITE);// Ac
    b21.setForeground(Color.BLACK);//
    b21.setBounds(217, 100, 75, 25);//
    b20.setBackground(Color.WHITE); // Dell
    b20.setForeground(Color.BLACK);//
    b20.setBounds(217, 130, 75, 25);//
    b25.setBackground(Color.MAGENTA);// off 
    b25.setForeground(Color.BLACK);//
    b25.setBounds(217, 70, 75, 25);//
    b26.setBackground(Color.WHITE);// -/+ 
    b26.setForeground(Color.BLACK);//
    b26.setBounds(2, 160, 65, 25);//
    b27.setBackground(Color.WHITE);// n! 
    b27.setForeground(Color.BLACK);//
    b27.setBounds(70, 160, 70, 25);//
    b28.setBackground(Color.WHITE);// log 
    b28.setForeground(Color.BLACK);//
    b28.setBounds(2, 70, 65, 25);//
    b29.setBackground(Color.WHITE);// sqrt 
    b29.setForeground(Color.BLACK);//
    b29.setBounds(70, 70, 70, 25);//
    b30.setBackground(Color.WHITE);// abs 
    b30.setForeground(Color.BLACK);//
    b30.setBounds(143, 70, 70, 25);//
    b31.setBackground(Color.WHITE);// pi 
    b31.setForeground(Color.BLACK);//
    b31.setBounds(143, 130, 70, 25);//
    p1.add(b10);
    p1.add(b15);
    p1.add(b22);
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b16);
    p1.add(b17);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p1.add(b19);
    p1.add(b18);
    p1.add(b7);
    p1.add(b8);
    p1.add(b9);
    p1.add(b11);
    p1.add(b12);
    p1.add(b13);
    p1.add(b24);
    p1.add(b14);
    p1.add(b23);
    p1.add(b21);
    p1.add(b20);
    p1.add(b25);
    p1.add(b26);
    p1.add(b27);
    p1.add(b28);
    p1.add(b29);
    p1.add(b30);
    p1.add(b31);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);
    b15.addActionListener(this);
    b16.addActionListener(this);
    b17.addActionListener(this);
    b18.addActionListener(this);
    b19.addActionListener(this);
    b20.addActionListener(this);
    b21.addActionListener(this);
    b22.addActionListener(this);
    b23.addActionListener(this);
    b24.addActionListener(this);
    b25.addActionListener(this);
    b26.addActionListener(this);
    b27.addActionListener(this);
    b28.addActionListener(this);
    b29.addActionListener(this);
    b30.addActionListener(this);
    b31.addActionListener(this);
}    
@Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            t1.setText(t1.getText().concat("1"));
        }
        if(ae.getSource()==b2){
            t1.setText(t1.getText().concat("2"));
        }
        if(ae.getSource()==b3){
            t1.setText(t1.getText().concat("3"));
        }
        if(ae.getSource()==b4){
            t1.setText(t1.getText().concat("4"));
        }
        if(ae.getSource()==b5){
            t1.setText(t1.getText().concat("5"));
        }
        if(ae.getSource()==b6){
            t1.setText(t1.getText().concat("6"));
        }
        if(ae.getSource()==b7){
            t1.setText(t1.getText().concat("7"));
        }
        if(ae.getSource()==b8){
            t1.setText(t1.getText().concat("8"));
        }
        if(ae.getSource()==b9){
            t1.setText(t1.getText().concat("9"));
        }
        if(ae.getSource()==b10){
            t1.setText(t1.getText().concat("0"));
        }
        if(ae.getSource()==b11){
            num1 = Double.parseDouble(t1.getText()) ;
            radians = Math.toRadians(num1) ;
            value = Math.sin(radians) ;
            t1.setText(" sin( " + num1 +" ) = " + value);
        }
        if(ae.getSource()==b12){
            num1 = Double.parseDouble(t1.getText()) ;
            radians = Math.toRadians(num1) ;
            value = Math.cos(radians) ;
            t1.setText(" cos( " + num1 + " ) = " + value);
        }
        if(ae.getSource()==b13){
            num1 = Double.parseDouble(t1.getText()) ;
            radians = Math.toRadians(num1) ;
            value = Math.tan(radians) ;
            t1.setText(" tan( " + num1 + " ) = " + value);
        }
        if(ae.getSource()==b14){
            double num = Double.parseDouble(t1.getText()) ;
            num = num * num ;
            t1.setText("" + num);
        }
        if(ae.getSource()==b15){
            t1.setText(t1.getText().concat("."));
            b15.setEnabled(false);
        }
        if(ae.getSource()==b16){
            num1 = Double.parseDouble(t1.getText()) ;
            operation = 1 ;
            t1.setText("");
        }
        if(ae.getSource()==b17){
            num1 = Double.parseDouble(t1.getText()) ;
            operation = 2 ;
            t1.setText("");
        }
        if(ae.getSource()==b18){
            num1 = Double.parseDouble(t1.getText()) ;
            operation = 3 ;
            t1.setText("");
        }
        if(ae.getSource()==b19){
            num1 = Double.parseDouble(t1.getText()) ;
            operation = 4 ;
            t1.setText("");
        }
        if(ae.getSource()==b20){
            String s1 ;
            s1 = t1.getText();
            t1.setText("");
            for(int i = 0 ; i < s1.length()-1 ; i++)
            t1.setText(t1.getText()+ s1.charAt(i));
        }
        if(ae.getSource()==b21){
            t1.setText(" ");
        }
        if(ae.getSource()==b23){
            num1 = Double.parseDouble(t1.getText()) ;
            operation = 5 ;
            t1.setText("");
        }
        if(ae.getSource()==b24){
            double num = Double.parseDouble(t1.getText()) ;
            num = 1 / num ;
            t1.setText("" + num);
        }
        if(ae.getSource()==b25){
            System.exit(0);
        }
        if(ae.getSource()==b26){
           double num = Double.parseDouble(t1.getText()) ;
           num = num * (-1) ;
           t1.setText("" + num);
        }
        if(ae.getSource()==b27){
            double num = Double.parseDouble(t1.getText()) ;
//            for(int a = 1 ; a <= num ; a++ ){
//                fact *= a ;
//            }
            for(int a = (int)num ; a > 0 ; a-- ){
                fact *= a ;
            }
            t1.setText("" + fact);
        }
        if(ae.getSource()==b28){
            num1 = Double.parseDouble(t1.getText()) ;
            double n = Math.log10(num1) ;
            t1.setText("" + n);
        }
        if(ae.getSource()==b29){
            num1 = Double.parseDouble(t1.getText()) ;
            double n = Math.sqrt(num1) ;
            t1.setText("" + n);
        }
        if(ae.getSource()==b30){
            num1 = Double.parseDouble(t1.getText()) ;
            double n = Math.abs(num1) ;
            t1.setText("" + n);
        }
        if(ae.getSource()==b31){
            double n = Math.PI ;
            t1.setText("" + n);
        }
        if(ae.getSource()==b22){
            num2 = Double.parseDouble(t1.getText());
            switch(operation){
                case 1 :
                    result = num1 + num2 ;
                    break ;
                case 2 :
                    result = num1 - num2 ;
                    break ;
                case 3 :
                    result = num1 / num2 ;
                    break ;
                case 4 :
                    result = num1 * num2 ;
                    break ;
                case 5 :
                    result = num1 % num2 ;
                    break ;
                case 6 :
                    result = Math.log10(num1);
                    break ;
                    
            }
            t1.setText(" "+result );
        }
}
}
