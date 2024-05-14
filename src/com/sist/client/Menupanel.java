package com.sist.client;

import java.awt.GridLayout;

import javax.swing.*;

// 메뉴 패널 클래스
// 홍 검색 채팅 게시판 뉴스 나가기 버튼
public class Menupanel extends JPanel {
	public JButton b1, b2, b3, b4, b5, b6;	//	버튼 6개를 생성합니다.
	
	// 초기화 => 배치
	public Menupanel() {
		// GridLayout을 사용하여같은 크기의 버튼을 생성합니다. (1줄에 5개)
		setLayout(new GridLayout(1, 5));	
		b1 = new JButton("홈");		// 목록 출력, 상세 보기
		b2 = new JButton("검색");	// 검색, 상세 보기
		b3 = new JButton("채팅");	// 쪽지, 채팅창
		b4 = new JButton("게시판");	// 목록, 상세보기, 수정, 추가, 삭제
		b5 = new JButton("뉴스");	// 뉴스 검색 창
		b6 = new JButton("나가기");
		// 총 11개의 클래스가 사용된다.
		
		// 버튼을 패널에 추가합니다.
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
	}

}
