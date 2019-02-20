import javax.swing.*;
import java.util.ArrayList;

public class SimpleCalculator extends JFrame {
    ArrayList<JLabel>buttons=new ArrayList<JLabel>();
    JButton btn_1=new JButton("1");
    JButton btn_2=new JButton("2");
    JButton btn_3=new JButton("3");
    JButton btn_4=new JButton("4");
    JButton btn_5=new JButton("5");
    JButton btn_6=new JButton("6");
    JButton btn_7=new JButton("7");
    JButton btn_8=new JButton("8");
    JButton btn_9=new JButton("9");
    JButton btn_mult=new JButton("×");
    JButton btn_divide=new JButton("÷");
    JButton btn_add=new JButton("+");
    JButton btn_subtract=new JButton("-");
    JButton btn_clear=new JButton("C");
    JButton btn_signChange=new JButton("+/-");
    JButton btn_decimal=new JButton(".");
    JTextField txt_operand2=new JTextField();
    JTextField txt_operand1=new JTextField();
    JTextField operation=new JTextField();


    public SimpleCalculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(null);

        /*lbl_operand1.setBounds(100,100,75,25);
        txt_operand1.setBounds(175,100,125,25);

        lbl_operand2.setBounds(100,150,75,25);
        txt_operand2.setBounds(175,150,125,25);
*/
        /*btn_add.setBounds(150,200,100,25);

        lbl_result.setBounds(100,250,200,25);

        /*btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add();
            }
        });*/

        /*add(lbl_operand1);
        add(txt_operand1);
        add(lbl_operand2);
        add(txt_operand2);
        add(btn_add);
        add(lbl_result);*/
        btn_1.setBounds(5,100,50,50);
        btn_2.setBounds(60,100,50,50);
        btn_3.setBounds(115,100,50,50);
        btn_4.setBounds(5,155,50,50);
        btn_5.setBounds(60,155,50,50);
        btn_6.setBounds(115,155,50,50);
        btn_7.setBounds(5,210,50,50);
        btn_8.setBounds(60,210,50,50);
        btn_9.setBounds(115,210,50,50);
        txt_operand1.setBounds(10,10,360,40);
        txt_operand1.setEditable(false);

        add(txt_operand1);
        add(btn_1);
        add(btn_2);
        add(btn_3);
        add(btn_4);
        add(btn_5);
        add(btn_6);
        add(btn_7);
        add(btn_8);
        add(btn_9);

        setVisible(true);
    }
}
