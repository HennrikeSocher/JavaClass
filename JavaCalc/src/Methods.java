
public class Methods {
	public static int calculateFatorial (int num) {
		int fat = 1;
		int i = 1;
		
		while (i<= num) {
			fat = fat * i;
			i++;
		}
		return fat;
	}
	public static int calculateExponencial(int base , int exp) {
		int result = 1;
		for(int i = exp; i >=1; i--) {
			result = result * base;
			
		}
		return result;
	}
	public static float calculatePercent(int value, int percent) {
		float result;
		result = (value / percent) * 100;
		return result;		
	}
	public static float calculateTri(int base, int height) {
		float result;
		result = (base * height) / 2;
		return result;
		
	}
}
