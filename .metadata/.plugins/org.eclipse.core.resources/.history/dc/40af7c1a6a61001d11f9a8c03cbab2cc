package com.javassem.service;

import java.util.List;

import com.javassem.dao.BoardDAO;
import com.javassem.domain.BoardVO;



public class BoardServiceImpl implements BoardService {
	
	private BoardDAO boardDAO;

	public void insertBoard(BoardVO vo) {

		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}
}