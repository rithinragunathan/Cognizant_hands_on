package com.cognizant.rithin.AlgorithmsAndDataStructures.TaskManagement;

public class SinglyLinkedList {
    Node head;
    public static class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
    public void add(Task task) {
        if(head == null) {
            head = new Node(task);
            return;
        }
        else {
            Node node = new Node(task);
            node.next = head;
            head = node;
        }
    }

    public Node search(int targetTaskId) {
        Node temp = head;
        while (temp.next != null) {
            if(temp.task.taskId == targetTaskId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void traverse () {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.task.taskId + " " + temp.task.taskName + " " + temp.task.status);
            temp = temp.next;
        }
    }

    public void delete(int targetTaskId) {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if(temp.task.taskId == targetTaskId) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}
