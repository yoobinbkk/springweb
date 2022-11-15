package com.javassem.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//VO(Value Object)

@Data
//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
public class BoardVO {

	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;

// @Data는 윗 내용을 모두 포함
	

}