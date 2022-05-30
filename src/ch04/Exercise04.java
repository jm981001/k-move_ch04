package ch04;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("("+num1+","+num2+")");
			if((num1+num2)==5) {
				break;
			}
		}
	}

}
/* 내가 했던것
 * while(true) {
int num= (int)(Math.random()*6)+1;
System.out.print("("+num+",");
int ber= (int)(Math.random()*6)+1;
System.out.println(ber+")");
if(num+ber==5) {
	break;
}
}진상이 한거
 while(num1 + num2 != 5) {
	            num1 = (int)(Math.random() * 6) + 1;
	            num2 = (int)(Math.random() * 6) + 1;
	            System.out.println("(" + num1 + ", " + num2 + ")");
*/