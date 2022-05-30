package ch04;

public class For2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1부터 100까지 합
		int sum =0;
		int i=0;
		
	//반복문 밖에서 i쓸땐 반복문 안에 i선언이 아닌 밖에서 선언하기	for안에 int쓰면 반복문 밖에선 안댐
		//for(i=1; i<=100; i++) {
		for(i=1; i<=100; i++) {//1~100사이의 홀수의 합
			sum+=i; //옆에꺼랑 같음 sum=sum+i;//i= i+1//i+=1
		
		}
		System.out.println("1~"+(i-1)+" 합 = " +sum);
		
	}
	
}

