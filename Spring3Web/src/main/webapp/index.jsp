<%@ page import="javax.servlet.*" %>
<html>
<body>

<%
 	String str = session.getId();
 	out.println(str);
 %>

<h2>Hello World!</h2>
</body>
</html>
