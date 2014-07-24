<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
 <title>Sign in</title>
</head>
<body>
  <form:form id="login" action="register.html" method="post" modelAttribute="subcriber">
       <table>
         <tr>
           <td colspan="3"><h3><spring:message code="signin" /></h3></td>
         </tr>
          <tr>
          <td><label>UserName</label></td>
          <td><form:input path="userName"></form:input></td>
          <td><font color="red"><form:errors path="userName"></form:errors></font></td>
          </tr>
          <tr>
            <td><label>Password</label></td>
            <td><form:input path="password"></form:input></td></td>
            <td><font color="red"><form:errors path="password"></form:errors></font></td>
          </tr>
          <tr>
            <td colspan="2" align="center"><input type="submit" value="Login"></td>
            <td></td>
          </tr>
       </table>
       </form:form>
</body>
</html>