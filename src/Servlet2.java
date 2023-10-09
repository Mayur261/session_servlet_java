import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        out.print(email);
        // Do some processing with email
        out.println("<a href='Servlet3'>servlet3</a>");
        // Redirect to Servlet3
     // response.sendRedirect("Servlet3");
    }
}
