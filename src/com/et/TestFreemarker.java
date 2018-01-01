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
		//��������ʵ��
		Configuration cfg = new Configuration();
		//ָ��ģ���ļ���Դ
		cfg.setDirectoryForTemplateLoading(new File("templaes"));
	
		//ָ��ģ����μ�������ģ�ͣ�ѡ��Ĭ�ϡ�
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		//��������ģ��
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
		
		//�����Ŀ��(����HTML)
		
		//FileOutputStream foStream  = new FileOutputStream("c:\\html\\hellow.html");
	
		//ָ�������ȡ�Ǹ�ģ�����
		Template temp = cfg.getTemplate("helloword.ftl");
				
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
		
		
		
		
	}
	
}
