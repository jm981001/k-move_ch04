package ch04;

public class Break2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z';lower++) {
				System.out.println(upper + "-"+lower);
				if(lower == 'e') {
					break outter;// 원래 break는 반복문 벗어남 //내가 포함되어있는 가장 가까운for만 끝 //outter붙이면 원하는 for끝남
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
