import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name= "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        request.getParameter("crust");
        request.getParameter("sauce");
        request.getParameter("size");
        request.getParameterValues("toppings");
        request.getParameterValues("address")
    }

}
