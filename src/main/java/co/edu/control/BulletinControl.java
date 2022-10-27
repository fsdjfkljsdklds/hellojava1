package co.edu.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.board.BoardVO;
import co.edu.board.PageVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class BulletinControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String page = req.getParameter("page");
		page = page == null ? "1": page; //페이지 값이 null이면 1로 바꿔줘서 1~10번만 보여줌.
		int pg = Integer.parseInt(page); //page는 int값으로 들어와야하기때문에
		
		PageVO paging = new PageVO(516, pg);
		
		BoardService service = new BoardServiceImpl();
//		List<BoardVO> list = service.getList(new BoardVO(0, "", "", "", "", 0, ""));
		List<BoardVO> list = service.pageList(pg);
		req.setAttribute("bList", list);
		req.setAttribute("page", paging);
		
		HttpUtil.forward(req, resp, "bulletin/bulletin.tiles");
		
	}

}
