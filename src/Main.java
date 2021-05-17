
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author shahb
 */
public class Main {
    
    
    public static void main(String[] args)throws IOException
	{
		

		ArrayList <Biga> array_A = new ArrayList<Biga>();
		ArrayList <Bigb> array_B = new ArrayList<Bigb>();
		ArrayList <Bigc> array_C = new ArrayList<Bigc>();

		writeBigA(array_A);
		writeBigB(array_B);
		writeBigC(array_C);

		int s = 0;
		int a = 0;

		System.out.println("Press 1 :: Search the Depot From Big_A");
		System.out.println("Press 2 :: Search the Depot From Big_B");
		System.out.println("Press 3 :: Search the Depot From Big_C");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		s = scan.nextInt();

		while(s < 1 || s > 3) {

			System.out.println();
			System.out.println("Invalid Input ... Please Enter the Valid input.");
			System.out.print("Enter the Number = ");
			s = scan.nextInt();
			
		}//while

		if (s == 1){

			System.out.print("Enter the Depot No of Big_A = ");
			a = scan.nextInt();

			while (a<1 || a>50) {

				System.out.println("Invalid Input ... Please Enter the Valid input.");
				System.out.print("Enter the Number = ");
				a = scan.nextInt();
			}//while

			System.out.println(array_A.get(a));

		}//if

		else if (s == 2){

			System.out.print("Enter the Depot No Big_B = ");
			a = scan.nextInt();

			while (a<1 || a>50) {

				System.out.println("Invalid Input ... Please Enter the Valid input.");
				System.out.print("Enter the Number = ");
				a = scan.nextInt();
			}//while

			System.out.println(array_B.get(a));

		}//else if

		else if (s == 3){

			System.out.print("Enter the Depot No Big_C = ");
			a = scan.nextInt();

			while (a<1 || a>50) {

				System.out.println("Invalid Input ... Please Enter the Valid input.");
				System.out.print("Enter the Number = ");
				a = scan.nextInt();
			}//while

			System.out.println(array_C.get(a));

		}//else if


	}//main

	public static String objectCalling(Biga object1)  {

		Trade trade = new Trade();

		return " "+object1.toString()+" , "+trade.tradeOf_A();
		
	}//objectCalling

	public static String objectCalling(Bigb object1)  {

		Trade trade = new Trade();

		return " "+object1.toString()+" , "+trade.tradeOf_B();
		
	}//objectCalling

	public static String objectCalling(Bigc object1)  {

		Trade trade = new Trade();

		return " "+object1.toString()+" , "+trade.tradeOf_C();
		
	}//objectCalling

