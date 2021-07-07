package javatraining;

public class ClassMethods {

	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public int productNumbers(int c, int d) {
		int prod = c * d;
		return prod;
	}

	public double circumOfaCircle(double r) {

		double pi = 3.14;
		double c = 2 * pi * r;
		return c;
	}

	public static int getMaxValue(int[] numbers) {
		int maxValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}

	public static int getMinValue(int[] numbers) {
		int minValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassMethods obj = new ClassMethods();

		int m1 = obj.addNumbers(30, 40);
		System.out.println("Sum of two numbers:" + m1);

		int m2 = obj.productNumbers(20, 30);
		System.out.println("Product of two numbers:" + m2);

		double m3 = obj.circumOfaCircle(4);
		System.out.println("Circumference of Circle:" + m3);
          
		int numbers[]= {1,5,-9,12,-3,89, 18,23,4,-6};
		System.out.println("Minimum Value = " + getMinValue(numbers));
	       
	       System.out.println("Maximum Value = " + getMaxValue(numbers));
	}

}
