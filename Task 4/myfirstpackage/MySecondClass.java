package myfirstpackage;

public class MySecondClass{
	private int Num1;		 // Два приватных поля типа int
	private int Num2; 	

	public MySecondClass (int Num1, int Num2){	 // Конструктор
		this.Num1 = Num1;
		this.Num2 = Num2;
	}

	public int getNum1(){		 // Получить значение Num1
	return Num1;
	}
	

	public int getNum2(){		 // Получить значение Num2
	return Num2;
	}

	
	public void SetNum1 (int num){	// Изменить значение Num1
	Num1 = num;
	}


	public void SetNum2 (int num){	// Изменить значение Num2
	Num2 = num;
	}


	public int BitAnd() {		 // Побитовое И над Num1 и Num2
	return Num1 & Num2;
	}
}