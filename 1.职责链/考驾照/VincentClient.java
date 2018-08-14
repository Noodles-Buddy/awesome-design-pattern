package chainFcar;

/**
 * 
 * @author zhenhua.zhang
 *
 */

public class VincentClient {
	
	public static void main(String[] args){
		VincentChain chain = new VincentChain();
		ProjectOneExamHandler one = new ProjectOneExamHandler();
		ProjectTwoExamHandler two = new ProjectTwoExamHandler();
		ProjectThreeExamHandler three = new ProjectThreeExamHandler();
		ProjectFourExamHandler four = new ProjectFourExamHandler();
		
		chain.addHandler(one);
		chain.addHandler(two);
		chain.addHandler(three);
		chain.addHandler(four);
		
		Object o = new Object();
		chain.doChain(o);
	}
	
}
