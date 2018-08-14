package chainFcar;
/**
 * 科目二考试
 * @author zhenhua.zhang
 *
 */
public class ProjectTwoExamHandler extends AbsExamHandler{
	
	@Override
	public void handle(Object o, VincentChain chain){
		//todo
		if(businessCheck()){
			chain.doChain(o);
		}
	}
	
	@Override
	public Boolean businessCheck(){
		logBeforeExam(2);
		//生成1~100之间随机数，代表考试成绩，成绩大于60，可以考下一门考试
		Double score = (Double)(Math.random()*100);
		logDuringExam(2,score);
		
		if(score >= 60){
			logPassExam(2);
			return true;
		}
		
		logFailExam(2);
		return false;
	}
}
