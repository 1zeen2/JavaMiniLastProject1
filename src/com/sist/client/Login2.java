package com.sist.client;

import java.awt.GridLayout;

import javax.swing.*;

// 메뉴 패널 클래스
// 홍 검색 채팅 게시판 뉴스 나가기 버튼
public class Login2 extends JPanel {
	public JButton b1;	//	버튼 6개를 생성합니다.
	
	// 초기화 => 배치
	public Login2() {
		// GridLayout을 사용하여같은 크기의 버튼을 생성합니다. (1줄에 5개)
		setLayout(new GridLayout(1, 5));	
		b1 = new JButton("로그인");		// 목록 출력, 상세 보기
		
		// 총 11개의 클래스가 사용된다.
		
		// 버튼을 패널에 추가합니다.
		add(b1);
	}

}
