package kosta;

public class method_exam {

	public static void printCharacter(char ch, int num) {
		for(int i=0; i<num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	public static double addOne(int num) {
		return num + 1 ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޼ҵ��� ���� => ���������� static ������ �޼ҵ� �̸� (�Ķ���͵�) {
		//			    �żҵ� ����
		//			  return 
		//}
		char c = 'a';
		int x =10;
		printCharacter(c, x);
		
		printCharacter(c, (int)addOne(x));
	}

}
