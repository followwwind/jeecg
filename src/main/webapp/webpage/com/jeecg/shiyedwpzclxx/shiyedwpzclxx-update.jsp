<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>失业单位成立基本信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="shiyedwpzclxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${shiyedwpzclxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								执照号码:
							</label>
						</td>
						<td class="value">
						    <input id="gsdjzzhm" name="gsdjzzhm" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${shiyedwpzclxxPage.gsdjzzhm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">执照号码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								发照日期:
							</label>
						</td>
						<td class="value">
						    <input id="gsdjfzrq" name="gsdjfzrq" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${shiyedwpzclxxPage.gsdjfzrq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发照日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								批准成立部门:
							</label>
						</td>
						<td class="value">
						    <input id="pzclbm" name="pzclbm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${shiyedwpzclxxPage.pzclbm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">批准成立部门</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
