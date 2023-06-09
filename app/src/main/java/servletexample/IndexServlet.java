package servletexample;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {
        String n = request.getParameter("nome");
        //request.getRequestDispatcher("/resposta.jsp").forward(request, response);
        //response.getWriter().print("Somente Texto : " + n);
        request.setAttribute("nome", n);
        request.getRequestDispatcher("/resposta.jsp").forward(request, response);
    }
}