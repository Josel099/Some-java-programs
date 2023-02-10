<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
    <%@page
    import="com.bmc.bmcweb.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="4">

<tr>
<th>Name</th>
<th>Age</th>
<th>Mark</th>
</tr>
<%ArrayList a1=(ArrayList)request.getAttribute("studList");
for(int i=0;i<a1.size();i++){
	Student st=(Student)a1.get(i);

%>
<tr>
<td><%=st.getName() %></td>
<td><%=st.getAge()%></td>
<td><%=st.getMark() %></td>
</tr>
<%} %>
</table>

</body>
</html>