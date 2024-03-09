<%@ page import="web.headers.Model.HeadersBean" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %><%--
  Created by IntelliJ IDEA.
  User: raffa
  Date: 09/03/2024
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Headers</title>
</head>
<body>
<h1>Headers:</h1>
<%
    // 1. Leggi il bean headersBean dalla request
    HeadersBean headersBean = (HeadersBean) request.getAttribute("headers");

    // 2. Ottieni i nomi e i valori dalle due liste
    List<String> headerNames = headersBean.getHeaderNames();
    List<String> headerValues = headersBean.getHeaderValues();

    // 3. Usa un for per stampare le coppie nome valore
    for (int i = 0; i < headerNames.size(); i++) {
%>
<b style="font-size: 20px"><%= headerNames.get(i) %></b> = <%= headerValues.get(i) %> <br>
<%
    }
%>
<br>
<b style="font-size: 20px">protocol</b> = <%= request.getProtocol()%>
%>
</body>
</html>
