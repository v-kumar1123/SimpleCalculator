import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class SimpleCalculator extends JFrame {
    ArrayList<JButton>buttons=new ArrayList<JButton>();
    JButton btn_0=new JButton("0");
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
    JButton btn_equals=new JButton("=");
    JTextField txt_operand2=new JTextField();
    JTextField txt_operand1=new JTextField();
    JTextField operation=new JTextField();


    public SimpleCalculator() {
        buttons.add(btn_0);
        buttons.add(btn_1);
        buttons.add(btn_2);
        buttons.add(btn_3);
        buttons.add(btn_4);
        buttons.add(btn_5);
        buttons.add(btn_6);
        buttons.add(btn_7);
        buttons.add(btn_8);
        buttons.add(btn_9);
        buttons.add(btn_mult);
        buttons.add(btn_add);
        buttons.add(btn_subtract);
        buttons.add(btn_divide);
        buttons.add(btn_equals);
        buttons.add(btn_clear);
        buttons.add(btn_decimal);
        buttons.add(btn_signChange);


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
        btn_1.setBounds(5,150,50,50);
        btn_2.setBounds(60,150,50,50);
        btn_3.setBounds(115,150,50,50);
        btn_4.setBounds(5,205,50,50);
        btn_5.setBounds(60,205,50,50);
        btn_6.setBounds(115,205,50,50);
        btn_7.setBounds(5,260,50,50);
        btn_8.setBounds(60,260,50,50);
        btn_9.setBounds(115,260,50,50);
        btn_add.setBounds(175,150,50,75);
        btn_subtract.setBounds(225,150,50,75);
        btn_mult.setBounds(275,150,50,75);
        btn_divide.setBounds(325,150,50,75);
        btn_signChange.setBounds(175,230,100,50);
        btn_decimal.setBounds(275,230,100,50);
        btn_clear.setBounds(175,280,200,75);
        btn_0.setBounds(5,310,95,45);
        btn_equals.setBounds(100,310,65,45);
        txt_operand1.setBounds(10,10,360,40);
        txt_operand1.setEditable(false);
        operation.setBounds(320,50,50,40);
        operation.setEditable(false);
        txt_operand2.setBounds(10,90,360,40);
        txt_operand2.setEditable(false);
        for(JButton j:buttons) {
            j.addActionListener(e -> processOperation(e));
        }

        add(txt_operand1);
        add(txt_operand2);
        add(operation);
        add(btn_signChange);
        add(btn_clear);
        add(btn_decimal);
        add(btn_equals);
        add(btn_0);
        add(btn_1);
        add(btn_2);
        add(btn_3);
        add(btn_4);
        add(btn_5);
        add(btn_6);
        add(btn_7);
        add(btn_8);
        add(btn_9);
        add(btn_divide);
        add(btn_mult);
        add(btn_add);
        add(btn_subtract);
        setVisible(true);
    }

    public void processOperation(ActionEvent e) {
        if(e.getActionCommand().equals("+")) {
            operation.setText("+");
        }
        else if(e.getActionCommand().equals("-")) {
            operation.setText("-");
        }
        /*if number, add number to string, same for decimals, but check to make sure that
        there are no pre-existing decimals.
         */
    }
}
