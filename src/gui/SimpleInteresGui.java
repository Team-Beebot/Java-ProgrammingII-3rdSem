package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInteresGui {

    JFrame frameOne;
    JLabel lblPrinciple, lblTime, lblRate, lblOutput;
    JTextField txtPrinciple, txtTime, txtRate;
    JButton btnCalculate;


    public static float simpleInterest(int principle, int time, int rate){
        float output = (principle*time*rate*0.01f);
        return output;
    }




    public SimpleInteresGui(){

        frameOne = new JFrame("Simple interest Calculator"); //frame for simpleinterest.
        frameOne.setLayout(null);
        frameOne.setSize(400, 400);

        // label for principle
        lblPrinciple = new JLabel("Enter a Principle:");
        lblPrinciple.setBounds(20, 20, 150, 30);

        // textfield for principle
        txtPrinciple = new JTextField();
        txtPrinciple.setBounds(160, 20, 150, 30);


        // label for time
        lblTime = new JLabel("Enter a Time:");
        lblTime.setBounds(20, 50, 150, 50);

        // textfield for time
        txtTime = new JTextField();
        txtTime.setBounds(160, 60, 150, 30);



        // label for Rate
        lblRate = new JLabel("Enter a Rate:");
        lblRate.setBounds(20, 90, 150, 50);

        // textfield for Rate
        txtRate = new JTextField();
        txtRate.setBounds(160, 100, 150, 30);


        // button for calculate
        btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(110, 180, 140, 30);

        // output  label
        lblOutput = new JLabel("Output: null");
        lblOutput.setBounds(20, 250, 140, 30);


        // listoner action perform while click in button
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int principle = Integer.parseInt(txtPrinciple.getText());
                int time = Integer.parseInt(txtTime.getText());
                int rate = Integer.parseInt(txtRate.getText());
                float output = simpleInterest(principle,  time, rate);
                lblOutput.setText(Float.toString( output));
            }
        });













        // add all the component
        frameOne.add(lblPrinciple);
        frameOne.add(lblTime);
        frameOne.add(lblRate);
        frameOne.add(txtPrinciple);
        frameOne.add(txtTime);
        frameOne.add(txtRate);
        frameOne.add(btnCalculate);
        frameOne.add(lblOutput);







        frameOne.setVisible(true);
        frameOne.setLocationRelativeTo(null); //centerlocation.
        frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public static void main(String[] args) {

        new SimpleInteresGui();

    }
}
