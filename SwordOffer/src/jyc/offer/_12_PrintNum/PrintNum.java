package jyc.offer._12_PrintNum;

/**
 * �����е㸴�ӣ��о����ĵľ���㣺
 * 	private static void testRecursion(int length) {
		if(length == 0){
			System.out.println(num[4]+""+num[3]+""+num[2]+""+num[1]);
			return ;
		}
		for (int i = 0; i <= 9; i++) {
			num[length]=i;
			testRecursion(length-1);
		}
	}
 * @author Administrator
 *
 */
public class PrintNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int[] num = new int[N+1];
		testRecursion(num, N);
	}

	/**
	 * д����򵥵İɣ��������� ���������
	 * @param num
	 * @param length
	 */
	private static void testRecursion(int num[], int length) {
		// TODO Auto-generated method stub
		if(length == 0){
			System.out.println(num[4]+""+num[3]+""+num[2]+""+num[1]);  //N=4ʱ
			return ;
		}
		for (int i = 0; i <= 9; i++) {
			num[length]=i;
			testRecursion(num, length-1);
		}
	}

}
