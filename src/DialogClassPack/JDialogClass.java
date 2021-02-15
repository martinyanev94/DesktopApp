package DialogClassPack;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JDialogClass {

	public static void main(String[] args) {
		Runnable runner = new Runnable() {
			public void run() {
				String title = (args.length == 0 ? "Desktop Sample" : args[0]);
				JFrame frame = new JFrame(title);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JDesktopPane desktop = new JDesktopPane();
				JInternalFrame internalFrames[] = {new JInternalFrame("Can Do All", true, true, true, true),
						new JInternalFrame("Not Resizable", false, true, true, true),
						new JInternalFrame("Not Closable", true, false, true, true),
						new JInternalFrame("Not Maximizable", false, true, false, true),
						new JInternalFrame("Not Iconifiable", false, true, true, true) };
				InternalFrameListener internalFrameListener = new InternalFrame();
				int pos = 0;
				for (JInternalFrame internalFrame : internalFrames) {
					
					desktop.add(internalFrame);
					
					internalFrame.setBounds(pos * 25, pos *25, 200, 100);
					pos++;
					
					internalFrame.addInternalFrameListener(internalFrameListener);
					JLabel label = new JLabel(internalFrame.getTitle(), JLabel.CENTER);
					internalFrame.add(label, BorderLayout.CENTER);
					
					internalFrame.setVisible(true);
				}
				JInternalFrame palette = new JInternalFrame("Palette", true, false, true, false);
				palette.setBounds(350, 150, 100, 100);
				palette.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
				desktop.add(palette, JDesktopPane.PALETTE_LAYER);
				palette.setVisible(true);
				desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
				frame.add(desktop, BorderLayout.CENTER);
				frame.setSize(500, 300);
				frame.setVisible(true);
			}
		};
		EventQueue.invokeLater(runner);

	}

}
