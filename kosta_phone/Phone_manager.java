package kosta_phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Phone_manager {
	//배열의 선언과 생성!... 객체를 phone info 객체 배열을 만들어주장!
	//전화번호 추가!
	//전화번호 전체 출력?... 이건 폰인포에 있지 앟나?..
	//배열안에 넣어라!!	
	//전체출력메소드에서  각각의 사람들의 그룹만 출력하는 메소드!! 
	Phone_info[] p;
	int count = 0;
	
	//디폴트 생성자
	public Phone_manager() {
		this.p = new Phone_info[10];
	}
	
	
	// 생성자
	public Phone_manager(int amount) {
		this.p = new Phone_info[amount];
	}
	
	
	// 기본 메뉴, 사용자로부터 입 출력 받는 함수 
	public void frontDesk() throws Exception{
		String name, number, birth,major = "";
		int stCode, salary =0;
		Phone_info tmp;
		int select=0;

		while(true) {
			System.out.println("1.추가  2.출력  3.검색  4.수정  5.삭제  6.종료");
			select = DataInput.sc.nextInt();
			switch(select) {
			
			case 1:
				System.out.println("1.회사  2.대학교  3.기타");
				select = DataInput.sc.nextInt();
				switch(select) {
				case 1:
					System.out.print("이름을 입력하세요 : ");
					name = DataInput.br.readLine();
					
					System.out.print("번호를 입력하세요 : ");
					number = DataInput.br.readLine();
					
					System.out.print("생일을 입력하세요 : ");
					birth = DataInput.br.readLine();
					
					System.out.println("월급을 입력하세요 :");
					salary =Integer.parseInt(DataInput.br.readLine());
					
					tmp = new CoworkerPhone_info(name, number, birth,salary);
					this.addPhoneInfo(tmp);
					break;
					
				case 2:
					System.out.print("이름을 입력하세요 : ");
					name = DataInput.br.readLine();
					
					System.out.print("번호를 입력하세요 : ");
					number = DataInput.br.readLine();
					
					System.out.print("생일을 입력하세요 : ");
					birth = DataInput.br.readLine();
					
					System.out.println("학과를 입력하세요 :");
					major =DataInput.br.readLine();
					
					System.out.println("학번을 입력하세요");
					stCode = Integer.parseInt(DataInput.br.readLine());
					
					tmp = new UniversityPhone_Info(name, number, birth, major, stCode);
					this.addPhoneInfo(tmp);
					break;
					
				case 3:
					System.out.print("이름을 입력하세요 : ");
					name = DataInput.br.readLine();
					
					System.out.print("번호를 입력하세요 : ");
					number = DataInput.br.readLine();
					
					System.out.print("생일을 입력하세요 : ");
					birth = DataInput.br.readLine();
					
					tmp = new Phone_info(name, number, birth);
					this.addPhoneInfo(tmp);
					break;
				}
				break;
			case 2:
				System.out.println("1.회사  2.대학교  3.전체");
				select = DataInput.sc.nextInt();
				this.listPhoneInfo(select);
				
				break;
			case 3:
				System.out.print("검색할 번호를 입력하세요 : ");
				number = DataInput.br.readLine();
		
				this.searchPhoneInfo(number);
				break;
			case 4:
				System.out.print("수정할 번호를 입력하세요 : ");
				number = DataInput.br.readLine();
				
//				System.out.print("새 번호를 입력하세요 : ");
//				newNumber = br.readLine();
				
				this.updatePhoneInfo(number);
				break;	
			case 5:
				System.out.print("삭제할 번호를 입력하세요 : ");
				number = DataInput.br.readLine();
				
				this.deletePhoneInfo(number);
			    break;
			case 6:
				System.out.println("프로그램이 종료 되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
	public int search(String number) {
		for(int i=0; i <count; i++) {
			if(number.equals(p[i].number)) {
				//System.out.println("index :" + i);
				return i;
			}
		}
		System.out.println("해당번호가 없습니다.");
		return -1;		
	}
	
	public void searchPhoneInfo(String number) {
		int index = this.search(number);
		if(index != -1) {
			System.out.println((index+1) + "번째 저장되어 있습니다.");
			this.p[index].show();
			}
	}
	
	public void addPhoneInfo(Phone_info tmp) {
		if(count > p.length-1) {
			System.out.println("용량이 가득 찼습니다.");
			//System.out.println("count :" + count);
		}
		else {
				p[count++]= tmp;
				//count++;
				System.out.println(p.length-count +"명 더 추가 할 수있습니다.");
				//System.out.println("count :" + count);
			}		
		}
	
	
	public void deletePhoneInfo(String number) {
		int index = this.search(number);
		if(index != -1) {
			//System.out.println("삭제 else 문진입");
			for(int i = index; i< this.count-1; i++) {
				//System.out.println("삭제 포문 진입");
				this.p[i] = this.p[i+1];
				//System.out.println("큰 값 덮어씌우기 성공");
			}
			this.count--;
			//System.out.println("count :" + this.count);
		}
	}
	
	public void updatePhoneInfo(String number) throws IOException {
		int index = this.search(number);
		String newMajor, newNumber;
		
		int newSalary, newStCode;
		if(index != -1) {
			if(this.p[index] instanceof UniversityPhone_Info) {
 				UniversityPhone_Info u=(UniversityPhone_Info)this.p[index];
 				
 				System.out.print("새 번호를 입력하세요 : ");
 				newNumber = DataInput.br.readLine();
 				u.number = newNumber;
 				
 				System.out.print("새 전공을 입력하세요 : ");
 				newMajor = DataInput.br.readLine();
 				u.setMajor(newMajor);
 
 				
			}
 			else if(this.p[index] instanceof CoworkerPhone_info) {
 				
 				CoworkerPhone_info c=(CoworkerPhone_info)this.p[index];
 				System.out.print("새 번호를 입력하세요 : ");
 				newNumber = DataInput.br.readLine();
 				c.number = newNumber;
 				
 				System.out.print("새 월급을 입력하세요 : ");
 				newSalary = Integer.parseInt(DataInput.br.readLine());
 				c.setSalary(newSalary);
 			}
 			else {
 				//System.out.println("수정 else 문진입");
 				//String newNumber;
 				System.out.print("새 번호를 입력하세요 : ");
 				newNumber = DataInput.br.readLine();
 				this.p[index].number = newNumber;
				//System.out.println("수정 성공");
				//System.out.println("count :" + this.count);
 			}
			
		}
	}
	
	public void listPhoneInfo(int group) {
		if(count ==0) {
			System.out.println("저장된 연락처가 없습니다.");
		}
		else {
			switch (group) {
			case 1:
				for(int i=0; i<count; i++) {
					if(this.p[i] instanceof CoworkerPhone_info) {
						this.p[i].show();
						//System.out.println("count :" + count);
						System.out.println();
					}
					}
				break;
			case 2:
				for(int i=0; i<count; i++) {
					if(this.p[i] instanceof UniversityPhone_Info) {
						this.p[i].show();
						//System.out.println("count :" + count);
						System.out.println();
					}
					}
				break;
			case 3:
				for(int i=0; i<count; i++) {
					this.p[i].show();
					//System.out.println("count :" + count);
					System.out.println();
				}
				break;
		}
		}
		
	}
}
