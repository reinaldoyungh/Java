package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

		private Date moment;
		private OrderStatus status;
		private List<OrderItem> orderItem = new ArrayList<>();
		private Client client;
		
		public Order() {
		}

		
		public Order(Date moment, OrderStatus status, Client client) {
			this.moment = moment;
			this.status = status;
			this.client = client;
		}


		public Date getMoment() {
			return moment;
		}


		public void setMoment(Date moment) {
			this.moment = moment;
		}


		public OrderStatus getStatus() {
			return status;
		}


		public void setStatus(OrderStatus status) {
			this.status = status;
		}


		public Client getClient() {
			return client;
		}


		public void setClient(Client client) {
			this.client = client;
		}


		public List<OrderItem> getOrderItem() {
			return orderItem;
		}

		public void addItem(OrderItem orderItem) {
			((List<OrderItem>) orderItem).add(orderItem);
		}

		public void removeItem(OrderItem orderItem) {
			((List<OrderItem>) orderItem).remove(orderItem);
		}


		
		
}
