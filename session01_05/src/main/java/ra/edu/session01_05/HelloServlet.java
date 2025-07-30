package ra.edu.session01_05;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = "/sign_up")
public class HelloServlet extends HttpServlet {
    String namemsg = "";
    String passwordmsg = "";
    String confirmpassmsg = "";
    String emailmsg = "";
    String regexPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&^#()_+=-])[A-Za-z\\d@$!%*?&^#()_+=-]{8,}$";
    String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|vn|edu\\.vn|org|net)$";
    boolean flag = true;
    String RegisteredSuccessfully = "";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(flag);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmpass = req.getParameter("confirm_password");
        String email = req.getParameter("email");
        System.out.println(password);
        System.out.println(confirmpass);
        if (username == null) {
            namemsg = "Username is empty";
            flag = false;
        }

        if (password == null) {
            passwordmsg = "Password is empty";
            flag = false;
        } else if (!password.matches(regexPass)) {
            passwordmsg = "Password is not valid";
            flag = false;
        }
        if (confirmpass == null) {
            confirmpassmsg = "Confirm Password is empty";
            flag = false;
        } else if (!confirmpass.equals(password)) {
            confirmpassmsg = "Wrong Password";
            flag = false;
        }
        if (email == null) {
            emailmsg = "Email is empty";
            flag = false;
        } else if (!email.matches(regexEmail)) {
            emailmsg = "Email is not valid";
            flag = false;
        }
        if (flag) {
            RegisteredSuccessfully = "Successfully Registered!";
        }

        req.setAttribute("namemsg", namemsg);
        req.setAttribute("passwordmsg", passwordmsg);
        req.setAttribute("confirmpassmsg", confirmpassmsg);
        req.setAttribute("emailmsg", emailmsg);
        req.setAttribute("registeredMsg", RegisteredSuccessfully);

        req.getRequestDispatcher("signUp.jsp").forward(req, resp);
    }
}