	public static void writeBigA(ArrayList array_A) throws IOException{

		Trade trade = new Trade();

		array_A.add(0,"");
		array_A.add(1 , new Biga(1, 15 , 23 , 24));
		array_A.add(2 , new Biga(2 , 16 , 24 , 68));
		array_A.add(3 , new Biga(3, 17 , 32 , 69));
		array_A.add(4 , new Biga(4 , 37 , 23 , 61));
		array_A.add(5 , new Biga(5, 19 , 13 , 51));
		array_A.add(6 , new Biga(6 , 44 , 23 , 52));
		array_A.add(7 , new Biga(7, 11 , 13 , 53));
		array_A.add(8 , new Biga(8 , 35 , 23 , 53));
		array_A.add(9 , new Biga(9, 12 , 13 , 54));
		array_A.add(10 , new Biga(10 , 54 , 23 , 56));
		array_A.add(11 , new Biga(11, 25 , 13 , 57));
		array_A.add(12 , new Biga(12 , 44 , 23 , 58));
		array_A.add(13 , new Biga(13, 55 , 13 , 59));
		array_A.add(14 , new Biga(14 , 34 , 23 , 60));
		array_A.add(15 , new Biga(15, 35 , 13 , 61));
		array_A.add(16 , new Biga(16 , 48 , 23 , 62));
		array_A.add(17 , new Biga(17, 49 , 13 , 64));
		array_A.add(18 , new Biga(18 , 42 , 23 , 68));
		array_A.add(19 , new Biga(19, 55 , 13 , 71));
		array_A.add(20 , new Biga(20 , 54 , 23 , 72));
		array_A.add(21 , new Biga(21, 53 , 13 , 73));
		array_A.add(22 , new Biga(22 , 51 , 23 , 74));
		array_A.add(23 , new Biga(23, 50 , 13 , 74));
		array_A.add(24 , new Biga(24 , 41 , 23 , 85));
		array_A.add(25 , new Biga(25 , 31 , 13 , 86));
		array_A.add(26 , new Biga(26 , 21 , 23 , 87));
		array_A.add(27 , new Biga(27, 26 , 13 , 98));
		array_A.add(28 , new Biga(28 , 27 , 23 , 96));
		array_A.add(29 , new Biga(29, 28 , 13 , 94));
		array_A.add(30 , new Biga(30 , 29 , 23 , 93));
		array_A.add(31 , new Biga(31, 30 , 13 , 94));
		array_A.add(32 , new Biga(32 , 32 , 23 , 95));
		array_A.add(33 , new Biga(33, 36 , 13 , 91));
		array_A.add(34 , new Biga(34 , 37 , 23 , 92));
		array_A.add(35 , new Biga(35, 43 , 13 , 93));
		array_A.add(36 , new Biga(36 , 46 , 23 , 81));
		array_A.add(37 , new Biga(37, 48 , 13 , 82));
		array_A.add(38 , new Biga(38 , 23 , 23 , 83));
		array_A.add(39 , new Biga(39, 46 , 13 , 84));
		array_A.add(40 , new Biga(40 , 26 , 23 , 85));
		array_A.add(41 , new Biga(41, 55 , 13 , 88));
		array_A.add(42 , new Biga(42 , 53 , 23 , 84));
		array_A.add(43 , new Biga(43, 23 , 13 , 76));
		array_A.add(44 , new Biga(44 , 43 , 23 , 65));
		array_A.add(45 , new Biga(45, 58 , 13 , 43));
		array_A.add(46 , new Biga(46 , 59 , 23 , 67));
		array_A.add(47 , new Biga(47, 55, 13 , 55));
		array_A.add(48 , new Biga(48 , 34 , 23 , 78));
		array_A.add(49 , new Biga(49, 25 , 13 , 54));
		array_A.add(50 , new Biga(50 , 26 , 23 , 78));

		//Path of BigA_depots Text File
		FileWriter f = new FileWriter("C:\\Users\\Hamad Najaf\\Downloads\\New folder\\New folder\\BigA_depots.txt");

		//Write in the TextFile 
		for (int i = 1; i < array_A.size() ; ++i) {

			String s = String.valueOf(array_A.get(i));
			f.write(s);
			f.write(trade.tradeOf_A());
			f.write("\n");
			
		}//if
	
		f.close();
	}//WriteA

