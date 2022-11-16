package com.javassem.service;

import java.util.List;

import com.javassem.domain.ReplyVO;

public interface ReplyService {
	
	Integer insertReply(ReplyVO vo);
	
	List<ReplyVO> selectAllReply();
	
	Integer deleteReply(Integer rno);
	
	Integer modifyReply(ReplyVO vo);
	
}
