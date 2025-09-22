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

class MySecondClass{
	private int Num1;		// два приватных поля типа int
	private int Num2; 	

	public MySecondClass (int Num1, int Num2){	// Конструктор
		this.Num1 = Num1;
		this.Num2 = Num2;
	}

	public int getNum1(){		// Получить значение Num1
	return Num1;
	}
	

	public int getNum2(){		// Получить значение Num2
	return Num2;
	}

	
	public void SetNum1 (int num){	//Изменить значение Num1
	Num1 = num;
	}


	public void SetNum2 (int num){	//Изменить значение Num2
	Num2 = num;
	}


	public int BitAnd() {		// Побитовое "И" над Num1 и Num2
	return Num1 & Num2;
	}
}
