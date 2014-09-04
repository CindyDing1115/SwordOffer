package jyc.offer._10_NumberOf1;

public class NumberOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testNum = -23;
		System.out.println(numberOf1MoveRight(testNum));
		
		System.out.println(numberOf1MoveLeft(testNum));
		
		System.out.println(numberOf1BestMethod(testNum));
	}

	/**
	 * ����������õķ�����
	 * ÿ�ξ��� n=n&(n-1) ��1�ĸ�����һ�������Ϊ0��
	 * ע�⣺���ڸ����������˸���1 �ĸ�����
	 * @param testNum
	 * @return
	 */
	private static int numberOf1BestMethod(int testNum) {
		// TODO Auto-generated method stub
		int cnt=0;
		while(testNum != 0){
			cnt++;
			testNum = testNum & (testNum-1);
		}
		return cnt;
	}

	/**
	 * �����������Ʊ�־����flag--�����ڸ���
	 * @param testNum
	 * @return
	 */
	private static int numberOf1MoveLeft(int testNum) {
		// TODO Auto-generated method stub
		int cnt = 0, flag = 1;
		while (flag > 0) {
			if ((testNum&flag) >= 1) {
				cnt++;
			}
			flag = flag << 1;
		}
		return cnt;
	}


	/**
	 * ����һ������testNum
	 * ������������
	 * @param testNum
	 * @return
	 */
	private static int numberOf1MoveRight(int testNum) {
		// TODO Auto-generated method stub
		int cnt=0;
		while (testNum>0) {
			if ((testNum&1) == 1) {
				cnt++;
			}
			testNum = testNum >> 1;
		}
		return cnt;
	}

}
