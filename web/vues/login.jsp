<%--
  Created by IntelliJ IDEA.
  User: Diy-Em
  Date: 2019-01-12
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../templates/header.jsp"%>
<%@include file="../templates/navigation.jsp"%>

<div class="container contenu">
    <div class="row justify-content-center">
        <div class="col-4">
            <h3 class="p-3 bg-primary text-white text-center">JDKS Club</h3>
            <form action="login" method="post">
                <p class="bg-danger text-white">${errorMessage}</p>
                <div class="form-group">
                    <input class="form-control" type="text" name="nom"
                           placeholder="Nom">
                </div>
                <div class="form-group">
                    <input class="form-control" type="password" name="pass"
                           placeholder="Mot de passe">
                </div>
                <input class="btn btn-primary btn-block" type="submit" value="login">
            </form>
        </div>
    </div>

</div>
<%@include file="../templates/footer.jsp"%>