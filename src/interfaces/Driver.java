package interfaces;

public class Driver {
	public static void main(String[] args) {
		TaskList list = new TaskList();
		list.addTask("Walk the dog", 2);
		list.addTask("Eat lunch", 3);
		list.addTask("Assassination", 5);
		list.addTask("Watch TV", 1);
		list.addTask("Throw out trash", 4);
		
		System.out.println(list);
	}
}
