import javax.servlet.http.*; 
import javax.servlet.*; 
import java.io.*; 
public class MyServletDemo extends HttpServlet{ 
   public void doGet(HttpServletRequest req,HttpServletResponse res) 
   throws ServletException,IOException 
   {  
     res.setContentType("text/html"); 
     PrintWriter pwriter=res.getWriter(); 

     String name = req.getParameter("uname");
     String age = req.getParameter("uage");
     pwriter.println("Name: "+name); 
     pwriter.println("Age: "+age); 
     pwriter.close(); 
  }
}