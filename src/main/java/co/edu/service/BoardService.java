package co.edu.service;

import java.util.List;

import co.edu.board.BoardVO;
import co.edu.board.LoginVO;

public interface BoardService {
	// 기능만 정의.
	public BoardVO insertBoard(BoardVO vo); // 입력기능

	public List<BoardVO> getList(BoardVO vo); // 목록조회

	public BoardVO findBoard(int boardNo); // 한건 조회

	public boolean updateBoard(BoardVO vo); // 수정

	public boolean deleteBoard(int boardNo); // 삭제

	public LoginVO memberBoard(LoginVO vo); // 회원가입

	public List<LoginVO> memberList(); // 회원목록

	public LoginVO login(String id, String passwd); // 로그인처리
	
	public LoginVO passwdRe(String id); // 비밀번호 찾기

	public List<BoardVO> pageList(int page);// 페이지 기능.

}
