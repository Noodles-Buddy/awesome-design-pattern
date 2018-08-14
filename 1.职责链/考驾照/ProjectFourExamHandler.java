package chainFcar;

/**
 * 科目四考试
 * @author zhenhua.zhang
 *
 */
public class ProjectFourExamHandler extends AbsExamHandler{
	@Override
	public void handle(Object o, VincentChain chain){
		//todo other
		if(businessCheck()){
			chain.doChain(o);
		}
	}
	
	@Override
	public Boolean businessCheck(){
		logBeforeExam(4);
		Double score = (Double)(Math.random()*100);
		logDuringExam(4,score);
		
		if(score >= 60){
			logPassExam(4);
			return true;
		}
		
		logFailExam(4);
		return false;
	}
}
