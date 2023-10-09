import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	String email = request.getParameter("email");
        HttpSession session = request.getSession();
        session.setAttribute("email", email);
                // Redirect to Servlet2
        out.println("<a href='Servlet2'>Servlet2</a>");
        //response.sendRedirect("Servlet2");
    }
}
