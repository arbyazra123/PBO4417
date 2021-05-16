/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtjava;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Lenovo
 */
public class AwtController {
    
    
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    AwtController(){
        prepareGUI();
    }
    public void prepareGUI() {
        mainFrame = new Frame("Java AWT Example");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    public void showEventDemo() {
        headerLabel.setText("Control in action: Button");

        Button btnOk = new Button("Ok");
        Button btnSubmit = new Button("Submit");
        Button btnCancel = new Button("Cancel");

        btnOk.setActionCommand("Ok");
        btnSubmit.setActionCommand("Submit");
        btnCancel.setActionCommand("Cancel");

        btnOk.addActionListener(new ButtonClickListener());
        btnSubmit.addActionListener(new ButtonClickListener());
        btnCancel.addActionListener(new ButtonClickListener());

        controlPanel.add(btnOk);
        controlPanel.add(btnSubmit);
        controlPanel.add(btnCancel);
        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if (cmd.equals("Ok")) {
                statusLabel.setText("Ok Button Clicked");
            } else if (cmd.equals("Submit")) {
                statusLabel.setText("Submit Button Clicked");

            } else {
                statusLabel.setText("Cancel Button Clicked");

            }
        }

    }
}
