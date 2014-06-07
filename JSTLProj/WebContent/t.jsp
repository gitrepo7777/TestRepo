<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>System.out.println</title></head>
<body>

	<c:forEach  var="counter1" begin="1" end="10" >
		
		<c:out value="${counter1} }"></c:out></br>
		
		
	   <% System.out.println( "counter= " + pageContext.findAttribute("counter1") ); %>
	
		
	</c:forEach>
	




</body>
</html>