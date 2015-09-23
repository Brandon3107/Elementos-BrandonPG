package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServeletAutenticar extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login=request.getParameter("login");
        String password=request.getParameter("password");
        request.setAttribute("usuario", login);
        //response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        //out.println("<h1>Este es mi primer Servelet!!<h1>");
        RequestDispatcher despachador=request.getRequestDispatcher("/bienvenido.jsp");
        despachador.forward(request, response);
        
    }

    

}
