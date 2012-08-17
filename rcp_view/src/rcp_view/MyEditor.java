package rcp_view;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.layout.FillLayout;


public class MyEditor extends EditorPart {
	private Table table;

	public MyEditor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		this.setSite(site);//
		this.setInput(input);
		
		this.setPartName(input.getName());
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.VERTICAL));
		
		table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnSdf = new TableColumn(table, SWT.NONE);
		tblclmnSdf.setWidth(100);
		tblclmnSdf.setText("\u59D3\u540D");
		
		TableColumn tblclmnCsdcs = new TableColumn(table, SWT.NONE);
		tblclmnCsdcs.setWidth(100);
		tblclmnCsdcs.setText("\u5E74\u9F84");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] {"jonee", "18", "\u7537", "java", "\u4E13\u79D1", "\u722C\u5C71"});
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("\u6027\u522B");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("\u804C\u4E1A");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("\u5B66\u5386");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(100);
		tblclmnNewColumn_3.setText("\u7231\u597D");
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText(new String[] {"andy", "18", "\u7537", "java", "\u672C\u79D1", "\u722C\u5C71"});
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText(new String[] {"jonee", "18", "\u7537", "\u8F6F\u4EF6\u5DE5\u7A0B\u5E08", "\u4E13\u79D1", "\u722C\u5C71"});
		
		TabFolder tabFolder = new TabFolder(composite, SWT.NONE);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("\u9009\u9879\u53611");
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("\u9009\u9879\u53612");
		
		TabItem tbtmNewItem_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_1.setText("\u9009\u9879\u53613");
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
}
