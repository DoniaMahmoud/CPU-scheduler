package os;

public class process {
      int Id;
      int arrivalTime;
      int burstTime;
      
      public process(int id, int arrivalTime, int burstTime) {
		super();
		Id = id;
		this.arrivalTime = arrivalTime;
		this.burstTime = burstTime;
	}

	public process() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}
      
      
      
      
      
}
