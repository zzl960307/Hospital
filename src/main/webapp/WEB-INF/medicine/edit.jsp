<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
 	<meta http-equiv="Content-Type" content="multipart/form-data;charset=utf-8" />
    <title>修改药品---2015</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/common.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/ckeditor/ckeditor.js"></script>


</head>
<body>
<form action="${pageContext.request.contextPath}/drug/update" class="definewidth m20" method="post" enctype="multipart/form-data">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">药品编号</td>
        <td><input type="hidden" name="drug_num" value="${drug.drug_num}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">图片</td>
        <td><input type="file" name="img"></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">药品进价</td>
        <td><input type="text" name="purchas_price" value="${drug.purchas_price}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">药品售价</td>
        <td><input type="text" name="sale_price" value="${drug.sale_price}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">药品名称</td>
        <td><input type="text" name="drug_name" value="${drug.drug_name}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">药品类型</td>
        <td><input type="text" name="drug_type" value="${drug.drug_type}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">简单描述</td>
        <td><input type="text" name="simple_detail" value="${drug.simple_detail}" />
    </tr>
    <tr>
        <td width="10%" class="tableleft">生产日期</td>
        <td><input type="text" name="prodeced_date" value="${drug.prodeced_date}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">过期日期</td>
        <td><input type="text" name="expiration_date" value="${drug.expiration_date}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">保质期</td>
        <td><input type="text" name="quality_date" value="${drug.quality_date}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">详细描述</td>
        <td><input type="text" name="detail" value="${drug.detail}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">生产厂商</td>
        <td><input type="text" name="manufacture" value="${drug.manufacture}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">使用说明</td>
        <td><input type="text" name="use_infor" value="${drug.use_infor}"/></td>
    </tr>
	<tr>
        <td width="10%" class="tableleft">总的进货量</td>
        <td><input type="text" name="total_stock" value="${drug.total_stock}"/></td>
	</tr>
	<tr>
        <td width="10%" class="tableleft">剩余量</td>
        <td><input type="text" name="surplus" value="${drug.surplus}"/></td>
	</tr>
	<tr>
        <td width="10%" class="tableleft">状态</td>
        <td><input type="text" name="status" value="${drug.status}"/></td>
	</tr>
	<tr>
        <td width="10%" class="tableleft">备注</td>
        <td><input type="text" name="noted" value="${drug.noted}"/></td>
	</tr>
	
    <tr>
        <td colspan="2">
			<center>
				<button type="submit" class="btn btn-success" >保存</button>
			</center>
		</td>
    </tr>
</table>
</form>
                                                                                            
</body>
</html>