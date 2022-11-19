
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing_RadioButtonsDemo extends JFrame implements ActionListener {
    JLabel lb_title, lb_name, lb_gen, lb_course, lb_feespaid;
    JTextField tf_name, tf_course, tf_fesspaid;
    JButton but_result, but_close;
    ButtonGroup bg;
    JRadioButton rb1, rb2;

    Swing_RadioButtonsDemo() {
        setSize(1000, 600);
        setVisible(true);
        setLayout(null);
        lb_title = new JLabel("Demo of swing Radio Buttons");
        lb_name = new JLabel("Student Name");
        lb_gen = new JLabel("Gender");
        lb_course = new JLabel("Course");
        lb_feespaid = new JLabel("FeesPaid");
        tf_name = new JTextField();
        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        tf_course = new JTextField();
        tf_fesspaid = new JTextField();
        but_result = new JButton("Result");
        but_close = new JButton("Close Form");

        Font f1 = new Font("Arial Black", Font.PLAIN, 36);
        Font f2 = new Font("Times new Roman", Font.PLAIN, 26);

        add(lb_title);
        add(lb_name);
        add(lb_gen);
        add(lb_course);
        add(lb_feespaid);
        add(tf_course);
        add(tf_name);
        add(tf_fesspaid);
        add(rb1);
        add(rb2);
        add(but_close);
        add(but_result);
        lb_title.setFont(f1);
        lb_name.setFont(f2);
        lb_course.setFont(f2);
        lb_gen.setFont(f2);
        lb_feespaid.setFont(f2);
        but_close.setFont(f2);
        but_result.setFont(f2);
        rb1.setFont(f2);
        rb2.setFont(f2);
        lb_title.setBounds(200, 100, 600, 45);
        lb_name.setBounds(200, 200, 200, 30);
        tf_name.setBounds(425, 200, 300, 30);
        lb_gen.setBounds(200, 250, 200, 30);
        rb1.setBounds(425, 250, 100, 30);
        rb2.setBounds(550, 250, 150, 30);
        lb_course.setBounds(200, 300, 200, 30);
        tf_course.setBounds(425, 300, 300, 30);
        lb_feespaid.setBounds(200, 350, 200, 30);
        tf_fesspaid.setBounds(425, 350, 200, 30);
        but_result.setBounds(250, 450, 200, 30);
        but_close.setBounds(500, 450, 200, 30);

        but_result.addActionListener(this);
        but_close.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==but_result){
            Double ac;
            if(rb1.isSelected()){
                ac=(10*Double.parseDouble(tf_fesspaid.getText())/100);
            }
           else if(rb2.isSelected()){
            ac=(15*Double.parseDouble(tf_fesspaid.getText())/100);
           }
           else
            ac=0.0;
           
           JOptionPane.showMessageDialog(this, "Applicable Concession:"+ac);
         }
         else if(ae.getSource()==but_close){
         dispose();
         }
    }

    public static void main(String args[]) {
        Swing_RadioButtonsDemo sa = new Swing_RadioButtonsDemo();
    }
}
