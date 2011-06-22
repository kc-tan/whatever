package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JDesktopPane;
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
import javax.swing.JRadioButton;

import com.tomtessier.scrollabledesktop.JScrollableDesktopPane;

public class FXtransactTestSiim {

	private JFrame frmFxtransacttestsim;
	private JScrollableDesktopPane sdp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FXtransactTestSiim window = new FXtransactTestSiim();
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
	public FXtransactTestSiim() {
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
		
		JButton btnNewButton_1 = new JButton("Order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame internalFrame = new OrderInternalFrame();
				sdp.add(internalFrame);								
			}
		});
		panel_1.add(btnNewButton_1);		
		
		JButton btnNewButton_4 = new JButton("Quotes");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame internalFrame = new QuotesInternalFrame();
				sdp.add(internalFrame);								
			}
		});
		panel_1.add(btnNewButton_4);

		//quotePanel
	}
}
