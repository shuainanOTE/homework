<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        .my-input {
            width: 200px;
            box-sizing: border-box;
        }
    </style>
</head>
<body>
    <h2>多筆資料查詢 作業</h2>
    <form action="search" method="get">
        輸入品名：<input type="text" name="searchName" class="my-input">
        <button type="submit">搜尋</button>
    </form>
    <hr>
    <table border="1">
        <tr>
            <th>編號</th><th>品名</th><th>價格</th><th>庫存</th>
        </tr>
        <c:forEach var="p" items="${productList}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>