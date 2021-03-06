package org.objetdirect.wickext.ui.autocomplete;

import java.util.List;

import org.apache.wicket.Response;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;
import org.objetdirect.wickext.core.commons.WickextPlugin;
import org.objetdirect.wickext.core.javascript.JsQuery;
import org.objetdirect.wickext.core.javascript.JsStatement;
import org.objetdirect.wickext.core.options.Options;
import org.objetdirect.wickext.ui.commons.WickextUIPlugin;

@WickextUIPlugin
public abstract class AutocompleteBehavior<T, E> extends AbstractDefaultAjaxBehavior implements
		WickextPlugin {

	private static final long serialVersionUID = 1L;

	private Options options = new Options();
	
	public AutocompleteBehavior() {
		super();
	}

	public IHeaderContributor getHeaderContribution() {
		return new IHeaderContributor() {

			private static final long serialVersionUID = 1L;

			public void renderHead(IHeaderResponse response) {
				response
						.renderJavascriptReference(new JavascriptResourceReference(
								AutocompleteBehavior.class, "ui.autocomplete.js"));
			}

		};
	}

	public JsStatement statement() {
		return new JsQuery(this.getComponent()).$().chain("autocomplete", options.getJavaScriptOptions());
	}

	@Override
	protected void onBind() {
		options.putLiteral("url", this.getCallbackUrl().toString());
	}

	@Override
	protected void respond(AjaxRequestTarget target) {
		// response: outputing the list of results as a js map
		List<AutocompleteValue<T, E>> results = autocomplete();
		Response response = this.getComponent().getRequestCycle().getResponse();
		response.write("{");
		for (AutocompleteValue<T, E> autocompleteValue : results) {
			autocompleteValue.write(response);
		}
		response.write("}");
	}

	public abstract List<AutocompleteValue<T, E>> autocomplete();
	
}
