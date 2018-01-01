<#--宏的创建-->
<#macro  mymacro p1 p2>
计算结果：${p1+p2}
</#macro>
<#--宏的调用
<@mymacro p1=10 p2=365/>-->



<#--特殊字符的转译-->
${"i like \"freemark\" "}