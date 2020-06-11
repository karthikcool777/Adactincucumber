package runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String json) {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Cucumberday1\\Reports\\JvmReport");
		
	Configuration con = new Configuration(f,"Adactin");
	con.addClassifications("platform","windows");	
	con.addClassifications("browser","chrome");
	con.addClassifications("site","adactin");
	con.addClassifications("report","jsson");
	
	List<String> jfiles = new ArrayList<String>();
	jfiles.add(json);
	
	ReportBuilder r = new ReportBuilder(jfiles, con);
	r.generateReports();
	
	
		
	}

}
