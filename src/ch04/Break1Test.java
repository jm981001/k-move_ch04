package ch04;

public class Break1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주사위 눈금이 6 나오면 종료
		while(true) {
		int num= (int)(Math.random()*6)+1;//1~6사이 정수가 생성
		System.out.println(num);
		if(num==6) {
			break;//6이 브레이크 만나면 반복문이 끝남 
		}
		}
		System.out.println("프로그램 종료");
	}

}
