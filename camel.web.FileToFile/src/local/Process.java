package local;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.omg.CORBA.Environment;

public class Process implements Processor{

	public void process(Exchange arg0) throws Exception {
		
		String data = arg0.getIn().getBody(String.class);
		String nData = data.trim();
		System.out.println("BODY:[" + nData + "]");
		
		//OK
		//arg0.getIn().setBody("(cn=*)");
		
		arg0.getIn().setBody(nData);
	}

}
