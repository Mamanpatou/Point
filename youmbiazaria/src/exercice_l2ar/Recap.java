/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_l2ar;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Recap extends JDialog
{
    BorderLayout lay = new BorderLayout();
    JLabel label = new JLabel();
    public Recap(JFrame f, String str, boolean modal){ 
        super(f,str,modal);
        this.setLocationRelativeTo(null);
        this.setSize(700, 300);
        label.setText("L'étudiant ..... de sexe ..... de matricule .. ayant composé les UE ..... a la "
                + "moyenne de .....");
        this.add(label);
        this.setVisible(true);
    }
}
