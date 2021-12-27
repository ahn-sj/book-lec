package CH01;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		triangleLB(dan);
		System.out.println("-----");
		
		triangleLU(dan);
		System.out.println("-----");
		
		triangleRU(dan);
		System.out.println("-----");
		
		triangleRB(dan);
		System.out.println("-----");
	}
	
	// ���� �Ʒ��� ������ �̵ �ﰢ��
	static void triangleLB(int _n) {
		for(int i = 0; i < _n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ���� ���� ������ �̵ �ﰢ��
	static void triangleLU(int _n) {
		for(int i = 0; i < _n; i++) {
			for(int j = _n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ������ ���� ������ �̵ �ﰢ��
	static void triangleRU(int _n) {
		for(int i = 0; i < _n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = _n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// ������ �Ʒ��� ������ �̵ �ﰢ��
	static void triangleRB(int _n) {
		for(int i = 0; i < _n; i++) {
			for(int j = _n; j > i + 1; j--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
