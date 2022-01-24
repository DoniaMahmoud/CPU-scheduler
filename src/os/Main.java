package os;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<process>v=new ArrayList<process>();
		ArrayList<Integer>fn;
		ArrayList<Integer>wt;
		ArrayList<Integer>tr;
		process p=new process(1, 0, 7);
		process p2=new process(3, 2, 4);
		process p3=new process(4, 4, 1);
		process p4=new process(2, 5, 4);
		v.add(p4);
		v.add(p3);
		v.add(p2);
		v.add(p);
		sortingAlg alg=new SJFsorting();
		ArrayList<process>x=alg.sort(v);
		SJFmethod sfj=new SJFmethod(x);
		SRTFmethod srtf=new SRTFmethod(x);
		fn=srtf.FinishTime();
	    
		System.out.println("sfj finish time");
		for(int i=0;i<fn.size();++i) {
			System.out.println(fn.get(i));
		}
		tr=srtf.turnRound(fn);
		System.out.println("sfj turnround time");
		for(int i=0;i<tr.size();++i) {
			System.out.println(tr.get(i));
		}
		
		wt=srtf.waitingTime(tr);
		System.out.println("sfj waiting time");
		for(int i=0;i<wt.size();++i) {
			System.out.println(wt.get(i));
		}

	}

}
