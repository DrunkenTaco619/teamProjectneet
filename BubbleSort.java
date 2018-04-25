package teamprojectnse;


public class BubbleSort <T extends Comparable<T>>{
	public BubbleSort(){
		//no arg constructor
	}
	
	public void bubbleSort(DLinkedList<T> list){
		int last = list.size()-1;
		boolean sorted = false;
		for (int i=0;i<last;i++){
			sorted = false;
			if (list.get(i).compareTo(list.get(i+1))<0){
				sorted = true;
			}
		}
		while (last>0&&!sorted){
			for (int index=0;index<last;index++){
				if (list.get(index).compareTo(list.get(index+1))>0){
					list.add(index, list.get(index+1));
					list.remove(index+2);
				}
			}
			last--;
		}
	}
}
