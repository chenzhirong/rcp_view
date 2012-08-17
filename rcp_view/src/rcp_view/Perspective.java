package rcp_view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
	    layout.setEditorAreaVisible(true);
		IFolderLayout folder1=layout.createFolder("folderId1", IPageLayout.LEFT, 0.3f, layout.getEditorArea());
		folder1.addView("rcp_view.view1");
		folder1.addView("rcp_view.view2");
		folder1.addView("rcp_view.view3");
		
	}
}
