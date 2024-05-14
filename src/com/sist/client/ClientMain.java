package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClientMain extends JFrame implements ActionListener {
	public Menupanel mp = new Menupanel();	// 메뉴 패널의 객체를 생성합니다.		----------------------------|
	public ControllerPanel cp = new ControllerPanel();	// 컨트롤러 패널의 객체를 생성합니다.	----------------| 포함 클래스.
	public Login2 lg = new Login2();
	
	// ClientMain 클래스의 생성자
	public ClientMain() {	
		
		setLayout(null);	// 레이아웃을 설정합니다.
		
		mp.setBounds(970, 80, 600, 50);	// 메뉴 카테고리 크기와 위치를 지정합니다.
		add(mp);	// 프레임에 메뉴 패널을 추가합니다.
		
		cp.setBounds(0, 150, 1600, 750);	// 색상이 출력되는 화면의 크기와 위치를 지정합니다.
		add(cp);	// 프레임에 컨트롤러 패널을 추가합니다.
//	==================================================================================================================================		
		lg.setBounds(1470, 15, 100, 50);	// 로그인 카테고리의 크기와 위치를 지정합니다
		add(lg);	// 프레임에 컨트롤러 패널을 추가합니다.
//	==================================================================================================================================
		
		// BorderLayout을 사용하여 프레임에 메뉴 패널과 컨트롤러 패널을 추가합니다.
		add("North", mp);	// 버튼을 위쪽에 배치합니다. (North, South, West, East, Center) ==> BoardLayout (JFrame)
		add("Center", cp);	
		
		// 윈도우 크기 설정
		setSize(1600, 900);		// 사용자 정의 ==> 윈도우 크기를 설정합니다.
		setVisible(true);		// 윈도우를 화면에 표시합니다.
		setResizable(false);	// 윈도우의 크기를 고정합니다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// x 버튼 클릭 시 메모리를 회수합니다 ==> 종료 버튼.
		
		// 메뉴 패널의 버튼에 이벤트 리스너를 등록합니다.
		mp.b1.addActionListener(this); // 버튼을 클릭하면 => actionPerformed를 호출
		mp.b2.addActionListener(this);
		mp.b6.addActionListener(this);
//		==================================================================================================================================
		lg.b1.addActionListener(this);
//		==================================================================================================================================
	}
	public static void main(String[] args) {
		try {
			// 외부 록앤필을 설정합니다.
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		} catch (Exception e) {
			// 예외 처리. 
		}
		// ClientMain 객체 생성
		new ClientMain();
	} 
	// ActionListener의 메서드 재정의
	@Override
	public void actionPerformed(ActionEvent e) {
		// 클릭된 버튼에 따라 다른 동작을 수행합니다.
		if (mp.b1 == e.getSource()) {			// 메뉴 1번 버튼을 클릭한 경우
			cp.card.show(cp, "HOME");			// 홈 화면을 보여줍니다.
		} else if (mp.b2 == e.getSource()) {	// 메뉴 2번 버튼을 클릭한 경우
			cp.card.show(cp, "FIND");			// 검색 화면을 보여줍니다.
		} else if (mp.b6 == e.getSource()) {	// 메뉴 6번 버튼을 클릭한 경우
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다.");
			System.exit(0);						// 프로그램 종료.
		} else if (lg.b1 == e.getSource()) {
			new Login();
		}
		
	}

}
