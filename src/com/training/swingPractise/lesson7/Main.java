package com.training.swingPractise.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {


        JPanel panel = createPanel();
        startGUI(panel);
    }

    private static JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.setSize(400,300);
        JPanel panelColor = new JPanel();
        // изначально цвет нашей панели будет белый
        panelColor.setBackground(Color.white);
        JButton jButton = new JButton("Нажми на меня");
        JButton jButton2 = new JButton("Нажми на меня 2");
        // добавим наши элементы на панель, для отрисовки
        panel.add(panelColor);
        panel.add(jButton);
        panel.add(jButton2);

        // начинаем присоединять слушателей событий кнопок
        // при нажатии на кнопку - будем изменять цвет нашей вложенной панели 
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.black);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.green);
            }
        });


        return panel;
    }

    private static void startGUI(JPanel panel) {
        // создадим наше окно
        JFrame win = new JFrame();
        win.setVisible(true);
        win.setSize(600,400);
        win.add(panel);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


}
