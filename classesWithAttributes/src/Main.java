

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1 ,"Laptop","Asus laptop",5000,3);
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus laptop");
//		product.setPrice(500);
//		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

	}

}
