package CH01;

import java.util.Scanner;

public class P03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) System.out.println("��� �Դϴ�.");
		else if(num < 0) System.out.println("���� �Դϴ�.");
		else if(num == 0) System.out.println("0 �Դϴ�.");
	}

}
