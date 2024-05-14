package com.sist.client;
/*
 * 	윈도우(컨테이너)
 * 	  |=> ** JFrame	: 기본 윈도우 => 최소화, 최대화, 닫기
 * 	  |=> JWindow	: 타이틀 바가 없음.(다이얼로그 창) ==> 처음에 로고만 뜨는 화면 같은 것. 프로그램에 프로그램을 올린 화면 ==> New Java Project 창
 * 	  |=> ** JPanel	: 단독 수행이 불가능 => JFrame, JWindow 화면
 * 	  |=> JDialog	: 아이디를 입력하세요. 와 같은 조그만 메시지 창. (검색어를 입력하세요...)
 * 
 * 	컴포넌트
 * 		|=> 버튼
 * 			=> 메뉴 : JMenu	<ul>
 * 			=> 버튼 : JButton, 라디오 : JRadioButton, 체크 : JCheckBox
 * 				<input type = text>
 * 				<input type = radio>
 * 				<input type = checkbox>
 * 				
 * 		|=> 입력 창
 * 			=> 한 줄		: JTextField, JPasswordField
 * 				<input type = text> <input type = password>
 * 			=> 여러 줄	: JTextArea
 * 				<textarea>
 * 		|=> 라벨		: JLabel
 * 			<label>
 * 		|=> 테이블	: JTalbe
 * 			<table>
 * 		|=> 트리		: JTree
 * 
 * 	배치
 * 		= BorderLayout
 * 		= FlowLayout
 * 		= GridLayout
 * 		= CardLayout
 * 		= 사용자 정의 ==> 직접 배치
 * 	----------------------------------------------------
 * 	1. JFrame 상속
 * 	2. 필요한 컴포넌트를 포함
 * 	3. 생성자
 * 		초기화 => 배치
 * 	
 * 	=> 라벨 2개
 * 	=> JTextField
 * 	=> JPasswordField
 * 	=> JButton 2
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * HiFiLookAndFeel
 */		
import javax.swing.*;

public class Login extends JFrame {
	// 포함 클래스
	/*
	 * 	모든 멤버 변수는 private 이 아니다.	=> 라이브러리는 public 으로 설정.
	 */
	public JLabel la1, la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1, b2;
	
	// 초기화 => 화면 배치 => 생성자 => 다른 클래스와 연결 => public
	public Login() {
		setTitle("로그인");	// 로그인 창 제목 설정
		
		// 초기화
		la1 = new JLabel("아이디");
		la2 = new JLabel("비밀 번호");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		
		// 배치
		// 사용자 정의 => "아이디"와 아이디 입력 창 사이즈를 설정합니다.
		setLayout(null); // => BorderLayout ===> null 레이아웃 사용
		la1.setBounds(10, 15, 80, 30);
		tf.setBounds(100, 15, 200, 30);
		
		// 윈도우에 추가 + 아이디 입력 창
		add(la1); add(tf);
		
		// 사용자 정의 2 => "비밀번호"와 아이디 입력 창 사이즈를 설정합니다.
		la2.setBounds(10, 50, 80, 30);
		pf.setBounds(100, 50, 200, 30);
		
		// 윈도우에 추가 + 비밀번호 입력 창
		add(la2); add(pf);
		
		// JPanel의 객체를 생성합니다
		JPanel p = new JPanel();
		
		// 사용자 정의 => "로그인", "취소" 버튼을 생성하고 위치를 조정합니다.
		p.add(b1);p.add(b2);
		p.setBounds(10, 90, 315, 35);
		
		// 로그인, 취소 버튼을 생성합니다.
		add(p);
		
		setSize(350, 170);	// 윈도우 크기 결정
	
		setVisible(true);	// 출력 여부 => true 면 보여주고 false 면 안보여줌.
			
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		} catch (Exception e) {
		
		}
		
		// 생성자 호출
		new Login();

	}

}