	public static void writeBigB(ArrayList array_B) throws IOException{

		Trade trade = new Trade();
		array_B.add(0 , "");
		array_B.add(1 , new Biga(1, 15 , 23 , 24));
		array_B.add(2 , new Biga(2 , 16 , 24 , 68));
		array_B.add(3 , new Biga(3, 17 , 32 , 69));
		array_B.add(4 , new Biga(4 , 37 , 23 , 61));
		array_B.add(5 , new Biga(5, 19 , 13 , 51));
		array_B.add(6 , new Biga(6 , 44 , 23 , 52));
		array_B.add(7 , new Biga(7, 11 , 13 , 53));
		array_B.add(8 , new Biga(8 , 35 , 23 , 53));
		array_B.add(9 , new Biga(9, 12 , 13 , 54));
		array_B.add(10 , new Biga(10 , 54 , 23 , 56));
		array_B.add(11 , new Biga(11, 25 , 13 , 57));
		array_B.add(12 , new Biga(12 , 44 , 23 , 58));
		array_B.add(13 , new Biga(13, 55 , 13 , 59));
		array_B.add(14 , new Biga(14 , 34 , 23 , 60));
		array_B.add(15 , new Biga(15, 35 , 13 , 61));
		array_B.add(16 , new Biga(16 , 48 , 23 , 62));
		array_B.add(17 , new Biga(17, 49 , 13 , 64));
		array_B.add(18 , new Biga(18 , 42 , 23 , 68));
		array_B.add(19 , new Biga(19, 55 , 13 , 71));
		array_B.add(20 , new Biga(20 , 54 , 23 , 72));
		array_B.add(21 , new Biga(21, 53 , 13 , 73));
		array_B.add(22 , new Biga(22 , 51 , 23 , 74));
		array_B.add(23 , new Biga(23, 50 , 13 , 74));
		array_B.add(24 , new Biga(24 , 41 , 23 , 85));
		array_B.add(25 , new Biga(25 , 31 , 13 , 86));
		array_B.add(26 , new Biga(26 , 21 , 23 , 87));
		array_B.add(27 , new Biga(27, 26 , 13 , 98));
		array_B.add(28 , new Biga(28 , 27 , 23 , 96));
		array_B.add(29 , new Biga(29, 28 , 13 , 94));
		array_B.add(30 , new Biga(30 , 29 , 23 , 93));
		array_B.add(31 , new Biga(31, 30 , 13 , 94));
		array_B.add(32 , new Biga(32 , 32 , 23 , 95));
		array_B.add(33 , new Biga(33, 36 , 13 , 91));
		array_B.add(34 , new Biga(34 , 37 , 23 , 92));
		array_B.add(35 , new Biga(35, 43 , 13 , 93));
		array_B.add(36 , new Biga(36 , 46 , 23 , 81));
		array_B.add(37 , new Biga(37, 48 , 13 , 82));
		array_B.add(38 , new Biga(38 , 23 , 23 , 83));
		array_B.add(39 , new Biga(39, 46 , 13 , 84));
		array_B.add(40 , new Biga(40 , 26 , 23 , 85));
		array_B.add(41 , new Biga(41, 55 , 13 , 88));
		array_B.add(42 , new Biga(42 , 53 , 23 , 84));
		array_B.add(43 , new Biga(43, 23 , 13 , 76));
		array_B.add(44 , new Biga(44 , 43 , 23 , 65));
		array_B.add(45 , new Biga(45, 58 , 13 , 43));
		array_B.add(46 , new Biga(46 , 59 , 23 , 67));
		array_B.add(47 , new Biga(47, 55, 13 , 55));
		array_B.add(48 , new Biga(48 , 34 , 23 , 78));
		array_B.add(49 , new Biga(49, 25 , 13 , 54));
		array_B.add(50 , new Biga(50 , 26 , 23 , 78));

		//Path of BigA_depots Text File
		FileWriter f = new FileWriter("C:\\Users\\Hamad Najaf\\Downloads\\New folder\\New folder\\BigB_depots.txt");

		//Write in the TextFile 
		for (int i = 1; i < array_B.size() ; ++i) {
			String s = String.valueOf(array_B.get(i));
			f.write(s);
			f.write(trade.tradeOf_B());
			f.write("\n");
			
		}//if
	
		f.close();
	}//WriteB

