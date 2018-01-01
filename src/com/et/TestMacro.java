package com.et;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class TestMacro {
	public static void main(String[] args) throws Exception {
		//创建配置实例
		Configuration cfg = new Configuration();
		//指定模板文件来源
		cfg.setDirectoryForTemplateLoading(new File("templaes"));
	
		//指定模板如何检索数据模型，选择默认…
		cfg.setObjectWrapper(new DefaultObjectWrapper());
	
		Map root = new HashMap(); 
		
		//指定具体获取那个模板对象
		Template temp = cfg.getTemplate("functions.ftl");		
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 	
	}
	
}
