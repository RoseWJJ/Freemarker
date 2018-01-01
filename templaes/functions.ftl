<#--Freemarker 函数
<#assign str='hello my name is Big Joe'>
${str?length}
${str?upper_case}



<#--判断变量是否存在-->
<#assign xx = 666>
<#if xx?exists>
${xx}
</#if>
