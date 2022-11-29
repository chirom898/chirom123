/*import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;*/
import java.io.*;
import javax.servlet.*;
public class SecondServlet implements Servlet
{

  public void init(ServletConfig config) throws ServletException
  {
  System.out.println("Init method called");
  }
  public  ServletConfig getServletConfig()
  {
  System.out.println("getServletConfig method called");
  
  
  return null;
  }
  public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
  {
	  
	    System.out.println("Service method called");
	  String un=req.getParameter("username");
	  String pw=req.getParameter("psw");
	  resp.setContentType("text/html");

PrintWriter out=resp.getWriter();
if(un.equals(pw))
{
out.print("<html><body>");
out.print("<b>Login Success</b>");

this.getServletInfo();
}
else{
out.print("Login Fail");
	
}
out.print("</body></html>");
	
  }
  public String getServletInfo()
  {
	  System.out.println("getServletInfo method called");
	  String author="Chirom";
	 String date="11/04/2018";
	  return author+"  "+date;
  }
  public void destroy()
  {
	  System.out.println("destroy method called");
  }

}