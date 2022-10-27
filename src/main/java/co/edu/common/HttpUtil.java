package co.edu.common;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {
	public static void forward(HttpServletRequest req
			, HttpServletResponse resp
			, String path) {
		
		RequestDispatcher rs = req.getRequestDispatcher(path);
		try {
			rs.forward(req, resp); //first.do를 호출하면 WEB-INF/jsp/first.jsp로 이동하겠다는 걸로 
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
