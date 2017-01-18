import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GUIRaumschiff {
	static boolean zielkoordinatenTrue = false;
	
	private static ImageIcon loadImage() {

        ImageIcon ii = new ImageIcon("src/images/Erde.png");
        return ii;
    }
	
	
	
	public static void main(String[]args){
		
		
		
	final Raumschiff raumschiff1 = new Raumschiff("Scavenger", 25, 25, false, false);
		JFrame myFrame = new JFrame("Raumschiffkonsole");

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.setSize(585, 620);
        myFrame.setLocation(600, 250);
        
        JLabel ausgabe = new JLabel("Raumschiffausgabe:");
        ausgabe.setSize(1000, 30);
        ausgabe.setLocation(10, 170);
        myFrame.add(ausgabe);


        final JLabel ausgabetxt = new JLabel("");
        ausgabetxt.setSize(1000, 30);
        ausgabetxt.setLocation(22, 200);
        myFrame.add(ausgabetxt);


        final JLabel ausgabetxt2 = new JLabel("");
        ausgabetxt2.setSize(1000, 30);
        ausgabetxt2.setLocation(22, 220);
        myFrame.add(ausgabetxt2);


        final JLabel ausgabetxt3 = new JLabel("");
        ausgabetxt3.setSize(1000, 30);
        ausgabetxt3.setLocation(22, 240);
        myFrame.add(ausgabetxt3);


        JButton Status = new JButton("Status abfragen");
        Status.setSize(170, 30);
        Status.setLocation(10, 10);
        Status.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ausgabetxt.setText("Name: "+raumschiff1.getname());
            	if (raumschiff1.triebwerke){
            		ausgabetxt2.setText("Triebwerke: an");
            	}
            	else if (!raumschiff1.triebwerke){
            		ausgabetxt2.setText("Triebwerke: aus");
            	}
            	if (raumschiff1.gethyperraum()){
    				ausgabetxt3.setText("Hyperraumantrieb: an");
            	}
            	else if(!raumschiff1.gethyperraum()){
            		ausgabetxt3.setText("Hyperraumantrieb: aus");
            	}
            }
        });
        myFrame.add(Status);


        JButton triebwerkeStarten = new JButton("Triebwerke");
        triebwerkeStarten.setSize(170, 30);
        triebwerkeStarten.setLocation(200, 10);
        triebwerkeStarten.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(raumschiff1.triebwerke){
            		raumschiff1.triebwerke = false;
            		ausgabetxt.setText("Triebwerke deaktiviert!");
            		ausgabetxt2.setText("");
    				ausgabetxt3.setText("");
            	}
            	else if(!raumschiff1.triebwerke){
            		raumschiff1.triebwerke = true;
            		ausgabetxt.setText("Triebwerke aktiviert!");
            		ausgabetxt2.setText("");
    				ausgabetxt3.setText("");
            	}
            }
        });
        myFrame.add(triebwerkeStarten);


        JButton neustart = new JButton("Neustart");
        neustart.setSize(170, 30);
        neustart.setLocation(10, 50);
        neustart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ausgabetxt.setText("");
        		ausgabetxt2.setText("");
				ausgabetxt3.setText("");
				zielkoordinatenTrue = false;
				raumschiff1.triebwerke = false;
            }
        });
        myFrame.add(neustart);


        JButton geschwindigkeit = new JButton("Geschwindigkeit");
        geschwindigkeit.setSize(170, 30);
        geschwindigkeit.setLocation(200, 50);
        geschwindigkeit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	double geschwindigkeit = raumschiff1.geschwindigkeit();
            	if (raumschiff1.triebwerke){
            		ausgabetxt.setText("Das Raumschiff fliegt mit "+geschwindigkeit+" km/h");
            		ausgabetxt2.setText("");
            		ausgabetxt3.setText("");
            	}
            	else if (!raumschiff1.triebwerke){
            		ausgabetxt.setText("Das Raumschiff steht ...");
            		ausgabetxt2.setText("");
    				ausgabetxt3.setText("");
            	}
            }
        });
        myFrame.add(geschwindigkeit);


        JButton selbstzerstoerung = new JButton("Selbstzerstörung");
        selbstzerstoerung.setSize(170, 30);
        selbstzerstoerung.setLocation(390, 50);
        selbstzerstoerung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        myFrame.add(selbstzerstoerung);
 

        JLabel konsole = new JLabel("Zielcomputer:");
        konsole.setSize(1000, 30);
        konsole.setLocation(10, 90);
        myFrame.add(konsole);


        final JTextField konsoletxt = new JTextField();
        konsoletxt.setSize(550, 30);
        konsoletxt.setLocation(10, 130);
        konsoletxt.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                	switch (konsoletxt.getText()) {
					case "Erde":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Mars":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Hoth":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Tatooine":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Corouscant":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Todesstern":
						ausgabetxt.setText("Zielort wurde leider zerstört");
	            		ausgabetxt2.setText("");
	    				ausgabetxt3.setText("");
						break;
					case "Mond":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					default:
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("ist nicht in der Datenbank vorhanden");
						break;
                	}
                	
                }
            }
        });
        myFrame.add(konsoletxt);

        
        JButton hyperraumsprung = new JButton("Hyperraumsprung");
        hyperraumsprung.setSize(170, 30);
        hyperraumsprung.setLocation(390, 10);
        hyperraumsprung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(raumschiff1.triebwerke&&zielkoordinatenTrue){
                	ausgabetxt.setText("Hyperraumsprung ausgeführt!");
            		ausgabetxt2.setText("Willkommen im Orbit von '"+konsoletxt.getText()+"' !");
    				ausgabetxt3.setText("");
    				zielkoordinatenTrue = false;
                }
                else if(!raumschiff1.triebwerke&&!zielkoordinatenTrue){
                	ausgabetxt.setText("Fehler:");
            		ausgabetxt2.setText("Triebwerke sind nicht aktiv");
    				ausgabetxt3.setText("Keine Zielkoordinaten vorhanden");
                }
                else if(!raumschiff1.triebwerke){
                	ausgabetxt.setText("Fehler:");
            		ausgabetxt2.setText("Triebwerke sind nicht aktiv");
    				ausgabetxt3.setText("");
                }
                else if(!zielkoordinatenTrue){
                	ausgabetxt.setText("Fehler:");
            		ausgabetxt2.setText("Keine Zielkoordinaten vorhanden");
    				ausgabetxt3.setText("");
                }
                konsoletxt.setText("");
            }
        });
        myFrame.add(hyperraumsprung);
        
        ImageIcon ii = loadImage();

        JLabel bild = new JLabel(ii);
        bild.setSize(528, 279);
        bild.setLocation(22, 280);
        myFrame.add(bild);
        
       
		myFrame.setVisible(true);
		
		
		
		
		
	}
}
