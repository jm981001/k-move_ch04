package ch04;

public class While2Test {

	public static void main(String[] args) throws Exception{//이걸 해야 System.in.read 가능 외부꺼 가져와서 쓸때는 예외처리...?
		// TODO Auto-generated method stub
		boolean run = true;
		int speed=0;
		int KeyCode = 0;
		//메모리 공간 할당 지정
		//while 특= 참 일 동안 반복, while은 흩어져 for는 함께
		while(run) {
			if(KeyCode !=13 && KeyCode !=10) {
				System.out.println("-------------");
				System.out.println("1.증속 : 2.감속 : 3.중지");
				System.out.println("-------------");
				System.out.print("선택 : ");
				//println은 줄바뀜 그냥 print는 줄 안바뀜
			}
			
			KeyCode = System.in.read();//키보드의 키값 입력받기
			
			if (KeyCode==49) {
				speed++;
				System.out.println("현재속도="+ speed );
			}else if (KeyCode==50) {
					speed--;
					System.out.println("현재속도="+ speed );
			}else if (KeyCode==51) {
				run = false;//화일문은 조건이 참인동안. 그래서 false나오면 벗어남
				//break 가능
			
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
