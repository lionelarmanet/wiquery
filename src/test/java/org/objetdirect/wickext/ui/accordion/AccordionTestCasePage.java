package org.objetdirect.wickext.ui.accordion;

import org.objetdirect.wickext.commons.WickextTestPage;
import org.objetdirect.wickext.core.commons.WickextPlugin;

public class AccordionTestCasePage extends WickextTestPage {

	private Accordion accordion;
	
	public AccordionTestCasePage() {
		super();
		accordion = new Accordion("accordion");
		add(accordion);
	}

	@Override
	public WickextPlugin getPluginToTest() {
		return accordion;
	}

}
