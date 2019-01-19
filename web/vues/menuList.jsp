<%@include file="../templates/header.jsp"%>
<%@include file="../templates/navigation.jsp"%>

<div class="container contenu">
    <main class="row justify-content-center">
        <div class="col-6">
            <h4>Liste des trucs a faire</h4>
            <table class="table table-striped table-hover table-bordered">
                <thead class="thead-dark">
                <tr>
                    <th>Noms</th>
                    <th>Clubs</th>
                    <th>Sports</th>
                </tr>
                </thead>
                <-- -->
                <tbody>
                <c:forEach items="${menus}" var="menu">
                    <tr>
                        <td>${menu.nom}</td>
                        <td>${menu.club}</td>
                        <td>${menu.sport}</td>
                        <td class="text-center">
                            <a href="supTodo?menu=${menu.nom}&club=${menu.club}&sport=${menu.sport}">
                                <i class="fas fa-trash-alt"></i>
                            </a>
                        </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <a href="add-todo" class="btn btn-info btn-block">
                <i class="fa fa-plus"></i> Nouvelle affiliation
            </a>

        </div><!-- fin col-6 -->
    </main>
</div><!-- fin container -->

<%@include file="../templates/footer.jsp"%>