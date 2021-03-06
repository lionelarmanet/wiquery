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
package org.objetdirect.wickext.ui.resizable;

import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * $Id: ResizableJavaScriptResourceReference.java 61 2008-11-16 20:10:08Z lionel.armanet $
 * <p>
 * 	References the JavaScript resource to apply resizable behavior to any
 *  HTML element.
 * </p>
 * @author Lionel Armanet
 * @since 0.5
 */
public class ResizableJavaScriptResourceReference extends
		JavascriptResourceReference {

	private static final long serialVersionUID = 3423205998397680042L;

	/**
	 * Builds a new instance of {@link ResizableJavaScriptResourceReference}.
	 */
	public ResizableJavaScriptResourceReference() {
		super(ResizableJavaScriptResourceReference.class, "ui.resizable.js");
	}

}
