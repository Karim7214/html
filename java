<head>  
<style>  
ul {  
  list-style-type: none;  
  margin: 0;  
  padding: 0;  
}  
body {  
background-color: #E6E6FA;  
}  
</style>  
<meta charset=<em>"UTF-8"</em>>  
<title>First Web Application</title>  
</head>  
<body>  
<h1>Welcome</h1>  
<ul>  
  <li><a href="#">Home</a></li>  
  <li><a href="#">News</a></li>  
  <li><a href="#">Contact</a></li>  
  <li><a href="#">About</a></li>  
</ul>  
</body>  
</html>  
<servlet>  
  <servlet-name>MyHttpTestServlet</servlet-name>  
  <servlet-class>TestServlet</servlet-class>  
</servlet>  
<servlet-mapping>  
  <servlet-name>MyHttpTestServlet</servlet-name>  
  <url-pattern>/welcome</url-pattern>  
</servlet-mapping>  
<?xml version="1.0" encoding="UTF-8"?>  
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" id="WebApp_ID" version="3.1">  
  <display-name>BasicWebApplication</display-name>  
  <welcome-file-list>  
    <welcome-file>index.html</welcome-file>  
    <welcome-file>index.htm</welcome-file>  
    <welcome-file>index.jsp</welcome-file>  
    <welcome-file>default.html</welcome-file>  
    <welcome-file>default.htm</welcome-file>  
    <welcome-file>default.jsp</welcome-file>  
  </welcome-file-list>  
  <servlet>  
    <servlet-name>MyHttpTestServlet</servlet-name>  
    <servlet-class>TestServlet</servlet-class>  
  </servlet>  
  <servlet-mapping>  
    <servlet-name>MyHttpTestServlet</servlet-name>  
    <url-pattern>/welcome</url-pattern>  
  </servlet-mapping>  
</web-app>
