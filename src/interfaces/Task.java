package interfaces;

public class Task {
	private int priority = 1;
	private String todo = "";
	
	public void setPriority(int newPriority) {
		if (newPriority <= 5 && newPriority >= 1) {
			priority = newPriority;
		}
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setTodo(String newTodo) {
		if (newTodo.length() <= 16) {
			todo = newTodo;
		}
	}
	
	public String getTodo() {
		return todo;
	}
	
	public String toString() {
		String returnStr = todo;
		for (int i = 18; i > todo.length(); i -= 1) {
			returnStr = returnStr + " ";
		}
		returnStr = returnStr + Integer.toString(priority);
		return returnStr;
	}
}
