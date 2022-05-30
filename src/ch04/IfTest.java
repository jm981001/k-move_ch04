package ch04;//112p

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int score =96;
        
        if (score>=90) {
        	//중첩 if문
        	if (score>=95){
        	System.out.println("점수가 95~100입니다");
            	System.out.println("등급은 A+ 입니다.");
        	}else {
        		System.out.println("점수가 90~94입니다");
        	    System.out.println("등급은 A 입니다.");
        	}
        	
        }else if(score>=80) {
        	System.out.println("점수가 80~89 입니다");
        	System.out.println("등급은 B 입니다.");
        }else if(score>=70) {
        	System.out.println("점수가 70~79 입니다");
        	System.out.println("등급은 C 입니다.");
        }else  {
        	System.out.println("점수가 70 미만입니다");
        	System.out.println("등급은 D 입니다.");
    
        }
	}

}
