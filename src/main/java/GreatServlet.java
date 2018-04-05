import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GreatServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String un = req.getParameter("username");
      resp.setCharacterEncoding("UTF-8");
      resp.getWriter().write("<!DOCTYPE html>\n" +
              "<html lang=\"en\">\n" +
              "<head>\n" +
              "    <meta charset=\"UTF-8\">\n" +
              "    <title>Title</title>\n" +
              "</head>\n" +
              "<body>\n" +
              "<h1>Привет, "+un+ "</h1>\n" +
              "<a href = \"/\">\n" +
              "    Назад\n" +
              "</a>\n\n" +
              "</body>\n" +
              "</html>");

    }
}
