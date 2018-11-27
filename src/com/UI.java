package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class UI extends JFrame {
    private Scanner reader;
    private ShoppingList shoppingList;
    private JList jList;

    UI(){
        reader = new Scanner(System.in);
        shoppingList = new ShoppingList(reader);
        jList = new JList();
        this.getContentPane().add(this.prepareMainPanel());
        this.setFrame();
    }

    private JPanel prepareMainPanel() {
        JPanel tmpPanel = new JPanel();
        tmpPanel.setPreferredSize(new Dimension(600, 600));
        tmpPanel.setLayout(new FlowLayout());
        tmpPanel.add(jList);
        tmpPanel.add(prepareBoomButton());
        return tmpPanel;
    }

    private JButton prepareBoomButton() {
        JButton tmpButton = new JButton("Boom button");
        tmpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shoppingList.add(new ListEntry("boom"));
                jList.setListData(shoppingList);
            }
        });
        return tmpButton;
    }

    private void setFrame(){
        this.setTitle("Shopping List");
        this.pack();
        this.setVisible(true);
    }

    private void temporaryFill(ShoppingList shoppingList){
        shoppingList.add(new ListEntry("kotlet"));
        shoppingList.add(new ListEntry("makaron"));
    }
}
