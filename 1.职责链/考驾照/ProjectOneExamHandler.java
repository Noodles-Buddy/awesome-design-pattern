package chainFcar;

/**
 * 科目一考试
 * @author zhenhua.zhang
 *
 */
public class ProjectOneExamHandler extends AbsExamHandler{
	
	@Override
	public void handle(Object o, VincentChain chain){
		//todo
		if(businessCheck()){
			chain.doChain(o);
		}
	}
	
	@Override
	public Boolean businessCheck(){
		logBeforeExam(1);
		//生成1~100之间随机数，代表考试成绩，成绩大于60，可以考下一门考试
		Double score = (Double)(Math.random()*100);
		logDuringExam(1,score);
		
		if(score >= 60){
			logPassExam(1);
			return true;
		}
		logFailExam(1);
		return false;
	}
	
}
