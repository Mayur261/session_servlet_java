import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        out.print(email);
        // Do more processing with email
        
        // Redirect to ServletLogout
        out.println("<a href='ServletLogout'>logout</a>");
        //response.sendRedirect("ServletLogout");
    }
}
