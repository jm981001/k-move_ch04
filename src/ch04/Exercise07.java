package ch04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int jango =0;//잔고
		Scanner sc = new Scanner(System.in);
		
		
		
	
		while(run) {
			    System.out.println("-------------");
				System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
				System.out.println("-------------");
				System.out.print("선택> ");
				
		int menu =0 , money=0;	
		menu= sc.nextInt();
		
		
	    
			if (menu==1) {
				System.out.print("예금액>" );
				money = sc.nextInt();
				jango += money;
				
		}else if (menu==2) {
				System.out.print("출금액>" );	
				money = sc.nextInt();
				if(jango< money) {
					System.out.println("잔액이 부족합니다.");
			}else {
					jango -=money;
		    }
		}else if (menu==3) {
				System.out.println("잔고>"+jango );
		}else if (menu==4) {
				run = false;
			
		}
			
			
			
			
			
	}
		System.out.println("프로그램 종료");

  }
}
     
/*	switch문	
switch (menu) {
case 1:
	System.out.print("예금액>" );
	money = sc.nextInt();
	jango += money;
	break;
	
case 2: 
	System.out.print("출금액>" );	
	money = sc.nextInt();
	if(jango< money) {
		System.out.println("잔액이 부족합니다.");
}else {
		jango -=money;
		break;
}
case 3: 
	System.out.println("잔고>"+jango );
case 4: 
	run = false;
	break;

}
*/