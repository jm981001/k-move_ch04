package ch04;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;//같지 않을때만 컨티뉴//즉 짝수만 출력됨//컨티뉴 만나면 증감으로 바로 감
			
			}
			System.out.println(i);
		}
	}

}
