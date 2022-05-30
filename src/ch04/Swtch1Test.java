package ch04;

public class Swtch1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*   char grade = 'd';
        
        switch (grade) {
        case 'A':
        case 'a':
             System.out.println("우수회원입니다.");
             break;
        case 'B':
        case 'b':
      	     System.out.println("일반 회원입니다.");
      	     break;
      	default:
      	  System.out.println("손님입니다.");
      	     break;
        }
        */ 
		//위 아래 같음
        
		char grade = 'd';
        if (grade=='A'|| grade=='a') {
        	System.out.println("우수회원입니다.");
		}else if (grade =='B'|| grade =='b') {
			System.out.println("일반 회원입니다.");
		}else {
			System.out.println("손님입니다.");
		}
	}
}
