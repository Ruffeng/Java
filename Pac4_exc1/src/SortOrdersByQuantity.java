
public class SortOrdersByQuantity implements java.util.Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		return o1.getQuantity() - o2.getQuantity();
	}

}
