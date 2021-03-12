package Mavendemotest.Amazon;

public class Testdemo {

	public static void main(String[] args) {
		String name = "Fiftyfive";
		int len = name.length();
		int count=0;
		for (int i = len - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			count ++;
			int num=count%3;
			if(num!=0)
			{
				System.out.print(ch);
			}
			
		}
		
	}

}
