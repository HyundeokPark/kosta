package missions;

public class missoin05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2와 3의배수가 아닌 값들만 출력ㅎ세요. 1 ~ 100 까지 중에!
		
		for(int i=1; i<101; i++) {
			if(i %2 ==0) {
				continue;
			}
			else if(i%3==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
