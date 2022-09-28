
public class Parametreli_metodlar {

	public static void main(String[] args) {
		String mesaj="Bugun hava çook güzel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);

	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}public static void guncelle() {
		System.out.println("Güncellendi");
	}

	private static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}

	private static String sehirVer() {
		// TODO Auto-generated method stub
		return "Ankara";
	}

}
