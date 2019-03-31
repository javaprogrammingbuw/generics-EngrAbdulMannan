public class MainClass {	


	public static void main(String[] args) {

		Node<String> N = new Node<>(new String("J"));

		DCList<String> D=new DCList<>();

		D.add(N);

		D.add(new Node<>(new String("A")));

		D.add(new Node<>(new String("V")));

		D.add(new Node<>(new String("A")));

		System.out.println("Size of list" + ":" + D.size());

		System.out.println("First value of list" + ":" +D.getFirst().getValue());

		D.getClass();

		D.display();

		System.out.println("Last value of list"+":"+D.getLast().getValue());
		System.out.println("Now removing Last value of list");
		D.removeLast();

		D.display();
		System.out.println("Now removing First value of list");
		D.removeFirst();

		D.display();
		System.out.println("Now removing again First value of new list");
		D.removeFirst();

		D.display();


	}

}