package HW1;

import javax.swing.*;

public class Homework1 {

    public static void main(String[] args) {
        try{

            input();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }



    }
    public static void input() throws Exception{
        String name = JOptionPane.showInputDialog("What is your name?");
        String f_num = JOptionPane.showInputDialog("Enter first number");
        String sec_num = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(f_num);
        int num2 = Integer.parseInt(sec_num);
        int result = num1 + num2;

        JOptionPane.showMessageDialog(null,"Welcome "+name+" The sum is "+result,"The Sum Of Two Numbers",JOptionPane.PLAIN_MESSAGE);
        throw new Exception();

    }
}
