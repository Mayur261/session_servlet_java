import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/ServletLogout")
public class ServletLogout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	HttpSession session = request.getSession();
        session.invalidate(); // Invalidate the session
        
        
        // Perform logout operations, if any
        
        // Redirect back to index.html
        out.println("<a href='index.html'>index</a>");
        //response.sendRedirect("index.html");
    }
}
