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
		//��������ʵ��
		Configuration cfg = new Configuration();
		//ָ��ģ���ļ���Դ
		cfg.setDirectoryForTemplateLoading(new File("templaes"));
	
		//ָ��ģ����μ�������ģ�ͣ�ѡ��Ĭ�ϡ�
		cfg.setObjectWrapper(new DefaultObjectWrapper());
	
		Map root = new HashMap(); 
		
		//ָ�������ȡ�Ǹ�ģ�����
		Template temp = cfg.getTemplate("functions.ftl");		
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 	
	}
	
}