	public static void writeBigC(ArrayList array_C) throws IOException{

		Trade trade = new Trade();
		array_C.add(0 , "");
		array_C.add(1 , new Biga(1, 15 , 23 , 24));
		array_C.add(2 , new Biga(2 , 16 , 24 , 68));
		array_C.add(3 , new Biga(3, 17 , 32 , 69));
		array_C.add(4 , new Biga(4 , 37 , 23 , 61));
		array_C.add(5 , new Biga(5, 19 , 13 , 51));
		array_C.add(6 , new Biga(6 , 44 , 23 , 52));
		array_C.add(7 , new Biga(7, 11 , 13 , 53));
		array_C.add(8 , new Biga(8 , 35 , 23 , 53));
		array_C.add(9 , new Biga(9, 12 , 13 , 54));
		array_C.add(10 , new Biga(10 , 54 , 23 , 56));
		array_C.add(11 , new Biga(11, 25 , 13 , 57));
		array_C.add(12 , new Biga(12 , 44 , 23 , 58));
		array_C.add(13 , new Biga(13, 55 , 13 , 59));
		array_C.add(14 , new Biga(14 , 34 , 23 , 60));
		array_C.add(15 , new Biga(15, 35 , 13 , 61));
		array_C.add(16 , new Biga(16 , 48 , 23 , 62));
		array_C.add(17 , new Biga(17, 49 , 13 , 64));
		array_C.add(18 , new Biga(18 , 42 , 23 , 68));
		array_C.add(19 , new Biga(19, 55 , 13 , 71));
		array_C.add(20 , new Biga(20 , 54 , 23 , 72));
		array_C.add(21 , new Biga(21, 53 , 13 , 73));
		array_C.add(22 , new Biga(22 , 51 , 23 , 74));
		array_C.add(23 , new Biga(23, 50 , 13 , 74));
		array_C.add(24 , new Biga(24 , 41 , 23 , 85));
		array_C.add(25 , new Biga(25 , 31 , 13 , 86));
		array_C.add(26 , new Biga(26 , 21 , 23 , 87));
		array_C.add(27 , new Biga(27, 26 , 13 , 98));
		array_C.add(28 , new Biga(28 , 27 , 23 , 96));
		array_C.add(29 , new Biga(29, 28 , 13 , 94));
		array_C.add(30 , new Biga(30 , 29 , 23 , 93));
		array_C.add(31 , new Biga(31, 30 , 13 , 94));
		array_C.add(32 , new Biga(32 , 32 , 23 , 95));
		array_C.add(33 , new Biga(33, 36 , 13 , 91));
		array_C.add(34 , new Biga(34 , 37 , 23 , 92));
		array_C.add(35 , new Biga(35, 43 , 13 , 93));
		array_C.add(36 , new Biga(36 , 46 , 23 , 81));
		array_C.add(37 , new Biga(37, 48 , 13 , 82));
		array_C.add(38 , new Biga(38 , 23 , 23 , 83));
		array_C.add(39 , new Biga(39, 46 , 13 , 84));
		array_C.add(40 , new Biga(40 , 26 , 23 , 85));
		array_C.add(41 , new Biga(41, 55 , 13 , 88));
		array_C.add(42 , new Biga(42 , 53 , 23 , 84));
		array_C.add(43 , new Biga(43, 23 , 13 , 76));
		array_C.add(44 , new Biga(44 , 43 , 23 , 65));
		array_C.add(45 , new Biga(45, 58 , 13 , 43));
		array_C.add(46 , new Biga(46 , 59 , 23 , 67));
		array_C.add(47 , new Biga(47, 55, 13 , 55));
		array_C.add(48 , new Biga(48 , 34 , 23 , 78));
		array_C.add(49 , new Biga(49, 25 , 13 , 54));
		array_C.add(50 , new Biga(50 , 26 , 23 , 78));


		//Path of BigA_depots Text File
		FileWriter f = new FileWriter("C:\\Users\\Hamad Najaf\\Downloads\\New folder\\New folder\\BigC_depots.txt");

		//Write in the TextFile 
		for (int i = 1; i < array_C.size() ; ++i) {

			String s = String.valueOf(array_C.get(i));
			f.write(s);
			f.write(trade.tradeOf_C());
			f.write("\n");
			
		}//if
	
		f.close();
	}//writeC
}//class
    

