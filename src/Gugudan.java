
public class Gugudan {
	public static int[] calculate(int times) {
		int[] result1 = new int[9];
		for(int i=0; i < result1.length; i++) {
			result1[i] = times * (i + 1);
		}
		return result1;

	}
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			int[] result2 = calculate(i);
			print(result2);
		}

	}

}
