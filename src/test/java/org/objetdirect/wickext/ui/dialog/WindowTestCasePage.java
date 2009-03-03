package org.objetdirect.wickext.ui.dialog;

import org.objetdirect.wickext.commons.WickextTestPage;
import org.objetdirect.wickext.core.commons.WickextPlugin;

public class WindowTestCasePage extends WickextTestPage {

	private Window window;
	
	public WindowTestCasePage() {
		super();
		window = new Window("window");
		add(window);
	}

	public Window getWindow() {
		return window;
	}

	@Override
	public WickextPlugin getPluginToTest() {
		return window;
	}
	
}
