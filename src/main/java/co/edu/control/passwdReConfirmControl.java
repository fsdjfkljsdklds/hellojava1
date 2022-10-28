package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.board.LoginVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class passwdReConfirmControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		BoardService service = new BoardServiceImpl();
		String id = req.getParameter("id");
		service.passwdRe(id);
		HttpUtil.forward(req, resp, "member/passwdRe.tiles");

	}

}
