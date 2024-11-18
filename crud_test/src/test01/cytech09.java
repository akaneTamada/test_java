package test01;

public class cytech09 {

	 public static void main(String[] args) {
	        // 5人の学生の4つの科目の点数を格納した2次元配列
	        int[][] scores = {
	            {80, 70, 90, 85},  // 1人目の学生（国語、数学、理科、社会の点数）
	            {75, 85, 80, 90},  // 2人目の学生
	            {60, 95, 70, 80},  // 3人目の学生
	            {88, 78, 85, 92},  // 4人目の学生
	            {82, 88, 91, 87}   // 5人目の学生
	        };

	        // 科目名の配列
	        String[] subjects = {"国語", "数学", "理科", "社会"};

	        // 各学生の点数を表示
	        for (int i = 0; i < scores.length; i++) {
	            System.out.println("学生" + (i + 1) + "の点数:");
	            for (int j = 0; j < scores[i].length; j++) {
	                System.out.println(subjects[j] + ": " + scores[i][j] + "点");
	            }
	            System.out.println();  // 学生ごとの出力の間に空行を入れる
	        }
	    }
	
}
