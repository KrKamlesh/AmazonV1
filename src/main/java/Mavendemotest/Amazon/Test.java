package Mavendemotest.Amazon;

public class Test {

	public static void main(String[] args) {
		int num[] = { 9, 1, 4, 5, 8 };

		int largest = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}
		System.out.println(largest);
	}
}
