package jyc.offer._7_QueueWithTwoStacks;

import java.util.Stack;

/**
 * ˼·����ջ��ͨ��ջs1����ջ�����s2��Ϊ�գ���ջ�������s1��ջ������s2���ٴ�s2��ջ��
 * α���룺�ʼǡ�
 * @author Administrator
 *
 */
public class QueueWithTwoStacks {
	private static Stack s1 = new Stack<>();
	private static Stack s2 = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pop();
		push(1);
		push(23);
		pop();
	}

	private static void push(int value) {
		s1.push(value);
	}
	
	private static void pop(){
		if(!s2.empty()){
			System.out.println(s2.pop());
		}
		else {
			if(s1.empty()){
				System.out.println("No element.");
			}
			else {
				while (!s1.empty()) {s2.push(s1.pop());}
				System.out.println(s2.pop());
			}
		}
	}



}
