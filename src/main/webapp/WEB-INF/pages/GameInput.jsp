<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<body>

<h2>���� ���� �Է�</h2>

<%
    int playerCount = Integer.parseInt(request.getParameter("playercount"));
%>

    <form name="GameInfo" action="/Game/startladder" method="post">

        <%
            for(int i = 0; i < playerCount; i++) {
                // ���� ���� �Է� inputâ
                // �⺻ ��ٸ� �׸�
                // ��� ���� �Է� inputâ
                %>
        <input type="text" name="username">
        <input type="text" name="resultdata">

        <%
            }
        %>

        <input type="submit" value="start"/>


    </form>


</body>

</html>