package helper_ddl;

import java.io.File;
import java.io.IOException;

public class GenerateDdlApp {
    
    public static void main(String[] args) throws IOException {

//	HibernateExporter exporter = new HibernateExporter("org.hibernate.dialect.HSQLDialect", "com.geowarin.model");
	HibernateExporter exporter = new HibernateExporter("org.hibernate.dialect.MySQLDialect", "edu.hm.socialmediacrawler.datenbankzugriff.models");
	//exporter.setGenerateDropQueries(true);
	exporter.exportToConsole();
	//exporter.export(new File("schema.sql"));
}

}
