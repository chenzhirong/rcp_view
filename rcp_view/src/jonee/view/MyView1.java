package jonee.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.layout.FillLayout;

public class MyView1 extends ViewPart {
	private Table table;
	public MyView1() {
		init();
	}
	private void init() {
		
	}
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Tree tree = new Tree(composite, SWT.BORDER);
		
		TreeItem trtmRoot = new TreeItem(tree, SWT.NONE);
		trtmRoot.setText("root");
		
		TreeItem trtmNewTreeitem = new TreeItem(trtmRoot, SWT.NONE);
		trtmNewTreeitem.setText("New TreeItem");
		
		TreeItem treeItem_1 = new TreeItem(trtmNewTreeitem, 0);
		treeItem_1.setText("New TreeItem");
		
		TreeItem treeItem_8 = new TreeItem(trtmNewTreeitem, 0);
		treeItem_8.setText("New TreeItem");
		trtmNewTreeitem.setExpanded(true);
		
		TreeItem treeItem_2 = new TreeItem(trtmRoot, 0);
		treeItem_2.setText("New TreeItem");
		
		TreeItem treeItem_3 = new TreeItem(trtmRoot, 0);
		treeItem_3.setText("New TreeItem");
		
		TreeItem treeItem_4 = new TreeItem(trtmRoot, 0);
		treeItem_4.setText("New TreeItem");
		
		TreeItem treeItem_5 = new TreeItem(trtmRoot, 0);
		treeItem_5.setText("New TreeItem");
		
		TreeItem treeItem_6 = new TreeItem(trtmRoot, 0);
		treeItem_6.setText("New TreeItem");
		
		TreeItem treeItem_7 = new TreeItem(trtmRoot, 0);
		treeItem_7.setText("New TreeItem");
		trtmRoot.setExpanded(true);
		
		TreeItem treeItem = new TreeItem(tree, 0);
		treeItem.setText("New TreeItem");
	
	}

	@Override
	public void setFocus() {
	}
}