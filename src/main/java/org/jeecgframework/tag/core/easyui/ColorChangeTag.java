package org.jeecgframework.tag.core.easyui;

import java.io.IOException;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**

 * 类描述：改变HTML控件颜色
 */
public class ColorChangeTag extends TagSupport {
	public int doStartTag() throws JspTagException {
		return EVAL_PAGE;
	}
	public int doEndTag() throws JspTagException {
		JspWriter out = null;
		try {
			out = this.pageContext.getOut();
			out.print(end().toString());
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				out.clear();
				out.close();
			} catch (Exception e2) {
			}
		}
		return EVAL_PAGE;
	}
	public StringBuffer end() {
		StringBuffer sb = new StringBuffer();
		return sb;
	}

}
