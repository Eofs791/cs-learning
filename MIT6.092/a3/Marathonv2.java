package a3;

public class Marathonv2 {
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
		int topTime = Integer.MAX_VALUE, topNum = -1;
		for (int i = 0; i < time.length; i++) {
			if (time[i] < topTime) {
				topTime = time[i];
				topNum = i;
			}
		}
		return topNum;
	}

	public static int findSecondRunner(int[] time) {
		int secondTime = Integer.MAX_VALUE, secondNum = -1;
		for (int i = 0; i < time.length; i++) {
			if (time[i] < secondTime && i != findBestRunner(time)) {
				secondTime = time[i];
				secondNum = i;
			}
		}
		return secondNum;
	}
}
