
public class Main {

	public static void main(String[] args) {
		double[] numbers = {18,42,3,41,15};
		double sum = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			sum += 1/numbers[i];
		}
		double average = numbers.length/sum;
		System.out.println("Harmonik Dizinin Ortalamasi: "+average);

	}

}
