package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGuiJava {

    JFrame myFrame;
    JLabel lblFirst, lblSecond, lblResult;
    JTextField txtFirst, txtSecond;
    JButton btnAdd, btnSub;

    //add function
    public static int add( int first, int second){
        int result = first + second;
        return result;

    }

    //subtract function
    public static int sub(int first, int second){
        int result = first - second;
        return result;
    }



    //constructor
    public  FirstGuiJava(){
        myFrame = new JFrame("Beebot Robo");
        myFrame.setLayout(null);
        myFrame.setSize(400, 400);


        //first label
        lblFirst = new JLabel("Enter first number:");
        lblFirst.setBounds(20, 20, 150, 30);

        //txt first
        txtFirst = new JTextField();
        txtFirst.setBounds(180, 20, 150, 30);


        //second label
        lblSecond = new JLabel("Enter second number:");
        lblSecond.setBounds(20, 60, 150, 30);

        //txt second
        txtSecond= new JTextField();
        txtSecond.setBounds(180, 60, 150, 30);

        //Add button
        btnAdd = new JButton("ADD");
        btnAdd.setBounds(20, 100, 150, 30);

        //Sub button
        btnSub = new JButton("Subtract");
        btnSub.setBounds(180, 100, 150,30);

        //result jlable

        lblResult = new JLabel("Result: null");
        lblResult.setBounds(20, 160, 150, 30);

        //click listoner add
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(txtFirst.getText());
                int second = Integer.parseInt(txtSecond.getText());
                 int result = add(first, second);
                lblResult.setText(Integer.toString(result));
            }
        });

        //click listoner subtract
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(txtFirst.getText());
                int second = Integer.parseInt(txtSecond.getText());
                 int result = sub(first, second);
                lblResult.setText(Integer.toString(result));
            }
        });











        //add in the frame
        myFrame.add(lblFirst);
        myFrame.add(txtFirst);
        myFrame.add(lblSecond);
        myFrame.add(txtSecond);
        myFrame.add(btnAdd);
        myFrame.add(btnSub);
        myFrame.add(lblResult);







        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);// for popup gui in center.
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // completely close



    }


    public static void main(String[] args) {

        new FirstGuiJava();


    }
}
