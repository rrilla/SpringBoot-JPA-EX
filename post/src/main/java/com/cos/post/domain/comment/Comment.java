package com.cos.post.domain.comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.cos.post.domain.post.Post;
import com.cos.post.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	@Id	//기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//해당 데이터베이스 번호증가 전략을 따라가기
	private int id;
	@Column(length = 100000)
	private String content;
	
	@ManyToOne(fetch = FetchType.EAGER)	//테이블 관계, fk적용하여 db에 칼럼 생성
	private User user;	//연관관계를 위한 칼럼 - FK,
	//insert할 때 user의 id값만 넣어주고, select할 때 id값을 이용해서 select하여 오브젝트를 넣어줌.
	
	@ManyToOne(fetch = FetchType.EAGER)	//테이블 관계, fk적용하여 db에 칼럼 생성
	private Post post;
}
