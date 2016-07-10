package org.javachina.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class AppNameTag extends TagSupport {

	@Override
	public int doEndTag() throws JspException {
		
		HttpServletRequest request = (HttpServletRequest)this.pageContext.getRequest();
		String path = request.getContextPath();
		try {
			this.pageContext.getOut().write(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		
		return this.SKIP_BODY;
	}
	
}
