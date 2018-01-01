
	<#--<h1>Welcom ${user}!</h1>
	<p>Our latest product:
	<a href="${latestProduct.url}">${latestProduct.name}</a>!

	
	
	
	
	

	我的性别是：
	<#if sex = 0>
		男
	<#else>
		女
	</#if>
	

	
	
	
	<#assign sex = 0 >
	
	<#switch sex>
		<#case 0>
		男
		<#break>
		<#case 1>
		女
		<#break>
	</#switch>
		-->




	
	<#--循环-->
	<#list array as temp>
		下标为：${temp_index}----值为：${temp}
	</#list>
