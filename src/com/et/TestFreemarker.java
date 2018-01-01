package com.et;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class TestFreemarker {
	public static void main(String[] args) throws Exception {
		//创建配置实例
		Configuration cfg = new Configuration();
		//指定模板文件来源
		cfg.setDirectoryForTemplateLoading(new File("templaes"));
	
		//指定模板如何检索数据模型，选择默认…
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		//创建数据模型
		Map root = new HashMap();
		root.put("user", "Big Joe");
		root.put("sex", 1);
		Map latest = new HashMap();
		String [] str = new  String[]{"1","2","3","4","5","6"};
		root.put("array", str);
		List list = new ArrayList();
		User  u1 = new User();
		u1.setId("1");
		u1.setName("zs");
		User  u2 = new User();
		u2.setId("2");
		u2.setName("ls");
		list.add(u1);
		list.add(u2);
		root.put("list", list);
		
		
		
		root.put("latestProduct", latest);
		latest.put("url", "products/greenmouse.html");
		latest.put("name", "green mouse");
		
		//输出到目标(生成HTML)
		
		//FileOutputStream foStream  = new FileOutputStream("c:\\html\\hellow.html");
	
		//指定具体获取那个模板对象
		Template temp = cfg.getTemplate("helloword.ftl");
				
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
		
		
		
		
	}
	
}
