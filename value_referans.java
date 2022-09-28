
public class value_referans {

	public static void main(String[] args) {
		
		 //value 
		 int sayi1=10;
		 int sayi2=20;
		 sayi2 =sayi1;
		 System.out.println(sayi2);
		 
		 //referans
		 int[] sayilar1= new int[] {1,2,3};
		 int[] sayilar2= new int[] {4,5,6};
		 sayilar2=sayilar1;
		 sayilar1[0]=10;
		 System.out.println(sayilar2[0]);
		 
		 

	}

}
