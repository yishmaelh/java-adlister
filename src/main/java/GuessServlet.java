import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int randomNumber = (int) (Math.random() * 3 + 1);
        String userGuess = request.getParameter("numberGuess");
        if (Integer.parseInt(userGuess) == randomNumber) {
            String win = "Congrats! You guessed correctly.";
            request.setAttribute("outcome", win);
            response.sendRedirect("/correct");
        } else if (Integer.parseInt(userGuess) != randomNumber && Integer.parseInt(userGuess) >= 1 && Integer.parseInt(userGuess) <= 3) {
            response.sendRedirect("/incorrect");
        } else {
            response.sendRedirect("/guess");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }
}

