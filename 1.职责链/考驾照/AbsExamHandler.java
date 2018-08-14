package chainFcar;
/**
 * 模拟处理考试流程
 * 规则：
 * 1.考生只有依次考过了：科目一、科目二、科目三、科目四，方可拿到驾照
 * 2.各次考试考过与否成绩均存档
 * 3.中途未通过考试，下次从上次考试节点继续考试
 * 
 * @author zhenhua.zhang
 */
public abstract class AbsExamHandler {
	
	/**
	 * 公共方法，每个节点都会执行，子类不用Override
	 */
	protected void commonMethod(){
		//todo 公共方法：eg ->
		//1.通过id查询考生信息
		//2.核对考生准考证、身份证等信息
		//3.and so on  这块可以拆分多个protected方法
	}
	
	/**
	 * 不同流程的业务起点
	 */
	public abstract void handle(Object o, VincentChain chain);
	
	/**
	 * 不同流程下的业务规则
	 * @return
	 */
	public abstract Boolean businessCheck();
	
	protected void logBeforeExam(Integer type){
		System.out.println("Vincent你的考试科目" + type + "的考试马上开始！");
	}
	
	protected void logDuringExam(Integer type,Double score){
		System.out.println("Vincent你的考试科目" + type + "的成绩是：" + score + "分");
	}
	
	protected void logPassExam(Integer type){
		if(type == 4){
			System.out.println("Vincent，你通过了科目" + type + "的考核，恭喜你拿到了驾驶证！");
			return;
		}
		System.out.println("Vincent，你通过了科目" + type + "的考核，接下来好好准备下一门科目" + (type+1) + "的考核吧！");
	}
	
	protected void logFailExam(Integer type){
		System.out.println("Vincent，你未通过了科目" + type + "的考核，请再接再厉！！！");
	}
	
}
