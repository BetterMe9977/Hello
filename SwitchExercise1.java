

public class SwitchExercise1 {
	//编写一个main方法
	public static void main(String[] args) {
	
	//对于学生成绩大于60分的，输出合格，低于60分的，输出不合格
	//输入的成绩不能大于100，
	//思路分析
		//1. 可以使用 分支来完成， 但是要求使用switch
		//2. 这里我们需要进行一个转换：
		//  如果成绩在 [60,100], (int)(成绩/60） = 1
		//  如果成绩在 [0,60),(int)(成绩/60） = 0
			    
		//代码实现
		double score = 88.5;
		
		//使用if- else 保证输入的成绩有效 0-100
		if( score >= 0 && score <=100) {
			switch ((int)(score / 60)) {
				case 0 :
					System.out.println("不合格");
					break;
				case 1 :
					System.out.println("合格");
					break;
				default:
					System.out.println("输入有误");
			}
		
		} else {
			System.out.println("输入的成绩应在0-100");
			}
		}
 }
