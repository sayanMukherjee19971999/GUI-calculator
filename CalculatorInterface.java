
package sayan.commandprompt.calculator;

/**
 *
 * @author SAYAN
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorInterface extends JFrame implements ActionListener {

    Double num,ans;
    int calculation;
    JTextField t1;
    JButton one,two,three,four,five,six,seven,percentage,eight,nine,zero,dot,add,clear,equals,subs,mult,div;

    public CalculatorInterface(){

        setSize(250,340);
        setTitle("Calculator");
        setLayout(null);

        t1=new JTextField(50);
        t1.setBounds(10,10,215,50);
        add(t1);

        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");
        add=new JButton("+");

        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        subs=new JButton("-");

        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        mult=new JButton("x");
      

        clear=new JButton("C");
        dot=new JButton(".");
        zero=new JButton("0");
        div=new JButton("/");
       
        equals=new JButton("=");
        percentage=new JButton("%");

        seven.setBounds(10,70,50,40);
        eight.setBounds(65,70,50,40);
        nine.setBounds(120,70,50,40);
        mult.setBounds(175,70,50,40);

        four.setBounds(10,115,50,40);
        five.setBounds(65,115,50,40);
        six.setBounds(120,115,50,40);
        subs.setBounds(175,115,50,40);

        one.setBounds(10,160,50,40);
        two.setBounds(65,160,50,40);
        three.setBounds(120,160,50,40);
        div.setBounds(175,160,50,40);

        clear.setBounds(10,205,50,40);
        zero.setBounds(65,205,50,40);
        dot.setBounds(120,205,50,40);
        
        add.setBounds(175,205,50,86);
        equals.setBounds(65,250,105,40);
        percentage.setBounds(10,250,50,40);
      

        add(seven);
        add(eight);
        add(nine);
        add(mult);
        add(five);
        add(six);
        add(four);
        add(subs);
        add(one);
        add(two);
        add(three);
        add(div);
        add(clear);
        add(zero);
        add(dot);
        add(equals);
        add(add);
        add(percentage);

        add.addActionListener(this);
        subs.addActionListener(this);
        div.addActionListener(this);
        mult.addActionListener(this);
        clear.addActionListener(this);
        dot.addActionListener(this);
        equals.addActionListener(this);
        percentage.addActionListener(this);
        zero.addActionListener(this);
        nine.addActionListener(this);
        eight.addActionListener(this);
        seven.addActionListener(this);
        six.addActionListener(this);
        five.addActionListener(this);
        four.addActionListener(this);
        three.addActionListener(this);
        two.addActionListener(this);
        one.addActionListener(this);
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void arithmetic_operation(){
        switch(calculation){

            case 1:
                ans=num+Double.parseDouble(t1.getText());
                t1.setText(Double.toString(ans));
                break;

            case 2:
                ans=num-Double.parseDouble(t1.getText());
                t1.setText(Double.toString(ans));
                break;

            case 3:
                ans=num*Double.parseDouble(t1.getText());
                t1.setText(Double.toString(ans));
                break;

            case 4:
                ans=num/Double.parseDouble(t1.getText());
                t1.setText(Double.toString(ans));
                break;

            case 5:
                ans=num/100;
                t1.setText(Double.toString(ans));
                break;
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==one){
            t1.setText(t1.getText()+"1");
        }

        if(e.getSource()==two){
            t1.setText(t1.getText()+"2");
        }

        if(e.getSource()==three){
            t1.setText(t1.getText()+"3");
        }

        if(e.getSource()==four){
            t1.setText(t1.getText()+"4");
        }

        if(e.getSource()==five){
            t1.setText(t1.getText()+"5");
        }

        if(e.getSource()==six){
            t1.setText(t1.getText()+"6");
        }

        if(e.getSource()==seven){
            t1.setText(t1.getText()+"7");
        }

        if(e.getSource()==eight){
            t1.setText(t1.getText()+"8");
        }

        if(e.getSource()==nine){
            t1.setText(t1.getText()+"9");
        }

        if(e.getSource()==zero){
            t1.setText(t1.getText()+"0");
        }

        if(e.getSource()==clear){
            t1.setText(" ");
        }

        if(e.getSource()==add){
            num=Double.parseDouble(t1.getText());
            calculation=1;
            t1.setText(" ");
        }

         if(e.getSource()==subs){
            num=Double.parseDouble(t1.getText());
            calculation=2;
            t1.setText(" ");
        }

         if(e.getSource()==mult){
            num=Double.parseDouble(t1.getText());
            calculation=3;
            t1.setText(" ");
        }

         if(e.getSource()==div){
            num=Double.parseDouble(t1.getText());
            calculation=4;
            t1.setText(" ");
        }

         if(e.getSource()==percentage){
            num=Double.parseDouble(t1.getText());
            calculation=5;
            t1.setText(" ");
        }

        if(e.getSource()==dot){
            t1.setText(t1.getText()+".");
        }

        if(e.getSource()==equals){
            arithmetic_operation();
        }
       
    }
    

    public static void main(String args[]){
        
        new CalculatorInterface();
    }
}