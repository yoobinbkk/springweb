
$(function(){

	// 댓글 추가 버튼이 눌렸을 때
	$('#replyConfirm').click(function(){
		// 사용자 입력값 받아오기
		/* var param = {bno : $('#bno').val(), 
					 replyer : $('#replayer').val(), 
					 reply : $('#reply').val()
					}; */
		
		var param = $('#replyFrm').serialize();
		// alert(param);
		console.log(param);
		
		$.ajax({
			type : 'post',
			url : '../replies/new',
			data : param,
			success : function(result){
					// alert(result);
					$('#reply').val('');
			},
			error : function(err){
					// alert('error');
					console.log(err);
			}
		}); // end of ajax
		
	});	// end of click
	
	replyList();
	
	function replyList() {
		
		$.ajax({
			
			type : 'get',
			url : '../replies',
			// data : 보내는 데이터는 없음
			dataType : 'json',			// json 라이브러리 필요
			success : function(result){
				// alert(result);
				// console.log(result);
				
				let replyTbl = $('#replyList');
				replyTbl.empty();
				
				for (row of result) {
					// console.log(row);
					let tr = $('<tr/>');
					tr.append($('<td/>').html(row['rno']));
					tr.append($('<td/>').html(row['replyer']));
					tr.append($('<td/>').html(row['reply']));
					tr.append($('<td/>').html(row['replydate']));
					// <tr>
					// <td>1</td>
					// <td>Dave</td>
					// <td>안녕하세요</td>
					// <td>2022-11-16 12:10:44</td>
					// </tr>
					
					tr.append('<td><button class="delete">삭제</td></button>');
					tr.append('<td><button class="modify">수정</td></button>');
					
					replyTbl.append(tr);
				}
				
			},
			error : function(err){
				alert('error');
				console.log(err);
			}
			
		});	// end of ajax
		
	};	// end of replyList()
	
	// 삭제 버튼 클릭할 때
	//*********************** 동적으로 만들어진 버튼은 일반적인 이벤트 발생 안됨 (append)
	//							--> on()
	//$('.delete').on('click', 'button', function(){			// 얘도 안 됨
	//	alert('삭제');
	//});
	
	$('#replyList').on('click', '.delete', function(){
		// alert('ok');
		
		let rno = $(this).parents('tr').children().eq(0).text();
		// alert(rno);
		
		$.ajax({
			type : 'delete',
			url	 : '../replies/' + rno,
			success : function(result){
				replyList();
			},
			error : function(err) {
				alert('error');
			}
		});
		
	});
	
	
	// 수정 버튼 클릭할 때
	$('#replyList').on('click', '.modify', function(){
		
		// 해당 버튼의 행의 rno
		let rno = $(this).parents('tr').children().eq(0).text();
		// 버튼의 text
		let btnVal = $(this).html();
		
		if(btnVal=='수정') {
		
			// 수정 버튼의 이름을 바꿈
			$(this).html('수정완료');
			
			// 해당 버튼의 행의 reply
			let replyTd = $(this).parents('tr').children().eq(2);
			// 댓글 수정할 때 집어넣을 input tag
			let input = "<input type='text' class='input-data' value='" + replyTd.text() + "' />";
			
			replyTd.html(input);
			
		} else if (btnVal=='수정완료') {
			// 수정 버튼의 이름을 바꿈
			$(this).html('수정');
			
			// 해당 버튼의 행의 reply
			let replyTd = $(this).parents('tr').children().eq(2);
			// 댓글의 임시 input 태그
			let input = $(this).parents('tr').find('input.input-data');
			
			replyTd.html(input.val());
			input.remove;
			
			// 댓글을 변수에 담기
			let reply = $(this).parents('tr').children().eq(2).text();
			
			// ajax
			$.ajax({
				type : 'post',
				url	 : '../replies/modify',
				data : {rno : rno , reply : reply},
				success : function(result){
					replyList();
				},
				error : function(err) {
					alert('error');
				}
			});	// end of ajax
			
		}	// end of else if
		
	});	// end of modify click
	

});