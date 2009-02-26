package org.objetdirect.wickext.ui.datepicker;

import org.apache.wicket.markup.html.resources.JavascriptResourceReference;
import org.apache.wicket.protocol.http.documentvalidation.Tag;
import org.objetdirect.wickext.commons.WickextTestCase;
import org.objetdirect.wickext.commons.WickextTestPage;

public class DatePickerTestCase extends WickextTestCase {

	@Override
	protected void appendBody(Tag body) {
		Tag datePickerInput = new Tag("input");
		body.addExpectedChild(datePickerInput);
	}

	@Override
	protected void appendNeededResources(Tag headTag) {
		addExpectedJavaScriptResource(headTag, new JavascriptResourceReference(
				DatePicker.class, "ui.datepicker.js"));
		addExpectedJavaScriptResource(headTag,
				new DatePickerLanguageResourceReference(getComponent().getLocale()));

	}

	@Override
	protected Class<? extends WickextTestPage> getTestPage() {
		return DatePickerTestCasePage.class;
	}

}
