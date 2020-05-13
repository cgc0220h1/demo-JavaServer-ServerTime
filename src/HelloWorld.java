import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @project demo-JavaServer-ServerTime
 * @author Duc on 5/13/2020
 */
@WebServlet(name = "ServerTimeServlet", urlPatterns = "/index")
public class HelloWorld extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try (PrintWriter printWriter = response.getWriter()) {
          printWriter.println("<html>");
          printWriter.println("<h1>Hello World</h1>");
          printWriter.println("</html>");
        }
    }
}
