package test01;

public class cytech02 {
	

	public static void main(String[] args) {
        int number1 = 10;
        int number2 = 50;

        // 加算（足し算）
        int sum = number1 + number2;
        System.out.println("加算: " + sum);  

        // 減算（引き算）
        int difference = number2 - number1;
        System.out.println("減算: " + difference);  

        // 乗算（掛け算）
        int product = number1 * number2;
        System.out.println("乗算: " + product);  

        // 除算（割り算）
        int quotient = number2 / number1;
        System.out.println("除算: " + quotient);  

        // 剰余算（割り算の余り）
        int remainder = number2 % number1;
        System.out.println("剰余算: " + remainder); 
}
}