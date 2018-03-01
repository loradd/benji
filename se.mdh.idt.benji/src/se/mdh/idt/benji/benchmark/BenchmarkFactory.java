package se.mdh.idt.benji.benchmark;

/**
 * @author Lorenzo Addazi 
 **/
public class BenchmarkFactory {

	// create benchmark instance
	public static BenchmarkBuilder benchmark() {
		return new BenchmarkBuilder();
	}
	
}
