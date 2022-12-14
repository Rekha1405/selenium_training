import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class corejavabrushup3 {

	public static void main(String[] args) {
		
		
		// String is an object/String literal
		//String is an object that represent sequence of  character
		
		String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		
		//New memory allocate operator
		
		String s2 = new String ("Welcome");
		String s3 = new String ("Welcome");
		String [] splitedstring = s.split(" ");
		System.out.println(splitedstring[0]);
		System.out.println(splitedstring[1]);
		System.out.println(splitedstring[2]);
		//String [] splitedstring1 =s.split("Shetty");
		System.out.println(splitedstring[0]);
		System.out.println(splitedstring[1].trim());
		
		for(int i=s.length()-1; i>=0; i--)
			
		{
			
			System.out.println(s.charAt(i));
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
