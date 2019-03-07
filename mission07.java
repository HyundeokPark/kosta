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
			
			//배열 검색 int return 형
			public static int search_int(String[] arr,String str) {
				boolean check = false;
				int searched =0;

				for(int i=0; i<count; i++) {
					if(arr[i].equals(str)) {
						check = true;
						searched = i;
						break;
					}
					else {
						continue;
					}
				}
				
				if(check == false) {
					searched = -1;
				}
				
				return searched;	
			}
			
			//search를 활용한 update함수
			public static void update_2(String[] arr,Scanner sc) {
				String fruit;
				String fruit2;
				
				System.out.print("바꾸실 과일을 입력해 주세요 :");
				fruit = sc.nextLine();
				
				System.out.print("새 과일을 입력해 주세요 :");
				fruit2 = sc.nextLine();
				
				if(search_int(arr, fruit) == -1) {
					System.out.println("해당 과일이 없습니다.");
				}
				else {
					for(int i=0; i<count; i++) {
						if(search_int(arr, fruit) != -1) {
							arr[search_int(arr, fruit)] = fruit2;
		                    System.out.println("수정 되었습니다.");				
							break;
						}
						else {
							continue;	
						}
					}
				}
			}
			
		
			//search 활요한 delete!..
			public static void delete_2(String[] arr,Scanner sc) {
				System.out.print("삭제할 과일 입력 : ");
				
				String fruit_delete = sc.nextLine();
				
				if(search_int(arr,fruit_delete) == -1) {
					System.out.println("해당 과일이 없습니다.");
				}
				
				else {
					System.out.println("삭제되었습니다.");
					reduceArray(arr,search_int(arr,fruit_delete));
				}
			}
			
			//지정된 위치로 이후에 있는 배열의 원소를 한칸씩 당겨온다. => 출력되는 배열이 크기가 줄어든다! 실제로는 마지막값은 남아있음...
			public static void reduceArray(String[] arr, int deleted_index) {
				for(int i= deleted_index; i<count-1; i++) {
						arr[i] = arr[i+1];
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
		
		String fruit = "";
		
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
				System.out.print("검색할 과일을 입력하세요 : "); //함수는 int만 반환해줌
				fruit = sc.nextLine();
				if(search_int(arr,fruit) == -1) {
					System.out.println("해당 과일이 없습니다.");		
				}
				
				else {
					System.out.println(search_int(arr,fruit)+ "번째 위치해 있습니다.");
				}
				break;
				/*search(arr,sc); //함수에서 다 처리하기
				break;*/
			case "4" :
				//update(arr,sc); //search 활용 x
				update_2(arr, sc); //search_int 함수 활용!
				break;
			case "5" :
				//delete(arr,sc);
				delete_2(arr,sc);
				break;	
			case "6" :
				exit();
				break;
			}
		}
	}

}
