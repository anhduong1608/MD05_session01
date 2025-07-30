package ra.edu.session01_02;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("id", 1);
        request.setAttribute("name", "huấn hoa hồng");
        request.setAttribute("email", "huanhong@gmail.com");
        request.setAttribute("age", 18);
        request.getRequestDispatcher("userData.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }
}