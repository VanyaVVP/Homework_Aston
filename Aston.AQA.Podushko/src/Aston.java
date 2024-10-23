
import java.util.Scanner;
public class Aston 
{
	
 static void printThreeWords()                         
	{
		System.out.println("Orange\nBanana\nApple\n");	
	}
	
 static void checkSumSign()                          
	{
		int a=5,b=10;
		if ((a+b)>=0) {
		System.out.println("Сумма положительная\n");}
		else {
		System.out.println("Сумма отрицательная\n");}	
	}
   
 static void printColor()                           

    {
    	int value = 100;
    	   if (value <= 0) {
    	       System.out.println("Красный\n");
    	   } else if (value > 0 && value <= 100) {
    	       System.out.println("Жёлтый\n");
    	   } else if (value > 100) {
    	       System.out.println("Зелёный\n");
    	   } 
    }
    
 static void compareNumbers()                       
    {
    	int a=5,b=10;
    	if (a>=b) {
    		System.out.println("a>=b\n");}
    	else {
    		System.out.println("a<b\n");}
    }
   
 static void getNumbers()                         
    {
    	Scanner scanner = new Scanner(System.in); 
		System.out.print("Введите первое целое число: ");
		byte a = scanner.nextByte(); 
		System.out.print("Введите второе целое число: ");
		byte b = scanner.nextByte(); 
		boolean value=false;
		if (a+b>=10 && a+b<=20) {
		value=true;}
		System.out.print(value);
		scanner.close();
    }    
   
 static void printSign(int number)                
    {             
    	  if (number >= 0) {
    	    System.out.println("Число положительное");
    	  } else {
    	    System.out.println("Число отрицательное");
    	  }
    	} 
    
 static String printValue(int number)            
    {
    	  if (number >= 0) {
    	    return "true"; 
    	  } else {
    	    return "false"; 
    	  }
    }
   
 static void stringAndNumber(String str, int number) 
    {
    	while (number>0)
    	{
    		number--;
    		System.out.println(str);
    	}	
    }
   
 static boolean LeapYear(int year)      
    {
    	  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 
    	  {
    	    return true;
    	  } else 
    	  {
    	    return false;
    	  }
    }

 static void changeArray() 
    {
    	int[] a = {1,0,1,0,1,0};
    	for (int i=0; i<a.length; i++)
    	{
    		if (a[i]==1)
    			a[i]=0;
    		else
    			a[i]=1;
    		System.out.print(a[i]+" ");
    	}
    }
    
 static void putInArray()
    {
    	int[] b = new int[100];
    	for (int i=0; i<b.length; i++)
    	{
    		b[i]=i+1;
    		System.out.print(b[i]+" ");
    	}
    	
    }
    
 static void multiplyArray()
    {
    	int[] c = {1,5,3,2,11,4,5,2,4,8,9,1};
    	for (int i=0; i<c.length; i++)
    	{
    		if (c[i]<6)
    		{
    			c[i]=c[i]*2;
    			
    		}
    		System.out.print(c[i]+" ");
    	}
    }
    
 static void matrix()
    {
    	int size = 5;
    	int[][] d = new int[size][size];
    	for (int i=0; i<d.length; i++)
    	{
    		d[i][i]=1;
    	}
    	for (int i = 0; i < size; i++) {
            d[i][size - i - 1] = 1;
        }
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();}
    }
    
    
 static int[] getTwoArgs(int initialValue, int len)
    {
    	int[] e = new int[len];
    	for (int i=0; i<len; i++)
    	{
    		e[i] = initialValue;
    	}
    	return e;
    	
    }
     	
 public static void main(String[] args) 
	{
		System.out.println("введите номер задания:");
		Scanner scanner = new Scanner(System.in);
		byte x = scanner.nextByte();
		switch (x) {
		
		case(1):
		printThreeWords();    // task 1: - print (Orange, Banana, Apple)
		break;
		
		case(2):            
		checkSumSign();      // task 2: - суммирует 2 элемента 
		break;
		
		case(3):
		printColor();       // task 3: - (...0) = Red; (0..100) = Yellow; (101...) = Green.
		break;
		
		case(4):
		compareNumbers();   // task 4: - if a>=b - print (a>=b) else print (a<b)
		break;
		
		case(5):
		getNumbers();      // task 5: сумма a и b должна лежать от 10 до 20 - возвращает true, иначе false
		break;
		
		case(6):
		printSign(5);    // task 6: определяет, число Положительное или отрицательное 
		break;
		
		case(7):
		printValue(0);        // task 7: Возвращает true(>=0) or false(<0)
		String result = printValue(5); 
	    System.out.println(result); 
		break;
		
		case(8):
		stringAndNumber("Aston",3);    // task 8: передаётся строка и число, выводится строка n-раз
		break;
		
		case(9):
		System.out.println(LeapYear(2000)); // task 9: определяет високосный год
		break;
		
		case(10):
		changeArray(); // task 10: заменяет ячейки массива - 1 на 0, 0 на 1
		break;
		
		case(11):
		putInArray();   // task 11: заполнить одномерный массив длиной 100, заполнить значениями (1,2,3,4...100)
		break;
		
		case(12):
		multiplyArray();  // task 12: пройтись по назначенному массиву и числа <6 умножить на 2
		break;
		
		
		case(13):
		matrix();    // task 13: задать матрицу, у которой две диагонали будут равны 1.
		break;
		
		case(14):
		int [] array = getTwoArgs(5,10);    // task 14: Метод принимает 2 аргумента, и возвращает одномерный массив типа int линой len
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
		break;
		default:
            System.out.println("Некорректный ввод!");
		}
		scanner.close();
	}
}
