package co.edu.service;

import java.util.List;

import co.edu.board.BoardVO;
import co.edu.board.LoginVO;
import co.edu.dao.BoardDAO;

public class BoardServiceImpl implements BoardService {
	
	BoardDAO dao = new BoardDAO();
	

	@Override
	public BoardVO insertBoard(BoardVO vo) { //입력
		return dao.insertBoard(vo);
	}

	@Override
	public List<BoardVO> getList(BoardVO vo) { //목록조회
		return dao.boardList(vo);
	}

	@Override
	public BoardVO findBoard(int boardNo) { //상세조회
		return dao.searchBoard(boardNo);
	}

	@Override
	public boolean updateBoard(BoardVO vo) { //수정
		return dao.updateBoard(vo);
	}

	@Override
	public boolean deleteBoard(int boardNo) { //삭제
		return dao.deleteBoard(boardNo);
	}

	@Override
	public List<BoardVO> pageList(int page) {
		return dao.pageList(page);
	}

	@Override
	public LoginVO memberBoard(LoginVO vo) {
		return dao.user(vo);
	}

	@Override
	public List<LoginVO> memberList() {
		return dao.memberList();
	}

	@Override
	public LoginVO login(String id, String passwd) {
		return dao.login(id, passwd);
	}

}
