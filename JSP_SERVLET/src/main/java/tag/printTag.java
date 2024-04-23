package tag;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class printTag extends SimpleTagSupport{
	
	private String text;

	
	public void setText(String text) {
		this.text = text;
	}


	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		
		
		
		StringWriter writer = new StringWriter();
		getJspBody().invoke(writer);
		JspWriter out = getJspContext().getOut();
		
		if(this.text !=null) {
			out.print(this.text+"</br>");
			
		}
		else {
			getJspBody().invoke(writer);
			out.print(writer.toString()+"</br>");
		}
			
		out.print(writer.toString()+"</br>");
		
	}
}
