package com.learnjava.freemarker;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

public class FreeMarkerConfig {

	public static Configuration getConfiguration(){
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
		cfg.setClassForTemplateLoading(FreeMarkerConfig.class, "/templates");
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		cfg.setLogTemplateExceptions(false);
		cfg.setWrapUncheckedExceptions(true);
		return cfg;
	}
}
