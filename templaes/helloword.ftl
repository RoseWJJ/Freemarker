
	<#--<h1>Welcom ${user}!</h1>
	<p>Our latest product:
	<a href="${latestProduct.url}">${latestProduct.name}</a>!

	
	
	
	
	

	�ҵ��Ա��ǣ�
	<#if sex = 0>
		��
	<#else>
		Ů
	</#if>
	

	
	
	
	<#assign sex = 0 >
	
	<#switch sex>
		<#case 0>
		��
		<#break>
		<#case 1>
		Ů
		<#break>
	</#switch>
		-->




	
	<#--ѭ��-->
	<#list array as temp>
		�±�Ϊ��${temp_index}----ֵΪ��${temp}
	</#list>
