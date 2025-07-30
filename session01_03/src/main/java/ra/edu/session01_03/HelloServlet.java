package ra.edu.session01_03;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = "/login")
public class HelloServlet extends HttpServlet {



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        float rate =  Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd;
        request.setAttribute("rate", rate);
        request.setAttribute("usd", usd);
        request.setAttribute("vnd", vnd);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }
}
