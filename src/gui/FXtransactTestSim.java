package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import java.awt.Rectangle;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JRadioButton;

import com.tomtessier.scrollabledesktop.JScrollableDesktopPane;
import javax.swing.JMenuBar;

public class FXtransactTestSim {

	private JFrame frmFxtransacttestsim;
	private JScrollableDesktopPane sdp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FXtransactTestSim window = new FXtransactTestSim();
					window.frmFxtransacttestsim.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FXtransactTestSim() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFxtransacttestsim = new JFrame();
		frmFxtransacttestsim.setTitle("FXtransactTestSim");
		frmFxtransacttestsim.setBounds(100, 100, 800, 600);
		frmFxtransacttestsim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFxtransacttestsim.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmFxtransacttestsim.getContentPane().add(panel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(5, 5, 91, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		frmFxtransacttestsim.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		frmFxtransacttestsim.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		frmFxtransacttestsim.getContentPane().add(panel_3, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_3.add(btnNewButton_3);
		
		sdp = new JScrollableDesktopPane();
		sdp.setBorder(new LineBorder(SystemColor.desktop, 4));
		frmFxtransacttestsim.getContentPane().add(sdp, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		panel_1.add(toolBar);
		
		JButton btnNewButton_1 = new JButton("Order");
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Quotes");
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Log");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame logFrame = new LogInternalFrame();
				sdp.add(logFrame);				
			}
		});
		toolBar.add(btnNewButton_5);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame internalFrame = new QuotesInternalFrame();
				sdp.add(internalFrame);								
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame internalFrame = new OrderInternalFrame();
				sdp.add(internalFrame);								
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        JMenuItem menuItem = new JMenuItem("Exit");
        menuItem.setMnemonic(KeyEvent.VK_X);
        menuItem.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                    System.exit(0);
              }
          });
        menu.add(menuItem);

        menuBar.add(menu);        
		
		
		frmFxtransacttestsim.setJMenuBar(menuBar);
		
        // register the menu bar with the scrollable desktop
        sdp.registerMenuBar(menuBar);

		//quotePanel
	}
}
