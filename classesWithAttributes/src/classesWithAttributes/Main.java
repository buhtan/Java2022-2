package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name ="Laptop";
		product.id=1;
		product.description="Asus laptop";
		product.price=500;
		product.stockAmount=3;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

	}

}
