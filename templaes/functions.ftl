<#--Freemarker ����
<#assign str='hello my name is Big Joe'>
${str?length}
${str?upper_case}



<#--�жϱ����Ƿ����-->
<#assign xx = 666>
<#if xx?exists>
${xx}
</#if>
