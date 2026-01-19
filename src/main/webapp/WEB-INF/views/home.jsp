<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://portals.apache.org/pluto" prefix="pluto" %>
<!DOCTYPE html>
<html>
<head>
  <title>Spring Portlet Home</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 2rem;
    }
    .portlet-shell {
      border: 1px solid #d9d9d9;
      padding: 1.5rem;
      border-radius: 8px;
      background: #fafafa;
    }
  </style>
</head>
<body>
<h1>Spring Framework 4.3.x Portlet Home</h1>
<p>
  Supply any deployed JSR-286 portlet name via the <code>portlet</code> query parameter
  to render it below.
</p>
<form method="get" action="/">
  <label for="portlet">Portlet name</label>
  <input id="portlet" name="portlet" value="${portletName}" />
  <button type="submit">Load portlet</button>
</form>

<div class="portlet-shell">
  <h2>Rendered Portlet: ${portletName}</h2>
  <pluto:portlet portletName="${portletName}" />
</div>
</body>
</html>
