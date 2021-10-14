package 이진탐색알고리즘;

import java.util.LinkedList;

public class BST<Key extends Comparable<Key>,Value> {
	public Node root;
	public Node getRoot() {return root;}
	
	public BST(Key newId,Value newName) {
		root=new Node(newId,newName);
	}
	// 트리에서 k 값을 갖는 노드를 탐색 + Value 를 리턴 
	public Value get(Key k) {return get(root,k);}
	// 오버로딩 override는 부모클래스로부터 받아온 메서드를 재정의, 오버로딩은 여러가지 메서드를 다양한 유형으로 선언한것. 
	public Value get(Node n,Key k) {
		if (n==null) {return null;}
		
		// 0 - + 의 결과에 따라 값 찾음, 값이 더 작음, 값이 더 작음 으로 구분이 됨.
		// a.compareTo(b) 는 a 가 b보다 더크면 + 를 출력함.  
		int t=n.getKey().compareTo(k);
		
		if(t>0) {
			return get(n.getLeft(),k);	
		}
		else if(t<0) {
			return get(n.getRight(),k);
		}
		else {
			return (Value) n.getValue();  // (Value) 타입으로 캐스팅(형변환) 
		}
		}
	// 트리에서 k 값을 갖는 노드를 탐색 , value를 리턴 , 루트부터 탐색 
	// 삽입 연산 (key(k)와 value(v)를 갖는 새노드 생성 + 부모와 연결 
	
	
	public void put(Key k,Value v) {
		root=put(root,k,v);
	}
	// 루트가 n 인 서브 트리에 노드 (k,v) 를 삽입 
	public Node put(Node n,Key k,Value v) {
		//노드 자체가 null 이라면 새로운 노드를 리턴한다.돌아가면서 부모의 
	if (n==null) {return new Node(k,v);}
	
	int t=n.getKey().compareTo(k);
	
	if(t>0) {
		n.setLeft(put(n.getLeft(),k,v));
	}
	else if(t<0) {
		n.setRight(put(n.getRight(),k,v));	
	}
	else {
		n.setValue(v);
	}
	return n;
	}
	
	
	// 최솟값 찾기 
	public Key min() {
		if(root==null) return null;
		
		return (Key) min(root).getKey();
	
	}
	
	// Node 자체를 return 한다. 
	
	private Node min(Node n) {
		if(n.getLeft()==null) return n;
		
		return min(n.getLeft());
	}
	
	
	
	
	
	
	// 최솟값 삭제 
	public void deleteMin() {
		
		if(root==null) System.out.println("empty 트리");
		
		root=deleteMin(root);
	}
	// 최솟값을 가진 노드 x를 찾아, x의 부모 노드 p와 x의 오른쪽 자식노드 c를 연결 
	public Node deleteMin(Node n) {
		if(n.getLeft()==null)
			return n.getRight();
		// n의 왼쪽 자식이 있다면, n의 왼쪽자식으로 재귀 호출 
		n.setLeft(deleteMin(n.getLeft()));
		return n; 
	}
	
	
	
	
	
	
	public void delete(Key k) {
		root=delete(root,k); 
	}
	public Node delete(Node n,Key k) {
		if(n==null) {
			return null;
		}
		int t=n.getKey().compareTo(k);
		if(t>0) {
			n.setLeft(delete(n.getLeft(),k));
		}
		else if(t<0) {
			n.setRight(delete(n.getRight(),k));
		}
		else { // 드디어 k를 찾은 경우. 
			
			if(n.getRight()==null) return n.getLeft(); // case 0, 1  - leaf 노드 일, 자식 노드 1개 
			if(n.getLeft()==null) return n.getRight(); // case 1 - 자식 노드 1개
			
			
			
			
			// - case 2 자식 노드 2개 
			Node target= n;
			n=min(target.getRight());
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		return n;
	}
	
	
	
	
	public int height() {
		return height(root)+1;
	}
	
	public int height(Node n) {
		if (n==null) return -1;
		
		return 1+Math.max(height(n.getLeft()),height(n.getRight()));
	}

	public void preorder(Node n){
		if(n!=null) {
			// Node n 방문 
			System.out.print(n.getKey()+" ");
			preorder(n.getLeft());         //n의 왼쪽 서브트리 순회
			preorder(n.getRight());        // n의 오른쪽 서브트리 순회 
		}
	}
	public void inorder(Node n) {
		if(n!=null) {
			inorder(n.getLeft());
			System.out.print(n.getKey()+" ");
			inorder(n.getRight());
		}
	}
	public void levelorder(Node root) {
		LinkedList<Node>q=new LinkedList<Node>(); // 큐 자료 구조를 이용할 것임.
		Node t;
		q.add(root);
		while(!q.isEmpty()) {
			t=q.remove();
			System.out.print(t.getKey()+" ");
			if(t.getLeft()!=null) {
				q.add(t.getLeft());
			}
			if(t.getRight()!=null) {
				q.add(t.getRight());
			} 
		}
	}
	
	public void print(Node root) {
		System.out.printf("\ninorder:\n");
		inorder(root);
		System.out.printf("\npreorder:\n");
		preorder(root);
		System.out.printf("\nlevel order:\n");
		levelorder(root);
	}
		
	

}