package Ch9_AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ExempluAWT1 {
	public static void main(String args[]) {
		// Crearea ferestrei - un obiect de tip Frame
		Frame f = new Frame("O fereastra ");
		// Setarea modului de dipunere a componentelor
		f.setLayout(new FlowLayout());
		// Crearea celor doua butoane
		Button b1 = new Button("OK");
		Button b2 = new Button(" Cancel ");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		// Adaugarea butoanelor
		f.add(b1);
		f.add(b2);
		f.pack();
		// Afisarea fereastrei
		f.setVisible(true);
		System.out.println(f.getInsets().toString());
		f.addComponentListener(new ComponentAdapter() {
			
			@Override
			public void componentResized(ComponentEvent e) {
				System.out.println(f.getInsets().toString());
				System.out.println(f.getAlignmentX() +" " +f.getAlignmentY() +" " +f.getSize());
				
			}
			
			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println(f.getSize());
				
			}
		});
	}
}
