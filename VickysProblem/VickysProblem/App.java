import model.Frog;
import model.Jump;
import java.util.Scanner;
public class App{
	public static final String FROG_NAME = "Vicky";
	public static void main(String args[]){

		Scanner scn = new Scanner(System.in);
		System.out.println("\n\n~~~~~~~~~~~~~Frog Application~~~~~~~~~");
		System.out.print("\n Enter Distance : ");
		int distance = scn.nextInt();
		
		Frog frog = new Frog(FROG_NAME);
		loadData(frog);

		int total_time = 0;
		int jumpNo = 1;
		Jump jump = frog.getJump(jumpNo);
		while(distance > 0){
			if(jump!=null){
				distance = distance - jump.getDistance(); 	
				total_time += jump.getTime();
				jumpNo++;
			}else{
				jumpNo = 1;
			}
			jump = frog.getJump(jumpNo);	
		}
		System.out.println(" It will take "+ total_time+"s to reach the target.");		
	}

	public static void loadData(Frog frog){
		frog.addJump(5,1);
		frog.addJump(3,2);
		frog.addJump(1,3);
	} 
}