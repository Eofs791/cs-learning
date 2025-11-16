package a3;

class Marathon {
	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
		
		System.out.println("The best runner is " + names[findBestRunner(times)] + " with the time of " + times[findBestRunner(times)]);
		System.out.println("The second best runner is " + names[findSecondRunner(times)] + " with the time of " + times[findSecondRunner(times)]);
	}

	public static int findBestRunner(int[] time) {
		int topTime = time[0], topNum = 0;
		for (int i = 1; i < time.length; i++) {
			if (time[i] < topTime) {
				topTime = time[i];
				topNum = i;
			}
		}
		return topNum;
	}

	public static int findSecondRunner(int[] time) {
		int secondTime = time[0], secondNum = 0;
		if (time[0] == time[findBestRunner(time)]) {
			secondTime = time[1];
			secondNum = 1;
		}
		for (int i = secondNum + 1; i < time.length; i++) {
			if (time[i] < secondTime && time[i] != time[findBestRunner(time)]) {
				secondTime = time[i];
				secondNum = i;
			}
		}
		return secondNum;
	}
}