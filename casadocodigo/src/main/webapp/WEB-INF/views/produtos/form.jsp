<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livros sobre Java, Android, iPhone, Ruby, PHP e muito mais - Casa do Código</title>
</head>
<body>
	<div align="center">
		<form:form action="${s:mvcUrl('PC#gravar').build() }" method="post" commandName="produto"
			enctype="multipart/form-data">
			<h2>Cadastramento de Livro</h2>
			<table style="width: %100">
				<tr>
					<td>Titulo:</td>
					<td><form:input path="titulo" size="60" /></td>
					<td><form:errors path="titulo" /></td>
				</tr>
				<tr>
					<td valign="top">Descrição:</td>
					<td><form:textarea path="descricao" rows="10" cols="57" style="resize:none" /></td>
					<td><form:errors path="descricao" /></td>
				</tr>
				<tr>
					<td>Páginas:</td>
					<td><form:input path="paginas" /></td>
					<td><form:errors path="paginas" /></td>
				</tr>
				<tr>
					<td>Data de Lançamento:</td>
					<td><form:input path="dataLancamento" /></td>
					<td><form:errors path="dataLancamento" /></td>
				</tr>
				<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
					<tr>
						<td>Preço ${tipoPreco}:</td>
						<td><form:input path="precos[${status.index}].valor" />
							<form:hidden path="precos[${status.index}].tipo" value="${tipoPreco }" /></td>
						<td></td>
					</tr>
				</c:forEach>
				<tr>
					<td>Sumário:</td>
					<td><input name="sumario" type="file" /></td>
					<td></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><button type="submit">Cadastrar</button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>