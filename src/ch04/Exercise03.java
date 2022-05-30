package ch04;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=0; i<=100; i+=3){ 
		int sum=0;
		for (int i=0; i<=100; i++) {
			if(i%3==0) {
				System.out.print(i+ " ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("=> 3의 배수의 합 " +sum);
	}
}
/* 내가 작성
int sum=0;
int i=0;

for(i=1; i<=100; i++) {

	if(i%3==0) {
	sum+=i;	
} 
	
}
System.out.println("3의 배수의 합"+sum);
*/