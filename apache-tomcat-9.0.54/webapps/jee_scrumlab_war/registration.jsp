<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--include head oraz górnego menu. Zawiera owarcie tagu <body>--%>
<%@include file="fragments/header.jsp"%>

<section class="dashboard-section">
    <div class="container pt-4 pb-4">
        <div class="border-dashed view-height">
            <div class="container w-25">

                <form class="padding-small text-center" action="/register" method="post">
                    <h1 class="text-color-darker">Rejestracja</h1>
                    <div class="form-group">
                        <input type="text" class="form-control" id="firstName" name="firstName" placeholder="podaj imię">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="lastName" name="lastName" placeholder="podaj nazwisko">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="email" name="email" placeholder="podaj email">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="password" name="password" placeholder="podaj hasło">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="repassword" name="repassword" placeholder="powtórz hasło">
                    </div>
                    <button class="btn btn-color rounded-0" type="submit">Zarejestruj</button>
                </form>

<%--                wiadomość jeśli hasła były nie takie same--%>
                <c:if test="${not empty alertMsg}">
                <script type="text/javascript">
                    var msg = "${alertMsg}";
                    alert(msg);
                </script>
                </c:if>

            </div>
        </div>
    </div>
</section>

<%--include footera i skryptów--%>
<jsp:include page="fragments/footer.jsp"/>

</body>
</html>