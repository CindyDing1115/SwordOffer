package jyc.offer._3_FindInPartiallySortedMatirx;
/**
 *  ˼·��
 *  1�������Ͻǿ�ʼ����
 *  2�����ֵ����num��������1��С��num����������1��
 * @author Administrator
 *
 */
public class FindInPartiallySortedMatirx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] matrix = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15} };
		int[][] matrix = {};
		System.out.println(changeValue(matrix, 7));
	}

	private static boolean changeValue(int[][] matrix, int num) {
		boolean result = false;
		int columns, rows;
		//�ж��Ƿ���Ԫ��
		if(matrix.length > 0 ){
			columns = matrix[0].length;
			rows = matrix.length;
		}
		else {
			columns = 0;
			rows = 0;
		}
		if(columns >=0 && rows >=0 && matrix != null){  //��֤������Ч
			int c = columns-1, r = 0;
			while (c >= 0 && r < rows) {  //����ȡ��Ԫ��
				if(matrix[c][r] == num){ //���ʱ
					result = true;
					break;
				}
				else if(matrix[c][r] > num) {c = c-1;}  //���ֵ����num��������1
				else {r=r+1;}  //С��num����������1��
			}
		}
		return result;
	}
}
