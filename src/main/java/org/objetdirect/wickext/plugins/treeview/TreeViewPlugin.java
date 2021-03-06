/*
 * Copyright (c) 2008 Objet Direct
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.objetdirect.wickext.plugins.treeview;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;
import org.objetdirect.wickext.core.commons.WickextPlugin;
import org.objetdirect.wickext.core.effects.EffectSpeed;
import org.objetdirect.wickext.core.javascript.JsQuery;
import org.objetdirect.wickext.core.javascript.JsStatement;
import org.objetdirect.wickext.core.options.Options;

/**
 * $Id: TreeViewPlugin.java 61 2008-11-16 20:10:08Z lionel.armanet $
 * <p>
 * Creates a tree view regarding from the markup of this container.
 * </p>
 * 
 * @author Lionel Armanet
 * @since 0.5
 */
public class TreeViewPlugin extends WebMarkupContainer implements WickextPlugin {

	private static final long serialVersionUID = 1L;

	/**
	 * Options to customize the tree view.
	 */
	private Options options;

	public TreeViewPlugin(String id) {
		super(id);
		options = new Options();
	};

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.objetdirect.wickext.core.commons.JavaScriptCallable#statement()
	 */
	public JsStatement statement() {
		return new JsQuery(this).$().chain("treeview", options.getJavaScriptOptions());
	}

	/**
	 * Sets if this tree view is originally collapsed.
	 */
	public TreeViewPlugin setCollapsed(boolean collapsed) {
		options.put("collapsed", collapsed);
		return this;
	}

	/**
	 * Sets the speed effects when the tree view opens.
	 * 
	 * @see EffectSpeed
	 */
	public TreeViewPlugin setSpeed(EffectSpeed speed) {
		options.putLiteral("speed", speed.getJavaScriptStatement());
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.objetdirect.wickext.core.commons.WickextPlugin#getHeaderContribution()
	 */
	public IHeaderContributor getHeaderContribution() {
		return new IHeaderContributor() {

			private static final long serialVersionUID = 3385265870102253503L;

			public void renderHead(IHeaderResponse response) {
				response
						.renderJavascriptReference(new JavascriptResourceReference(
								TreeViewPlugin.class,
								"jquery-treeview/jquery.treeview.min.js"));
				response.renderCSSReference(new ResourceReference(
						TreeViewPlugin.class,
						"jquery-treeview/jquery.treeview.css"));
			}
		};
	}

}
