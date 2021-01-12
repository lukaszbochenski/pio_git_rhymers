package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int ERROR = -1;
	private static final int MAX_SIZE = 11;
	private int[] numbers = new int[SIZE];

	public int getTotal() {
		return total;
	}


	public int total = ERROR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == ERROR;
	}

	public boolean isFull() {
		return total == MAX_SIZE;
	}

	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

	public static int getSize() {
		return SIZE;
	}
	protected int peekaBoo() {
		if (callCheck())            
			return ERROR;         
		return numbers[total];     }

	public static int getError() {
		return ERROR;
	}

	public static int getMaxSize() {
		return MAX_SIZE;
	}

}
