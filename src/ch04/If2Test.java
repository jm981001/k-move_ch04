package ch04;
public class If2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //주사위의 임의의 숫자를 출력하는 프로그램
		//임의의 숫자 만드는걸 난수생성  -math.random(): 0.0~1.0 사이 double 실수 생성  
		//0.0 <=math.random() <1.0//0.935678 -> *10->0~9 (주사위니까 6)
	    //0.0*6  <=math.random()*6 <1.0*6  ->0~5
		//0.0*6+1  <=math.random()*6 <1.0*6+1  ->1~6
		
		int num = (int)(Math.random()*6)+1;
		
		if (num==1) {
			System.out.println ("1번이 나왔습니다");
		}else if (num==2) {
			System.out.println ("2번이 나왔습니다");
		}else if (num==3) {
			System.out.println ("3번이 나왔습니다");
		}else if (num==4) {
			System.out.println ("4번이 나왔습니다");
		}else if (num==5) {
			System.out.println ("5번이 나왔습니다");
		}else if (num==6) {
			System.out.println ("6번이 나왔습니다");
		}
		
		
		switch(num){//괄호 안 변수 옴
		case 1 : //콜론임 세미콜론 아니고
		    System.out.println("1번이 나왔습니다");
		    break;
		case 2 :
		    System.out.println("2번이 나왔습니다");
		    break;
		case 3 : 
		    System.out.println("3번이 나왔습니다");
		    break;
		case 4 : 
		    System.out.println("4번이 나왔습니다");
		    break;
		case 5 : 
		    System.out.println("5번이 나왔습니다");
		    break;
		default:
		    System.out.println("6번이 나왔습니다");
		    break;
	}

		
	}
}
