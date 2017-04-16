/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_l2ar;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
        
public class FenetreEtudiant extends JFrame implements ActionListener
{
    private final Bouton1 reinit = new Bouton1("Reinitialiser");
    private final Bouton envoyer = new Bouton("Envoyer");
    private JTextField nom = new JTextField();
    private JTextField prenom = new JTextField();
    private JTextField matricule = new JTextField();
    private JRadioButton sexeM = new JRadioButton("M");
    private JRadioButton sexeF = new JRadioButton("F");
    private JComboBox listEtab = new JComboBox();
    private JComboBox listUniteFonda = new JComboBox();
    private JComboBox listUniteOp = new JComboBox();
    private GridLayout lay =  new GridLayout(9,2);
    
    public FenetreEtudiant(){ 
         super();
         this.setTitle("Fenêtre Etudiant");
         this.setLocationRelativeTo(null);
         this.setSize(500, 400);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Font f = new Font("times new roman",Font.BOLD,18);
         nom.setFont(f);
         prenom.setFont(f);
         matricule.setFont(f);
         reinit.addActionListener(this);
         JLabel lab = new JLabel("Nom : ");
         JLabel lab1 = new JLabel("Prénom : ");
         JLabel lab2 = new JLabel("Sexe : ");
         JLabel lab3 = new JLabel("Etablissement : ");
         JLabel lab4 = new JLabel("Matricule : ");
         JLabel lab5 = new JLabel("Unité Fondamentale : ");
         JLabel lab6 = new JLabel("Unité Transversale : ");
         
         listEtab.addItem("FS");
         listEtab.addItem("FASEG");
         listEtab.addItem("FALSH");
         listEtab.addItem("FSJP");
         listEtab.addItem("IUT");
         listEtab.addItem("ENSAI");
         listUniteFonda.addItem("Base de données");
         listUniteFonda.addItem("Architecture des ordinateurs");
         listUniteFonda.addItem("Systèmes informatiques");
         listUniteFonda.addItem("Algorithmique");
         listUniteFonda.addItem("Arithmetique");
         listUniteFonda.addItem("Télécommunications");
         listUniteOp.addItem("Epistémologie");
         listUniteOp.addItem("Web et applications");
         listUniteOp.addItem("Elevage");
         listUniteOp.addItem("Agriculture");
         listUniteOp.addItem("Energies renouvelables");
         
         lay.setVgap(5);
         lay.setHgap(5);
         this.setLayout(lay);
         this.getContentPane().add(lab);
         this.getContentPane().add(nom);
         this.getContentPane().add(lab1);
         this.getContentPane().add(prenom);
         this.getContentPane().add(lab2);
         this.getContentPane().add(sexeM);
         this.getContentPane().add(new JLabel(" "));
         this.getContentPane().add(sexeF);
         this.getContentPane().add(lab3);
         this.getContentPane().add(listEtab);
         this.getContentPane().add(lab4);
         this.getContentPane().add(matricule);
         this.getContentPane().add(lab5);
         this.getContentPane().add(listUniteFonda);
         this.getContentPane().add(lab6);
         this.getContentPane().add(listUniteOp);
         this.getContentPane().add(reinit);
         this.getContentPane().add(envoyer);
         this.setResizable(false);
         this.setVisible(true);
    }
    public void setNom(){ nom.setText(""); }
    public void setPrenom(){ prenom.setText(""); }
    void setMatricule(){ matricule.setText(""); }
    void setSexeM(){ sexeM.setSelected(false); }
    void setSexeF(){ sexeF.setSelected(false); }
    void setEtab(){ listEtab.setSelectedIndex(0); }
    void setUeFonda(){ listUniteFonda.setSelectedIndex(0); }
    void setUeOp(){ listUniteOp.setSelectedIndex(0); }

    @Override
    public void actionPerformed(ActionEvent e) {
        setNom();
        setPrenom();
        setMatricule();
        setSexeM();
        setSexeF();
        setEtab();
        setUeFonda();
        setUeOp();
    }
}

class Bouton extends JButton implements MouseListener
{
    public Bouton(String str)
    {
        super(str);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        NoteUE fenetre = new NoteUE(null ,"Note UE", true);
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

class Bouton1 extends JButton implements MouseListener
{
    public Bouton1(String str)
    {
        super(str);
        this.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
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
