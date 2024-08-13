package com.learnjava.freemarker;


import com.learnjava.freemarker.model.User;
import freemarker.template.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class FreeMarkerExample {

	public static void main (String[] args) {
		Configuration cfg = FreeMarkerConfig.getConfiguration();

		try {
			Template template = cfg.getTemplate("Welcome.ftl");
			Map<Object, Object> data = new HashMap<>();
			data.put("user", new User("Sachin Hande", 30, "Mumbai"));
			data.put("latestProduct", new Product("FreeMarker guide", "https://example.com/freemarker-guide"));
			generateHtmlFile(template, data);
		}catch (IOException | TemplateException e ) {
			System.out.println("Error occurred while generating the template " +e.getMessage());
		}
	}

	private static void generateHtmlFile (Template template, Map<Object, Object> data) throws IOException, TemplateException {
		File htmlDir = new File("src/main/resources/html");
		if( ! htmlDir.exists() ) {
			htmlDir.mkdirs();
		}
		File htmlFile  = new File(htmlDir,template.getName().replace("ftl", "html"));
		try (FileWriter writer = new FileWriter(htmlFile)){
			template.process(data, writer);
		}catch (Exception e){
			System.out.println("Error Occurred while making the HTML file "+ e.getMessage());
		}
	}

}
