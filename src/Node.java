public class Node<S>{

	private Node<S> preNode;
	private Node<S> nextNode;

	public int  position;

	private S value;



	public Node(S value) {

		this.value= value;

	}



	public String toString(S value) {

		return this.value.toString();

	}



	public void setNextNode(Node<S> NextNode) {

		this.nextNode= NextNode;

	}



	public void setPrevious(Node<S> PreviousNode) {

		this.preNode=PreviousNode;

	}



	public Node<S> getNextNode(){

		return nextNode;

	}



	public Node<S> getPreviousNode(){

		return preNode;

	}



	public S getValue() {

		return value;

	}

}