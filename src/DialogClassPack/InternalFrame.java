package DialogClassPack;

import javax.swing.*;
import javax.swing.event.*;

public class InternalFrame extends InternalFrameAdapter {
	public void internalFrame(InternalFrameEvent internalFrameEvent) {
		JInternalFrame source = (JInternalFrame) internalFrameEvent.getSource();
		System.out.println("Iconified: " + source.getTitle());
	}
	
	public void internalFrameDeiconified(InternalFrameEvent internalFrameEvent) {
		JInternalFrame source = (JInternalFrame) internalFrameEvent.getSource();
		System.out.println("Deiconified: " + source.getTitle());
	}

}
