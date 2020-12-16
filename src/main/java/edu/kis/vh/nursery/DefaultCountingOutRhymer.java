package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int ERROR = -1;
	public static final int MAX_SIZE = 11;
	private int[] numbers = new int[SIZE];

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

	protected int peekaboo() {
		if (callCheck())
			return ERROR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

}
