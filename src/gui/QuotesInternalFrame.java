package gui;

import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;

import com.tomtessier.scrollabledesktop.BaseInternalFrame;
import com.tomtessier.scrollabledesktop.JScrollableDesktopPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class QuotesInternalFrame extends BaseInternalFrame {
	private JScrollableDesktopPane sdp;
	
	/**
	 * Create the frame.
	 */
	public QuotesInternalFrame() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				 sdp.tileInternalFrames();
			}
			@Override
			public void componentResized(ComponentEvent e) {
				if (sdp.getAutoTile()) {
					sdp.tileInternalFrames();
				}
			}
		});
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 575, 347);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setVisible(true);
		this.setTitle("Quotes");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		sdp = new JScrollableDesktopPane();		
		sdp.setBorder(null);
		getContentPane().add(sdp, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();		
		setJMenuBar(menuBar);		
        // register the menu bar with the scrollable desktop
		sdp.setAutoTile(true);
		sdp.registerMenuBar(menuBar, true);        
        
        String currencies[] = {"USD", "CAD", "JPY", "AUD", "NZD", "GBP", "EUR", "CHF", "SEK", "NOK"};
        for (int i=0; i<currencies.length; i++) {
        	JInternalFrame frame = new QuoteInternalFrame();
        	frame.setTitle(currencies[i]);
        	sdp.add(frame);        	
        }       
        
		//quotePanel
	}	

}
