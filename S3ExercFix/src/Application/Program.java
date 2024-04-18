package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.OrderStatus;
import Entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String name = "Alex Green";
		String email = "alex@gmail.com";
		Date birthDate = sdf.parse("15/03/1985 00:00:00");

		Client client = new Client(name, email, birthDate);
		
		OrderStatus status = OrderStatus.valueOf("PROCESSING");
		Order order = new Order(new Date(), status, client);
		
		int n = 2;
		for (int i=1; i<=n; i++) {
			String productName = "TV";
			double productPrice = 1000;
			int productQuantity = 1;
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			
		}
		
	}

}
