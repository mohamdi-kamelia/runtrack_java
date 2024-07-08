package Jour05.Job02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Création de la fenêtre
        JFrame frame = new JFrame("Fenêtre avec BorderLayout");

        // Définir la disposition de la fenêtre à BorderLayout
        frame.setLayout(new BorderLayout());

        // Création du bouton "Quitter"
        JButton quitButton = new JButton("Quitter");

        // Ajout d'un ActionListener pour fermer l'application lorsqu'on clique sur le bouton
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fermer l'application
                System.exit(0);
            }
        });

        // Ajout du bouton au bas de la fenêtre (position BorderLayout.SOUTH)
        frame.add(quitButton, BorderLayout.SOUTH);

        // Définir la taille de la fenêtre
        frame.setSize(400, 300);

        // Définir l'action par défaut pour fermer la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
    
}
