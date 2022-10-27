package co.edu.board;

import lombok.Data;

@Data
public class PageVO {
	int totalCnt; // 전체건수
	int pageNum; // 현제페이지
	int startPage, endPage, totalPage;
	boolean prev, next;

	public PageVO(int totalCnt, int pageNum) {
		this.totalCnt = totalCnt;
		this.pageNum = pageNum;

		totalPage = (int) Math.ceil(totalCnt / 10.0); // math.ceil은 더블타입이라서 인트로 캐스팅
		// startPage, endPage 계산
		this.endPage = (int) Math.ceil(this.pageNum / 10.0) * 10; // 3페이지면 0.3에 반올림해서 1이고 그거 10곱하니까 10개보여줌
		this.startPage = this.endPage - 9; // 엔드페이지가 10이면 거기서 9빼면 1페이지부터 시작

		if (this.endPage > totalPage) {
			this.endPage = totalPage;
		}

		prev = this.startPage > 10; // 이전페이지
		next = this.endPage < totalPage; // 다음페이지
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public boolean isNext() {
		return next;
	}

	@Override
	public String toString() {
		return "PageVO [totalCnt=" + totalCnt + ", pageNum=" + pageNum + ", startPage=" + startPage + ", endPage="
				+ endPage + ", totalPage=" + totalPage + ", prev=" + prev + ", next=" + next + "]";
	}

}
