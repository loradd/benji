package se.mdh.idt.benji.statecoding;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;

/**
 * @author Lorenzo Addazi 
 **/
public class BenchmarkStateCoderFactory implements IStateCoderFactory {
	
	@Override
	public IStateCoder createStateCoder() {
		return new BenchmarkStateCoder();
	}

}