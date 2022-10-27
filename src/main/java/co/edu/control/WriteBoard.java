package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.edu.board.BoardVO;
import co.edu.common.Control;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class WriteBoard implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String saveDir = req.getServletContext().getRealPath("upload");
		System.out.println(saveDir);
		String encod = "UTF-8"; // 인코딩 방식.
		int maxSize = 5 * 1024 * 1024; // 5mb크기까지만 업로드할 수 있게 제한

		MultipartRequest mr = new MultipartRequest(
				req, //요청정보 
				saveDir, //저장위치
				maxSize, //파일크기
				encod, //인코딩방식
				new DefaultFileRenamePolicy()//같은파일이 있을때 rename정책.
		);
		
		String title = mr.getParameter("title");
		String content = mr.getParameter("content");
		String writer = mr.getParameter("writer");
		String image = mr.getFilesystemName("image"); //이미지는 parameter가 아님
		
		//디비 입력.
		BoardService service = new BoardServiceImpl();
		service.insertBoard(new BoardVO(0, title, content, writer, null, 0, image));
		
//		HttpUtil.forward(req, resp, "bulletin/bulletin.tiles"); //처리결과는 목록으로 넘어감
		resp.sendRedirect("bulletin.do"); //이쪽으로 포워딩. 이게 실행되면 리스트를 보여주니까.
	}

}
