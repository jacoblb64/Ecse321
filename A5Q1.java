public class A5Q1 {

	public static int doStuff(int number1thatdoesstuff) {

		int number2thatdoesstuff = 1;

		if (number1thatdoesstuff <2) {
			return number1thatdoesstuff;
		}

		int number3thatdoesstuff = 1;

		for (int i=2; i <number1thatdoesstuff; i++ ) {

			int number4thatdoesstuff = number2thatdoesstuff;
			number2thatdoesstuff += number3thatdoesstuff;
			number3thatdoesstuff = number4thatdoesstuff;
		}
			
		return number2thatdoesstuff;
	}

	// Returns the nth number of the fibonacci sequence
	public static int Fibonacci(int n) {

		if (n <2) {
			// base cases, Fib(0) = 0, Fib(1) = 1
			return n;
		}

		int fibAtI = 1;
		int fibAtIMinus2 = 1;
		int fibAtIMinus1;

		for (int i=2; i <n; i++ ) {

			fibAtIMinus1 = fibAtI;
			fibAtI += fibAtIMinus2;
			fibAtIMinus2 = fibAtIMinus1;
		}
			
		return fibAtI;
	}
}
