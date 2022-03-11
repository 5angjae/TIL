package homework;

import java.util.HashMap;
import java.util.Scanner;

public class ContactTest {

	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		System.out.println("============= 연락처 프로그램===================");
		Scanner keyboard = new Scanner(System.in);
		int idx = 0;
		while (true) {
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1.등록   2.검색  3.수정  4.삭제   9.종료");
			System.out.print("메뉴선택:");
			int menu = keyboard.nextInt();

			if (menu == 1) {
				System.out.println("===>연락처 등록");
				System.out.print("이   름:");
				String name = keyboard.next();
				System.out.print("전화번호:");
				String tel = keyboard.next();
				
				// 연락처를 등록하는 코드를 구현하세요
				
				String idx_s = Integer.toString(idx);
				String[] phone_num = {name, tel};
				phone.put(idx_s, phone_num);
				idx += 1;
				
			} else if (menu == 2) {
				System.out.println("===>연락처 검색");
				// 연락처를 검색하는 코드를 구현하세요
				int cnt2 = 0;
				System.out.print("검색할 이름을 입력하세요.");
				String find_name = keyboard.next();
				for (int i = 0; i < phone.size(); i++) {
					String[] temp = phone.get(Integer.toString(i));
					if(temp[0].equals(find_name)) {
						cnt2 += 1;
						System.out.println(temp[0] + " : " + temp[1]);
					}
				}
				if (cnt2 == 0) {
					System.out.println("해당되는 이름의 전화번호는 없습니다.");
				}
			} else if (menu == 3) {
				System.out.println("===>연락처 수정");
				// 연락처를 수정하는 코드를 구현하세요
				System.out.print("수정할 이름을 입력하세요.");
				String find_name = keyboard.next();
				System.out.println("아래 목록에서 수정할 연락처의 인덱스를 입력해주세요.");
				int cnt3 = 0;
				for (int i = 0; i < phone.size(); i++) {
					String[] temp = phone.get(Integer.toString(i));
					if(temp[0].equals(find_name)) {
						cnt3 += 1;
						System.out.println("인덱스 : " + i + " / 이름 :" + temp[0] + " / 전화번호 : " + temp[1]);
					}
				}
				if(cnt3 == 0) {
					System.out.println("해당되는 이름의 전화번호는 없습니다.");
				} else {
					System.out.print("인덱스 입력 : ");
					int index = keyboard.nextInt();
					String index_s = Integer.toString(index);
					System.out.print("변경할 전화번호 입력 : ");
					String new_phone = keyboard.next();
					String[] new_phone_list = {phone.get(index_s)[0], new_phone};
					phone.replace(index_s, new_phone_list);
				}
				
				
			} else if (menu == 4) {
				System.out.println("===>연락처 삭제");
				// 여낙처를 삭제하는 코드를 구현하세요
				System.out.print("삭제할 이름을 입력하세요.");
				String find_name = keyboard.next();
				System.out.println("아래 목록에서 삭제할 연락처의 인덱스를 입력해주세요.");
				int cnt4 = 0;
				for (int i = 0; i < phone.size(); i++) {
					String[] temp = phone.get(Integer.toString(i));
					if(temp[0].equals(find_name)) {
						cnt4 += 1;
						System.out.println("인덱스 : " + i + " / 이름 :" + temp[0] + " / 전화번호 : " + temp[1]);
					}
				}
				if(cnt4 == 0) {
					System.out.println("해당되는 이름의 전화번호는 없습니다.");
				} else {
					System.out.print("인덱스 입력 : ");
					int index = keyboard.nextInt();
					String index_s = Integer.toString(index);
					String[] delete_phone = {"삭제된번호", "0"};
					phone.replace(index_s, delete_phone);
					// 등록 순서대로 숫자로 key값을 부여해놧었는데 완전히 지우면, 위의 for문에서 오류가 날 것 같아서 지우는게 아니라 데이터를 바꾸기로함
				}
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다....");
				System.exit(0);
			} else {
				System.out.println("잘못된 메뉴입니다! 메뉴를 다시 선택해 주세요");
			}
		}
	}

}
