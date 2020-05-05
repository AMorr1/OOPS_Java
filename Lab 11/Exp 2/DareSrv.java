import java.io.*;
import java.io.IOException;
import javax.servlet.*;

public class DareSrv extends GenericServlet
{

     public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException
     {
  
          res.setContentType("text/html");
         
          PrintWriter pw = res.getWriter();
        
          java.util.Date date = new java.util.Date();
          pw.println("<h2>"+"Current Date & Time: " +date.toString()+"</h2>");
       
          pw.close();
     }
}