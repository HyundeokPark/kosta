package missions;

public class missoin05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�� 3�ǹ���� �ƴ� ���鸸 ��¤�����. 1 ~ 100 ���� �߿�!
		
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
