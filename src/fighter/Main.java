package fighter;

public class Main {

	public static void main(String[] args) {
		
		fighter f1 = new fighter( "Samet" , 10,120,100,30 );
		fighter f2 = new fighter ("kokim" , 20,85,85,40) ;
	
	
		match match = new match (f1,f2,85,100);
		match.run();
	}

}
