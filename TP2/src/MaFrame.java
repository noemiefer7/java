import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class MaFrame extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaFrame frame = new MaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MaFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnLancerLeProgramme = new JMenu("Lancer le programme");
		menuBar.add(mnLancerLeProgramme);
		
		JMenuItem mntmAfficherImage = new JMenuItem("Afficher image");
		mnLancerLeProgramme.add(mntmAfficherImage);
		mntmAfficherImage.addActionListener(this);
		
		JMenuItem mntmDmarrerAnimation = new JMenuItem("D\u00E9marrer animation");
		mnLancerLeProgramme.add(mntmDmarrerAnimation);
		mntmDmarrerAnimation.addActionListener(this);
		
		JMenuItem mntmArrterAnimation = new JMenuItem("Arr\u00EAter animation");
		mnLancerLeProgramme.add(mntmArrterAnimation);
		mntmArrterAnimation.addActionListener(this);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mnLancerLeProgramme.add(mntmQuitter);
		mntmQuitter.addActionListener(this);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
