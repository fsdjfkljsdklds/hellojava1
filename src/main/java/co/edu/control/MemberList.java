package co.edu.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.board.LoginVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class MemberList implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//회원목록 전체조회
		BoardService service = new BoardServiceImpl();
		List<LoginVO> list = service.memberList();
		req.setAttribute("list", list);
		
		
		
		HttpUtil.forward(req, resp, "member/memberList.tiles");
	}

}
