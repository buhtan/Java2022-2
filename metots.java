
public class metots {

	public static void main(String[] args) {
		sayibulmaca();

	}

	public static void sayibulmaca() {
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 7;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		String mesaj ="deneme 1 2 3";
		if(varMi) {
			System.out.println("Sayi mevcuttur :"+aranacak);
			mesajver(mesaj);
		}else {
			System.out.println("Sayi mevcut degildir"+aranacak);
		}

	}

	public static void mesajver(String mesaj) {
		System.out.println(mesaj);
		
	}

}
