package jyc.offer._4_StringReplaceBlank;
/**
 * ˼·��
 * 1���Ӻ���ǰ����
 * 2��Ԥ����ռ䣺�������Ȳ��ҳ��ո������õ����һ���ַ���λ��final
 * α���룺
 * 	ReplaceBlank
 * @author Administrator
 *
 */
public class ReplaceBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = new char[100] ;
		c[0] = ' ';
		c[1] = ' ';
		c[2] = 'd';
		c[3] = 'f';
		c[4] = ' ';
		c[5] = 's';
//		System.out.println(c);
		Replace(c);
		System.out.println(c);

	}

	private static void Replace(char[] c) {
		int cnt = 0;		
		int len = 0;
		int index_old = 0;
		int index_new = 0;
		while (c[len] != '\0') {  //���������ʵ����
			len = len + 1;
		}
		index_old = len - 1;
		for (char d : c) {   //ͳ�ƿո����
			if(' ' == d) cnt=cnt+1;
		}
		index_new = len + ("%20".length() - 1)*cnt - 1;
		while(index_new >=0 && index_old>=0){
			if (' ' != c[index_old]) {  
				c[index_new] = c[index_old];
				index_new = index_new - 1;
			} else {  //�ո���
				index_new = ReplaceBlace(c, index_new);
			}
			index_old = index_old - 1;
		}
	}

	private static int ReplaceBlace(char[] c, int index_new) {//�ո���
		c[index_new] = '0';
		index_new = index_new - 1;
		c[index_new] = '2';
		index_new = index_new - 1;
		c[index_new] = '%';
		index_new = index_new - 1;
		return index_new;
	}

}
