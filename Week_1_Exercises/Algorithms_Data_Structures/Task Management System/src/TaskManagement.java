class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

class TaskManagement {
    private Node head;

    public TaskManagement() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteTask(int taskId) {
        Node current = head;
        Node previous = null;
        while (current != null && current.task.taskId != taskId) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            if (previous != null) {
                previous.next = current.next;
            } else {
                head = current.next;
            }
        }
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task.taskName);
            current = current.next;
        }
    }
}
