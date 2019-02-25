import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class SimpleCalculator extends JFrame implements KeyListener {
    ArrayList<JButton>buttons=new ArrayList<JButton>();
    ArrayList<String>operations=new ArrayList<String>();

    boolean equalsPressed=false;
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
    Font font=null;


    public SimpleCalculator() {
        font = new Font("Monotype Corsiva", Font.BOLD,24);
        txt_operand2.setFont(font);
        txt_operand1.setFont(font);
        operation.setFont(font);
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

        operations.add(btn_mult.getText());
        operations.add(btn_divide.getText());
        operations.add(btn_add.getText());
        operations.add(btn_subtract.getText());
        operations.add(btn_equals.getText());
        operations.add(btn_signChange.getText());
        operations.add(btn_equals.getText());
        operations.add(btn_clear.getText());
        operations.add(btn_decimal.getText());



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
        if(getNumberFromString(e.getActionCommand())!=null&&getNumberFromString(e.getActionCommand())<10){
            if(equalsPressed) {
                System.out.println("HEY I PRESSED EQUAL");
                txt_operand2.setText("");
                equalsPressed=false;
            }
            System.out.println("number found");
            txt_operand2.setHorizontalAlignment(SwingConstants.RIGHT);
            txt_operand2.setText(txt_operand2.getText()+e.getActionCommand());
        }
        if(e.getActionCommand().equals("+")) {

            operation.setHorizontalAlignment(SwingConstants.RIGHT);
            operation.setText("+");
            if(txt_operand1.getText().length()==0) {
                txt_operand1.setHorizontalAlignment(SwingConstants.RIGHT);
                txt_operand1.setText(txt_operand2.getText());
            }
            txt_operand2.setText("");
        }
        else if(e.getActionCommand().equals("-")) {
            operation.setHorizontalAlignment(SwingConstants.RIGHT);
            operation.setText("-");
            if(txt_operand1.getText().length()==0) {
                txt_operand1.setHorizontalAlignment(SwingConstants.RIGHT);
                txt_operand1.setText(txt_operand2.getText());
            }
            txt_operand2.setText("");
        }
        else if(e.getActionCommand().equals(btn_divide.getText())) {
            operation.setHorizontalAlignment(SwingConstants.RIGHT);
            operation.setText(btn_divide.getText());
            if(txt_operand1.getText().length()==0) {
                txt_operand1.setHorizontalAlignment(SwingConstants.RIGHT);
                txt_operand1.setText(txt_operand2.getText());
            }
            txt_operand2.setText("");
        }
        else if(e.getActionCommand().equals(btn_clear.getText())) {
            System.out.println("HEY CLEAR");
            operation.setText("");
            txt_operand2.setText("");
            txt_operand1.setText("");
        }

        else if(e.getActionCommand().equals(btn_mult.getText())) {
            operation.setHorizontalAlignment(SwingConstants.RIGHT);
            operation.setText(btn_mult.getText());
            if(txt_operand1.getText().length()==0) {
                txt_operand1.setHorizontalAlignment(SwingConstants.RIGHT);
                txt_operand1.setText(txt_operand2.getText());
            }
            txt_operand2.setText("");
        }
        else if(e.getActionCommand().equals(btn_signChange.getText())) {
            /*System.out.println(txt_operand2);
            System.out.println(txt_operand2.getText());*/
            if (txt_operand2.getText().length() == 0) {
                txt_operand2.setHorizontalAlignment(SwingConstants.RIGHT);
                txt_operand2.setText(txt_operand2.getText() + "-");
                return;
            }
            if(!txt_operand2.getText().contains("-")) {
                txt_operand2.setHorizontalAlignment(SwingConstants.RIGHT);
                txt_operand2.setText("-"+txt_operand2.getText());
            }
            else{
                if(txt_operand2.getText().equals("-")) {
                    txt_operand2.setHorizontalAlignment(SwingConstants.RIGHT);
                    txt_operand2.setText("");
                }
                String actual="";
                for(int x=0;x<txt_operand2.getText().length();x++) {
                    if(txt_operand2.getText().charAt(x)!='-') {
                        actual+=txt_operand2.getText().charAt(x);
                    }
                }
                txt_operand2.setHorizontalAlignment(SwingConstants.RIGHT);
                txt_operand2.setText(actual);
            }
        }
        else if(e.getActionCommand().equals(btn_decimal.getText())) {

            equalsPressed=false;
            if(txt_operand2.getText().contains(".")) {
                return;
            }

            txt_operand2.setHorizontalAlignment(SwingConstants.RIGHT);
            txt_operand2.setText(txt_operand2.getText()+".");
        }
        else if(e.getActionCommand().equals("=")) {
            equalsPressed=true;

            txt_operand2.setHorizontalAlignment(SwingConstants.RIGHT);
            if(txt_operand2.getText().length()==0) {
                txt_operand2.setHorizontalAlignment(SwingConstants.RIGHT);
                txt_operand2.setText("YOU DON'T HAVE A NUMBER, YOU FOOL");
                txt_operand2.setFont(font);
                return;
            }
            if(txt_operand1.getText()==""||txt_operand2.getText()=="") {
                System.out.println("Invalid Input");
                return;
            }
            if(operation.getText().equals("+")) {
                Double d =Double.parseDouble(txt_operand2.getText()) + Double.parseDouble(txt_operand1.getText());
                txt_operand2.setText("" + d);
                txt_operand1.setText("");
                operation.setText("");
            }
            if(operation.getText().equals("-")) {
                Double d =Double.parseDouble(txt_operand2.getText()) - Double.parseDouble(txt_operand1.getText());
                txt_operand2.setText("" + d);
                txt_operand1.setText("");
                operation.setText("");
            }
            if(operation.getText().equals(btn_mult.getText())) {
                Double d =Double.parseDouble(txt_operand2.getText()) * Double.parseDouble(txt_operand1.getText());
                txt_operand2.setText("" + d);
                txt_operand1.setText("");
                operation.setText("");
            }

            if(operation.getText().equals(btn_divide.getText())) {
                Double d =Double.parseDouble(txt_operand2.getText()) / Double.parseDouble(txt_operand1.getText());
                txt_operand2.setText("" + d);
                txt_operand1.setText("");
                operation.setText("");
            }

        }
        /*if number, add number to string, same for decimals, but check to make sure that
        there are no pre-existing decimals.
         */
    }
    public Double getNumberFromString(String s) {
        for(String t:operations) {
            if(s.equals(t)) {
                return null;
            }
        }
        if(!(s==null)) {
            if (!s.equals("")) {
                return Double.parseDouble(s);
            }
        }
        return null;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
