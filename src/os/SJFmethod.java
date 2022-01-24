package os;

import java.util.ArrayList;

public class SJFmethod implements shortestFirst,shortestFinishTime{
      
	
	private ArrayList<process>processes;
    
	public SJFmethod(ArrayList<process> processes) {
		super();
		this.processes = processes;
	}


	public ArrayList<Integer> FinishTime() {
			ArrayList<Integer> finishtime=new ArrayList<Integer>();
		    process currp=new process();
		    int n;
		    currp=this.processes.get(0);

		    finishtime.add(currp.getBurstTime());
	    for(int i=1;i<this.processes.size();++i) {
	    	currp=this.processes.get(i);
	    	n=finishtime.get(i-1);
	    	finishtime.add(currp.getBurstTime()+n);
	    }
		return finishtime;
	}


	public ArrayList<Integer> turnRound(ArrayList<Integer> finish) {
		ArrayList<Integer>turnround=new ArrayList<Integer>();
		for(int i=0;i<this.processes.size();++i) {
			turnround.add(finish.get(i)-this.processes.get(i).getArrivalTime());
		}
		return turnround;
	}

	public ArrayList<Integer> waitingTime(ArrayList<Integer> turn) {
		ArrayList<Integer>waiting=new ArrayList<Integer>();
		for(int i=0;i<this.processes.size();++i) {
			waiting.add(turn.get(i)-this.processes.get(i).getBurstTime());
		}
	     
		return waiting; 
	}

	
	


	
	public ArrayList<Integer> AvarageTime() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
