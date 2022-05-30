package ch04;

public class For3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //2~9단 출력하기//중첩
	    for(int dan=2; dan<=9; dan++) {//단
	    	System.out.println("["+dan+"단]");
	    	for(int su=1; su<=9; su++) {//곱해질 수
	    		System.out.println(dan+"X"+su+"="+(dan*su));
	    	}
	    	System.out.println("--------------");
	    }
	    
	}

}
