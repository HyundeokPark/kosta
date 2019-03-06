package kosta;

import java.util.Scanner;

public class mission07 {
			static int count = 0;
			
			//문자열 추가
			public static void add(String[] arr,Scanner sc) {
				System.out.printf("추가하실 과일을 입력해 주세요.");
				String str = sc.nextLine();
				if(count <arr.length) {
					arr[count++] =str;
				}
				else {
					System.out.println("용량초과 입니다. 과일을 삭제해 주세요.");
				}
			}
			
			//배열 모두 출력
			public static void print(String[] arr) {
				for(int i=0; i <count; i++){
					System.out.println(arr[i]);
				}
			}
			
			//배열 검색
			public static void search(String[] arr,Scanner sc) {
				boolean check = false;
				String str = sc.nextLine();
				for(int i=0; i<count; i++) {
					if(arr[i].equals(str)) {
						System.out.println(str + "은 "+i+"번째 위치해 있습니다.");
						check = true;
						break;
					}
					else {
						continue;
					}
				}
				if(check == false) {
					System.out.println("해당 과일이 없습니다.");
				}
			}
			
			//배열 수정
			public static void update(String[] arr,Scanner sc) {
				boolean check = false;
				//Scanner sc = new Scanner(System.in);
				System.out.print("바뀔 과일을 입력해 주세요 :");
				String str = sc.nextLine();
				System.out.print("새로 바꾸실 과일을 입력해 주세요.");
				String str2 = sc.nextLine();
				for(int i=0; i<count; i++) {
					if(arr[i].equals(str)) {
						arr[i] = str2;
						System.out.println("수정되었습니다.");
						check = true;
						break;
					}
					else {
						continue;	
					}
				}
				if(check == false) {
					System.out.println("바뀔 과일이 없습니다.");
				}			
			}
			
			//배열 삭제
			public static void delete(String[] arr,Scanner sc) {
				boolean check = false;
				int j =0;
				System.out.print("삭제할 과일 입력 : ");
				String str = sc.nextLine();
				for(int i=0; i< count; i++) {
					if(arr[i].equals(str)) {
						check = true;
						System.out.println("삭제되었습니다.");
						j = i;
						break;
					}
					else {
						continue;
					}
				}
				if(check == false) {
					System.out.println("해당 과일이 없습니다.");	
				}
				for(int i=j; i<count; i++) {
					if(i < count-1) {
						arr[i] = arr[i+1];
					}
				}
				count--;
			}
			
			//종료
			public static void exit() {
				System.exit(0);
			}
			
			
			
	public static void main(String[] args) {
		//과일을 넣을수 있고, 수정도 할수있고, 추가도 할수있고, 그리고 삭제도 할수 있음!
		String[] arr = new String[3];
		for(String s : arr) {
			s = "";
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가  2.출력  3.검색  4.수정  5.삭제  6.종료");
			System.out.print("선택: ");
			
			String menu =sc.nextLine();
			
			switch(menu) {
			case "1":
				add(arr,sc);
				break;
			case "2":
				print(arr);
				break;
			case "3":
				search(arr,sc);
				break;
			case "4" :
				update(arr,sc);
				break;
			case "5" :
				delete(arr,sc);
				break;	
			case "6" :
				exit();
				break;
			}
		}
	}

}
