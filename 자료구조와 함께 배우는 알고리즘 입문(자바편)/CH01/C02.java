package CH01;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			System.out.println("> " + str);
			
			if(str.length() != 2) continue;
			
			System.out.println("������ ���� " + str + " �� �Ҵ�Ǿ����ϴ�.");
			break;
		}
		
	}

}
