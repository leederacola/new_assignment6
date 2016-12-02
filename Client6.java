import java.util.*;
/**
	Assiginment 6, reimplimatation of Travleing sales person with Stack. Dijkstra's Algorithm
	using java stack not our own.

 */
import java.util.*;

public class Client6
{
 	public static void main (String[] args)
	{
            		
			ass_6 tsp = new ass_6(Integer.parseInt(args[0])); //takes first element of args srring   ....get n for CITIS in constucrotr
			System.out.println("N = " + tsp.CITI +"     ..................START............");
            // file and populate matrix
			tsp.populateMatrix(args[1]) ;	//pass file name for constructroer
            
            //new assiginment 6 here!
			long start = System.nanoTime();
			
			//System.out.println(start);
            tsp.tspStack();
			float end = (float)(System.nanoTime() - start)/ 1000000000;
			System.out.println("seconds " + end);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("..................END............");
			
			
			
			
			
			
	}
}   
