package teamprojectnse;

public class CustomerCreator {
	protected int arrive = 0;
	protected int startInterval;
	protected int endInterval;
	protected int startService;
	protected int endService;
	class Customer {
		protected int startTime;
		protected int serviceBegin;
		protected int serviceEnd;
		protected int waitTime;
		protected int serviceTime;
		Customer(int start, int begin){
			startTime = start;
			serviceBegin = begin;
		}
		Customer(int start){
			startTime = start;
		}
		
	}
	public CustomerCreator(int startI,int endI,int startS,int endS){
		startInterval = startI;
		endInterval = endI;
		startService = startS;
		endService = endS;
	}
	public Customer createCust(){
		Customer john = new Customer(arrive);
		arrive = (int) (arrive + (startInterval + ((endInterval-startInterval)*(Math.random()))));
		return john;
	}
	
	
}
