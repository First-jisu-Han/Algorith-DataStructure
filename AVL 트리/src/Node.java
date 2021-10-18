public class Node<Key extends Comparable<Key>,Value> {
	Key id;
	Value name;
	int height;
	Node left,right;
	
	
	public Node(Key newId,Value newName,int newHt) {
	id=newId;
	name=newName;
	height=newHt;
	left=right=null;
	
	
	
	
}}