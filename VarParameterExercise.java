
public class VarParameterExercise {
	//编写一个mian方法
	public static void main(String[] args) {
		
		HspMethod0 hm = new HspMethod0();
		System.out.println(hm.showScore("milan",90.1,80.0));
		System.out.println(hm.showScore("terry",90.1,80.0,10,30.5,70));
				
	}
		
}

class HspMethod0 {
	/*
	有三个方法，分别实现返回姓名和两门课程成绩总分
	返回姓名和三门课程成绩总分，返回姓名和五门课程成绩总分
	封装成一个可变参数的方法
	 */
	
	//分析
	//1.方法名showScore  2.形参（String ， double...) 3.返回String
	public String showScore(String name, double...scores) {
		double totalScore = 0;
		for(int i = 0; i < scores.length; i++ ) {
			totalScore += scores[i];
		}	
	
		return name + "有" + scores.length + "门课程的成绩总分为=" + totalScore;
	}
	
}