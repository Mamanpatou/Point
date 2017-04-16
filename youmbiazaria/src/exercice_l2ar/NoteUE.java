/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_l2ar;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NoteUE extends JDialog implements ActionListener
{
    private JButton reinit = new JButton("Reinitialiser");
    private Bouton2 envoyer = new Bouton2("Envoyer");
    private GridLayout lay = new GridLayout(6,3);
    private JTextField creditF = new JTextField();
    private JTextField noteF = new JTextField();
    private JTextField creditOp = new JTextField();
    private JTextField noteOp = new JTextField();
    public NoteUE(JFrame parent,String str,boolean modal)
    {
        super(parent,str,modal);
        this.setLocationRelativeTo(null);
        this.setSize(400, 300);
        lay.setVgap(5);
        lay.setHgap(5);
        this.setLayout(lay);
        reinit.addActionListener(this);
        this.getContentPane().add(new JLabel("UE fondamentale"));
        this.getContentPane().add(new JLabel("Note"));
        this.getContentPane().add(new JLabel("Crédit"));
        this.getContentPane().add(new JLabel("#CODE_UE"));
        this.getContentPane().add(noteF);
        this.getContentPane().add(creditF);
        this.getContentPane().add(new JLabel("UE optionnelle"));
        this.getContentPane().add(new JLabel("Note"));
        this.getContentPane().add(new JLabel("Crédit"));
        this.getContentPane().add(new JLabel("#CODE_UE"));
        this.getContentPane().add(noteOp);
        this.getContentPane().add(creditOp);
        this.getContentPane().add(new JLabel(""));
        this.getContentPane().add(reinit);
        this.getContentPane().add(envoyer);
        this.setVisible(true);
    }
    public void setNoteF(){ noteF.setText(""); }
    public void setNoteOp(){ noteOp.setText(""); }
    public void setCreditF(){creditF.setText(""); }
    public void setCreditOp(){creditOp.setText(""); }
    @Override
    public void actionPerformed(ActionEvent e) {
        setNoteF();
        setNoteOp();
        setCreditF();
        setCreditOp();
    }
}

class Bouton2 extends JButton implements MouseListener
{
    public Bouton2(String str)
    {
        super(str);
        this.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Recap p = new Recap(null,"Récapitulatif",true);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    } 
}