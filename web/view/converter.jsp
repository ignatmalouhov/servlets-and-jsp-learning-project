<%--
  Created by IntelliJ IDEA.
  User: Ignat Malouhov
  Date: 08-Jan-22
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>cm-inch Converter</title>
</head>
<body>
<form name="cm2inchConverter" action="convert" method="POST">
    <table>
        <tr>
            <td>Сколько</td>
            <td>
                <select name="unit">
                    <option value="CM">см</option>
                    <option value="INCH">дюймов</option>
                </select>
            <td> вы хотите перевести:</td>
            <td><input type="text" name="amount"/></td>
            <td><input type="submit" value="Submit" name="Конвертировать"/></td>
    </table>
    <h2>${errorMessage}</h2>
    <h2>${result}</h2>
</form>
</body>
</html>
