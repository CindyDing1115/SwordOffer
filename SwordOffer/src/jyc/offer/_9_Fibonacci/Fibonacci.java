package jyc.offer._9_Fibonacci;

/**
 * �Შ��������
 * @author Administrator
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numN =0;
		
		//����һ�����Ӷȳ�����
//		numN = fiboRecursion(100);
//		System.out.println(numN);
		
		//��������O(n)
		numN = fiboTimeN(20);
		System.out.println(numN);
		
		//��������O(lgn)
		//������ѧ��ʽ
		
	}

	/**
	 * ���м����洢��O(n)
	 * @param i
	 * @return
	 */
	private static int fiboTimeN(int n) {
		// TODO Auto-generated method stub
		int[] fibArr = new int[n+1];
		fibArr[0]=0;
		fibArr[1]=1;
		for (int i = 2; i <= n; i++) {
			fibArr[i] = fibArr[i-1] + fibArr[i-2];
		}
		return fibArr[n];
	}

	/**
	 * �ݹ�ķ�ʽ��ʱ�临�Ӷȳ�����
	 * @param n
	 * @return
	 */
	private static int fiboRecursion(int n) {
		// TODO Auto-generated method stub
		if(0 == n){
			return 0;
		}
		else if(1 == n) {
			return 1;
		}else {
			return fiboRecursion(n-1)+fiboRecursion(n-2);
		}
	}

}
