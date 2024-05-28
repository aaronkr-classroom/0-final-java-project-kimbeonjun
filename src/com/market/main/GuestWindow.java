package com.market.main;

import javax.swing.*;
import java.awt.*;

public class GuestWindow extends JFrame {
	
	public GuestWindow(String title, int x, int y, int width, int height) {
		
		initContainer(title, x, y, width, height);	// initContainer() 메서드 호출
		setVisible(true);	// 프레임(GuestWindow) 보이기 설정
		setResizable(true);	// 프레임 크기 조절 기능 설정
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	// 프레임 닫기(X) 버튼 가능 설정
		setIconImage(new ImageIcon("./images/shop.png").getImage());	// 프레임 아이콘 표시
	}
	
	private void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);	// 프레임 제목 설정
		setBounds(x, y, width, height);	// 프레임 위치, 크기 설정
		setLayout(null);	// 프레임 레이아웃 미설정
		
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);	// 글꼴, 스타일, 크기 설정
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) / 2);	// 컴퓨터 화면에 맞춰 프레임 창을 화면 중앙에 출력
		JPanel userPanel = new JPanel();
		userPanel.setBounds(0, 100, 1000, 256);
		
		ImageIcon imageIcon = new ImageIcon("./images/user.png");
		imageIcon.setImage(imageIcon.getImage().getScaledInstance (160, 160, Image.SCALE_SMOOTH));
		JLabel userLabel = new JLabel(imageIcon);
		userPanel.add(userLabel);
		add(userPanel);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 350, 1000, 50);
		add(titlePanel);
		
		JLabel titleLabel = new JLabel("-- 고객 정보를 입력하세요 --");
		titleLabel.setFont(ft);
		titleLabel.setForeground(Color.BLUE);
		titlePanel.add(titleLabel);
		
		JPanel namePanel = new JPanel();
		namePanel.setBounds(0, 400, 1000, 50);
		add(namePanel);
		
		JLabel nameLabel = new JLabel("이    름 : ");
		nameLabel.setFont(ft);
		namePanel.add(nameLabel);
		
		JTextField nameField = new JTextField(10);
		nameField.setFont(ft);
		namePanel.add(nameField);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setBounds(0, 450, 1000, 50);
		add(phonePanel);
		
		JLabel phoneLabel = new JLabel("연락처 : ");
		phoneLabel.setFont(ft);
		phonePanel.add(phoneLabel);
		
		JTextField phoneField = new JTextField(10);
		phoneField.setFont(ft);
		phonePanel.add(phoneField);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(0, 500, 1000, 100);
		add(buttonPanel);
		
		JLabel buttonLabel = new JLabel("쇼핑하기", new ImageIcon("images/shop.png"), JLabel.LEFT);
		buttonLabel.setFont(ft);
		JButton enterButton = new JButton();
		enterButton.add(buttonLabel);
		buttonPanel.add(enterButton);
		
	}

	public static void main(String[] args) {
		new GuestWindow("고객 정보 입력", 0, 0, 1000, 750);
	}
}
