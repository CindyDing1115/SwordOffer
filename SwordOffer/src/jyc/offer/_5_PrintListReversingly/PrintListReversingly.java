package jyc.offer._5_PrintListReversingly;

import java.util.Stack;

/**
 * ����һ���ݹ飺���õݹ���õķ�ʽ���δ�ӡ��һ����
 * α���룺 �ʼ�
 * @author Administrator
 *
 */
public class PrintListReversingly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		n1.key = 1;
		n1.next = n2;
		n2.key = 2;
		n2.next = n3;		
		n3.key = 3;
		n3.next = null;
		
		Node head = n1;
		printListRecursively(head);
		printListIteratively(head);
	}
	/**
	 * �ݹ�ķ�ʽ
	 * @param n
	 */
	public static void printListRecursively(Node n){
		if(null != n){
			printListRecursively(n.next);
			System.out.println(n.key);
		}
	}
	
	/**
	 * ��ջ����ջ�ķ�ʽ
	 * @param n
	 */
	public static void printListIteratively(Node n){
		Stack<Node> s_node = new Stack<Node>();
		//��ջ
		while (n != null) {
			s_node.push(n);
			n = n.next;
		}
		//��ջ����ӡ
		while (!s_node.empty()) {
			System.out.println(s_node.pop().key);
		}
	}
}

class Node
{
	int key;
	Node next;
}
