import myfirstpackage.*;

class MyFirstClass {
	public static void main(String[] s) {
       		MySecondClass o = new MySecondClass(0, 0);

		System.out.println(o.BitAnd());

		for (int i = 1; i <= 8; i++) {
 			for (int j = 1; j <= 8; j++) {
     				o.SetNum1(i);
     				o.SetNum2(j);
     				System.out.print(o.BitAnd());
     				System.out.print(" ");
 			}
 		System.out.println();
		}

	}
}

