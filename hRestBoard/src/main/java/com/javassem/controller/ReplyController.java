package com.javassem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.ReplyVO;
import com.javassem.service.ReplyService;

@RestController
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	@GetMapping("replies")
	public List<ReplyVO> selectAll() {
		return replyService.selectAllReply();
	}
	
	@PostMapping("replies/new")
	public Integer insert(ReplyVO vo) {
		// System.out.println("입력요청 : " + vo);
		return replyService.insertReply(vo);
	}
	
	@DeleteMapping("replies/{rno}")
	public void delete(@PathVariable Integer rno) {
		// System.out.println(rno + "삭제");
		replyService.deleteReply(rno);
	}
	
	@PostMapping("replies/modify")
	public void modify(@PathVariable ReplyVO vo) {
		replyService.modifyReply(vo);
	}
	
}
