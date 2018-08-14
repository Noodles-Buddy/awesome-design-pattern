package chainFcar;

import java.util.ArrayList;
import java.util.List;

/**
 * 职责链分发，流程管理
 * @author zhenhua.zhang
 *
 */
public class VincentChain {
	//处理流程handler集合，利用List有序特性
	List<AbsExamHandler> handler = new ArrayList<AbsExamHandler>();
	
	//index标识位，用于索引handler
	int index = 0;
	
	/**
	 * 按顺序向handler中添加元素
	 * @param absHandler
	 * @return
	 */
	public void addHandler(AbsExamHandler absHandler){
		handler.add(absHandler);
		//return this;
	}
	
	/**
	 * 调用AbsExamHandler流程
	 */
	public void doChain(Object o){
		if(handler.size() == index){
			return;
		}
		AbsExamHandler handlerNew = handler.get(index);
		index++;
		handlerNew.handle(o,this);
	}
}
