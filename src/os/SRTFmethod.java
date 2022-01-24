package os;

import java.util.ArrayList;

public class SRTFmethod implements shortestFirst,shortestFinishTime{

	private ArrayList<process>processes;

	public SRTFmethod(ArrayList<process> processes) {
		super();
		this.processes = processes;
	}


	public ArrayList<Integer> FinishTime() {

		int n=processes.size();	
		int rt[] = new int[n]; 
		int complete=0,t=0,minm=Integer.MAX_VALUE,shortest=0,finish_time;
		boolean check=false;
		int []finishesTimeProcess=new int [n];
		ArrayList<Integer>finishtimes=new ArrayList<Integer>();
		for(int i=0;i<n;++i) {
			rt[i] = processes.get(i).getBurstTime(); 
		}
		while (complete != n) { 


			for (int j = 0; j < n; j++)  
			{ 
				if ((processes.get(j).getArrivalTime()<= t) && 
						(rt[j] < minm) && rt[j] > 0) { 
					minm = rt[j]; 
					shortest = j; 
					check = true; 
				} 
			} 

			if (check == false) { 
				t++; 
				continue; 
			} 
			rt[shortest]--; 
			minm = rt[shortest]; 
			if (minm == 0) 
				minm = Integer.MAX_VALUE; 

			if (rt[shortest] == 0) { 

				complete++; 
				check = false;
				finish_time = t + 1;
				finishesTimeProcess[shortest]=finish_time;
				


			}
			t++;
		}
		for(int i=0;i<n;++i) {
			finishtimes.add(finishesTimeProcess[i]);
			
		}
		return finishtimes;
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
