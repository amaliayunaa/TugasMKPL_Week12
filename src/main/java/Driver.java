import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {

		Counter counter = new Counter();

		System.out.println("Current count:" + counter.getCount());
		System.out.println("Jumlah saat ini" + counter.getCount());

		counter.increaseBy(1);
		counter.increaseBy(2);
		counter.increaseBy(3);
		counter.increaseBy(4);
		counter.increaseBy(5);

		System.out.println("Current count:" + counter.getCount());
		System.out.println("Jumlah saat ini" + counter.getCount());

		counter.decreaseBy(1);
		counter.decreaseBy(2);
		counter.decreaseBy(3);

		System.out.println("Current count:" + counter.getCount());
		System.out.println("Jumlah saat ini" + counter.getCount());

		counter.multiplyBy(1);
		counter.multiplyBy(2);
		counter.multiplyBy(3);
		counter.multiplyBy(5);
		counter.multiplyBy(5);
		counter.multiplyBy(6);
	}

}
