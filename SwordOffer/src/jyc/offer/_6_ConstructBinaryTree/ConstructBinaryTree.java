package jyc.offer._6_ConstructBinaryTree;
/**
 * Need to fix.:û�п��Ǳ߽�ֵ������ֵ
 * ˼·��ǰ��ĵ�һ���ڵ���Ϊ������м�ڵ㣬ȡ������tree���ҵ���λ�á�Ȼ�󣬵ݹ�����������
 * α���룺�ʼ�
 * @author Administrator
 *
 */
public class ConstructBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = {1,2,4,7,3,5,6,8};
		int[] inorder = {4,7,2,1,5,3,8,6};
		
		int startPreorder = 0;
		int endPreorder = preorder.length-1;
		int startInorder = 0;
		int endInorder = inorder.length-1;
		
		construct(preorder, inorder, startPreorder, endPreorder, startInorder, endInorder);
		
	}

	private static Node construct(int[] preorder, int[] inorder,
			int startPreorder, int endPreorder, int startInorder, int endInorder) {
		// TODO Auto-generated method stub
		Node root = new Node();
		root.data = preorder[startPreorder];
		if(startPreorder == endPreorder) {
			System.out.println(root.data);
			return root;
		}
		int rootInorder = startInorder;		
		int rootValue = preorder[startPreorder];
		//�ҵ� root��inorder�е�λ��
		while (rootInorder <= endInorder && inorder[rootInorder] != rootValue) {
			rootInorder++;
		}
		int leftPreorderEnd = startPreorder + (rootInorder-startInorder);
		if (rootInorder-startInorder>0) {//������������ʱ�򣬹���������
			root.left = construct(preorder, inorder, startPreorder + 1, leftPreorderEnd, startInorder, rootInorder-1);
		}
		if (rootInorder-startInorder<endPreorder-startPreorder) {//������������ʱ�򣬹���������
			root.right = construct(preorder, inorder, leftPreorderEnd+1, endPreorder, rootInorder+1, endInorder);
		}
		System.out.println(root.data);
		return root;
	}

}

class Node
{
	int data;
	Node left;
	Node right;
}