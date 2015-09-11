<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<body>

<h2>유저 정보 입력</h2>

<%
    int playerCount = Integer.parseInt(request.getParameter("playercount"));
%>

    <form name="GameInfo" action="/Game/startladder" method="post">

        <%
            for(int i = 0; i < playerCount; i++) {
                // 유저 정보 입력 input창
                // 기본 사다리 그림
                // 결과 정보 입력 input창
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