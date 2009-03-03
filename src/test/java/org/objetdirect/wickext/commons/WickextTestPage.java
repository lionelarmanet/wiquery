package org.objetdirect.wickext.commons;

import org.apache.wicket.markup.html.WebPage;
import org.objetdirect.wickext.core.commons.WickextPlugin;

public abstract class WickextTestPage extends WebPage {

	public abstract WickextPlugin getPluginToTest();
	
}
