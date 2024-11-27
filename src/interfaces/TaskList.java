package interfaces;

import java.util.ArrayList;

public class TaskList {
	ArrayList<Task> tasks = new ArrayList<Task>();
	
	public void addTask(String taskDescription, int taskPriority) {
		Task newTask = new Task();
		newTask.setTodo(taskDescription);
		newTask.setPriority(taskPriority);
		tasks.add(newTask);
	}
	
	public String toString() {
		String returnStr = "Priority Task List\n";
		returnStr = returnStr + "------------------";
		for (int i = 0; i < tasks.size(); i++) {
			returnStr = returnStr + "\n";
			returnStr = returnStr + tasks.get(i).toString();
		}
		return returnStr;
	}
}
