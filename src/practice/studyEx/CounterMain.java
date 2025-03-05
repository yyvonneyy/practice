package practice.studyEx;

public class CounterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxCounter counter = new MaxCounter(3);
		
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		int count = counter.getCount();
		System.out.println(count);
	}

}
