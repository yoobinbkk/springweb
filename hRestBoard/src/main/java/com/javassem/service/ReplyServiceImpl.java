package com.javassem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.ReplyDAO;
import com.javassem.domain.ReplyVO;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyDAO replyDAO;

	@Override
	public Integer insertReply(ReplyVO vo) {
		return replyDAO.insertReply(vo);
	}

	@Override
	public List<ReplyVO> selectAllReply() {
		return replyDAO.selectAllReply();
	}

	@Override
	public Integer deleteReply(Integer rno) {
		return replyDAO.deleteReply(rno);
	}

	@Override
	public Integer modifyReply(ReplyVO vo) {
		return replyDAO.modifyReply(vo);
	}

}
