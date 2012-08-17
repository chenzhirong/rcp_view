package jonee.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class MyView3 extends ViewPart {
	public void createPartControl(Composite parent) {
		Text text = new Text(parent, SWT.BORDER);
		text.setText("view show");
	}

	@Override
	public void setFocus() {
	}
}