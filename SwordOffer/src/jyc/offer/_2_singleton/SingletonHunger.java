package jyc.offer._2_singleton;
/**
 * ����ʽ��new֮�󣬱㴴������
 * ���ַ�ʽ���ÿ����߳��Ƿ�ȫ��
 * @author Administrator
 *
 */
public class SingletonHunger {
	private static SingletonHunger s = new SingletonHunger();
	private void Singleton(){	}
	public SingletonHunger getInstance() {
		return s;
	}
}
