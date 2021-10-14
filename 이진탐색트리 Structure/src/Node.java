

//key는 comparable 인터페이스를 상속 받았고, 각각 제네릭 타입이다 . 
//java bean 규약 getter setter 를 가지고 있음. 
public class Node<Key extends Comparable<Key>,Value>{
	private Key id;
	private Value name;
	private Node left,right;
	
	// key는 id 이다. 값은 Value-> name 이다.
	
	public Node(Key newId,Value newName) {
	id=newId;
	name=newName;
	left=right=null;
}
	
	public Key getKey(){return id;}
	public Value getValue() {return name;}
	public Node getLeft() {return left;}
	public Node getRight() {return right;}
	
	public void setKey(Key newId) {id=newId;}
	public void setValue(Value newName) {name=newName;}
	public void setLeft(Node newLeft) {left=newLeft;}
	public void setRight(Node newRight) {right=newRight;}
	
}

