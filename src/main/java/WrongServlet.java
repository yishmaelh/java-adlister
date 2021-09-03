import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WrongServlet", urlPatterns = "/incorrect")
public class WrongServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String lose = " That guess was off, try again!";
        request.setAttribute("outcome", lose);
        request.getRequestDispatcher("/outcome").forward(request, response);
    }

}
