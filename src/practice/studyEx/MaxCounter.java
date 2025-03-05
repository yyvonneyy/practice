package practice.studyEx;

public class MaxCounter {
	private int count = 0;
	private int max;
	
	public MaxCounter(int max) {
		this.max = max;
	}
	
	public void increment() {
		if(isValidMax(max) && count < max) {
		count++;
		} else {
			System.out.println("유효하지 않은 최대값이거나 현재 상태가 최대입니다.");
		}
	} 
	
	public int getCount() {
		return count;
	}
	
	private boolean isValidMax(int max) {
		return max > 0;
		
	}
	
	

}
