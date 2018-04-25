
package teamprojectnse;

import java.util.Arrays;

import teamprojectnse.DLinkedList.Node;
	
	
	
public class TheQueue<T extends Comparable<T>> {
    protected DLinkedList<T> list = new DLinkedList<T>();
	//protected CarWash[] queueArray;
	//protected int queSize;
	//protected int front, back=0;
	protected int numItems = 0;
	
	public TheQueue(int size){
		/**
		queSize = size;
		queueArray = new CarWash[size];
		Arrays.fill(queueArray,null);
		*/
		//This constructor will never be used
		//keep as reference for an array[] based que
	}
	
	public TheQueue(){
		
	}
	
	public void insert(T input){
		list.add(input);
		numItems++;
	}
	public T removeLast(){
		T answer = null;
		if (numItems>0){
			answer = list.remove(numItems-1);
			numItems--;
			
		} else {
			System.out.println("Sorry but the queue is empty.");
		}
		return answer;
	}
	public T remove(){
		T answer = null;
		if (numItems>0){
			answer = list.remove(0);
			numItems--;
		} else {
			System.out.println("Sorry but the queue is empty.");
		}
		return answer;
	}
	
	public T peek(){
		T answer = null;
		if (numItems>0){
			answer = list.getFirst().getValue();
		} else {
			System.out.println("Sorry but the queue is empty.");
		}
		return answer;
	}
	
	public void printQueue(){
		if (list.isEmpty()){
			System.out.println("Sorry but the queue is empty.");
		} else {
			DLinkedList<T>.Node node = list.getFirst();
			while (node!=null){
				System.out.println(node.getValue().toString());
				node = node.next;
			}
		}
	}
	
	public int queueSize(){
		return numItems;
	}
	
}
