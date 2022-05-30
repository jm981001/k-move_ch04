package ch04;

import java.util.Scanner; 
//다른사람이 구현한 기능 사용 패키지와 퍼블릭 클래스 사이에 
public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="";
		Scanner sc = new Scanner (System.in);//자바에서 제공하는거라 import 필요
		
		System.out.println ("메시지를 입력하세요~");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		do {
			System.out.print(">");
			str = sc.nextLine();
			System.out.println(str);//최소 한번 실행
		} while (!str.equals("q"));
		System.out.println("프로그램 종료");
		}
	}


