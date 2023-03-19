package sec04;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginTest")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config)
			throws ServletException {
		System.out.println("init 메서드 호출");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");

		System.out.println("아이디:" + id);
		System.out.println("패스워드:" + pw);

		if (id != null && (id.length() != 0)) {
			out.print("<html>");
			out.print("<body>");
			out.print(id + "님!!로그인 하셨습니다.");
			out.print("</body>");
			out.print("</html>");
		} else {

			out.print("<html>");
			out.print("<body>");
			out.print("아이디를 입력하세요.");
			out.print("<br>");
			out.print("<a href='http://localhost:8090/pro06/test1.html'>로그인 이동</a>");
			out.print("</body>");
			out.print("</html>");

		}
	}

	public void destroy() {

		System.out.println("destroy 메서드 호출");

	}

}
