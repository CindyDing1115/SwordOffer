package jyc.offer._11_CalcExponent;

import java.util.Date;

import javax.xml.crypto.Data;

/**
 * ����base�� exp�η�
 * @author Administrator
 *
 */
public class CalcExponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��Ч�ʽϵ� �����ǿ�����base, exp�������������
		System.out.println(calcExp(1.2, 2000));

		//�����������õݹ�
	}

	
	private static double calcExp(double base, int exp) {
		// TODO Auto-generated method stub
		if(base == 0){
			return 1;
		}
		if(exp == 0){
			return 1;
		}else if (exp > 0) {
			return calcExpPositive(base, exp);
//			return calcExpPositiveRecursion(base, exp);
		}else {
			exp = Math.abs(exp);
			return 1.0/calcExpPositive(base, exp);
//			return 1.0/calcExpPositiveRecursion(base, exp);
		}
	}
 
	/**
	 * �������
	 * @param base
	 * @param exp
	 * @return
	 */
	private static double calcExpPositive(double base, int exp) {
		// TODO Auto-generated method stub
		double result = 1.0;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		return result;
	}
	/**
	 * �ݹ� ��⣬���ټ��������
	 * @param base
	 * @param exp
	 * @return
	 */
	private static double calcExpPositiveRecursion(double base, int exp) {
		if(exp == 0){
			return 1;
		}else if (exp == 1) {
			return base;
		}
		double result = calcExpPositiveRecursion(base, exp/2);
		result *= result;
		if(exp % 2 == 1){  //����
			result = result * base;
		}
		return result;
	}
}
