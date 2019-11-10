<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
 <head></head>
 <style type="text/css">
.error {
	color: red;
}
</style>
 <body>
  <form:form method="POST" action="${pageContext.request.contextPath}/customer" modelAttribute="customer">
  <spring:message code="name.person"/>
   <form:input path="name"/>
    <form:errors path="name" cssClass="error" />
   <br>
   <input type="submit" value="Submit"/>
  </form:form>
 </body>
</html>