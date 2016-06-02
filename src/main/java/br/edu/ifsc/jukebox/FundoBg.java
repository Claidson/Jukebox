/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.jukebox;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Image;
import java.net.URL;


import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Aluno
 */
public class FundoBg extends JPanel {

    private Image image;

    public FundoBg() {
        this.initialize();
    }

    protected void initialize() {
        this.image = this.getImage("/fundo.png");
        this.setLayout(new BorderLayout());
    }

    public Image getImage(String path) {
        URL imageURL = getClass().getResource(path);
        if (imageURL == null) {
            return null;
        }
        return new ImageIcon(imageURL).getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension dDesktop = this.getSize();
        double width = dDesktop.getWidth();
        double height = dDesktop.getHeight();
        Image background = new ImageIcon(this.image.getScaledInstance(
                (int) width, (int) height, 1)).getImage();
        g.drawImage(background, 0, 0, this);
    }
}