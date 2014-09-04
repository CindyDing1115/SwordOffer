package jyc.offer._8_MinNumberInRotatedArray;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numArr = {3,4,5,6,7,9,23,54,1,2};
//		int[] numArr = {1,1,0,1,1,1,1};
//		int[] numArr = {1};
		int[] numArr = {};

		int minIndex = selectMin(numArr);
		
		System.out.println(minIndex);

//		printNum(numArr);
	}

	private static void printNum(int[] numArr) {
		for (int i : numArr) {
			System.out.println(i);
		}
	}

	/**
	 * ˼·������ָ�����м俿��������ʱ������
	 * α���룺�ʼǡ�
	 * @param numArr
	 * @return
	 */
	private static int selectMin(int[] numArr) {
		// TODO Auto-generated method stub
		int smallIndex = 0, bigIndex = numArr.length-1;
		//���������
		if(numArr.length > 1){
			while (smallIndex != bigIndex-1) {  //��ֹ��������������(ָ��)����
				int midIndex = (smallIndex+bigIndex)/2;
				//****�����������������ָ���������ͬ:������������****
				if(numArr[midIndex] == numArr[smallIndex] && numArr[midIndex] == numArr[bigIndex]){
					System.out.println("mid");
					return selectInOrder(numArr);
				}
				//�ƶ�����ָ��
				if(numArr[midIndex] >= numArr[smallIndex]){
					smallIndex = midIndex;
				}else if(numArr[midIndex] <= numArr[bigIndex]){
					bigIndex = midIndex;
				}
			}
		}
		else if(numArr.length == 0){  // �����ݷ���-1
			bigIndex = -1;
		}

		return bigIndex;
	}

	/**
	 * ��������� numArr = {1,1,1,0,1,1,1,1}
	 * @param numArr
	 * @return
	 */
	private static int selectInOrder(int[] numArr) {
		// TODO Auto-generated method stub
		int minIndex = numArr[0];

		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] < numArr[minIndex]) {
				minIndex = i;
			}		
		}
		return minIndex;
	}
	
}
