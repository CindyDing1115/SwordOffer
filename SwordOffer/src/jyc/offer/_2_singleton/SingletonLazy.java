package jyc.offer._2_singleton;
/**
 * ����ʽ����󷵻ص�ʱ�򴴽�����
 * @author Administrator
 *
 */
public class SingletonLazy {
	private static SingletonLazy s = null;
	private SingletonLazy() {}
	public SingletonLazy getInstance() {
		if(null == s){  //null��ʱ�򣬲ż�����
			synchronized (SingletonLazy.class) {  //��ס�������������̲߳���s���ᵼ�²�����������
				if(null == s)  s = new SingletonLazy();	
			}		
		}
		return s;
	}

}
