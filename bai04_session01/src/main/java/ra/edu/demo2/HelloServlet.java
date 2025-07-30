package ra.edu.demo2;

import java.io.*;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String message = "Now Time :" + LocalDateTime.now().toString();
        request.setAttribute("message", message);

        request.getRequestDispatcher("nowTime.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        req.setAttribute("errol", "đăng nhập thất bại");
        if (username == null || password == null) {
            req.setAttribute("errol","khong de trong");
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}