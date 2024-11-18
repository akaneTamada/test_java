package test01;

public class cytech08 {

	 public static void main(String[] args) {
	        // 1回目のfor文: 行を繰り返す
	        for (int i = 1; i <= 3; i++) {
	            // 2回目のfor文: 各行に数字を繰り返す
	            for (int j = 1; j <= i; j++) {
	                System.out.print("0");
	            }
	            // 行を変える
	            System.out.println();
	        }
	    }
	
}
