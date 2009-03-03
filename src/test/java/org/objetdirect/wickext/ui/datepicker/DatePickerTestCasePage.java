package org.objetdirect.wickext.ui.datepicker;

import org.objetdirect.wickext.commons.WickextTestPage;
import org.objetdirect.wickext.core.commons.WickextPlugin;

public class DatePickerTestCasePage extends WickextTestPage {

	private DatePicker<String> datePicker;
	
	public DatePickerTestCasePage() {
		super();
		this.datePicker = new DatePicker<String>("datepicker");
		add(datePicker);
	}

	@Override
	public WickextPlugin getPluginToTest() {
		return datePicker;
	}

}
