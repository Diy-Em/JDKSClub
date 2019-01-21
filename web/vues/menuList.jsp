<%@include file="../templates/header.jsp"%>
<%@include file="../templates/navigation.jsp"%>

<div class="container contenu">
    <main class="row justify-content-center">
        <div class="col-6">
            <h4>Liste des membres</h4>
            <table class="table table-striped table-hover table-bordered">
                <thead class="thead-dark">
                <tr>
                    <th>Nom</th>
                    <th>Club</th>
                    <th>Sport</th>
                    <th> </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${menus}" var="menu">
                    <tr>
                        <td>${menu.nom}</td>
                        <td>${menu.club}</td>
                        <td>${menu.sport}</td>
                        <td class="text-center">
                            <a href="supMenu?nom=${menu.nom}&club=${menu.club}&sport=${menu.sport}">
                                <i class="fas fa-trash-alt"></i>
                            </a>
                        </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <a href="add-menu" class="btn btn-info btn-block">
                <i class="fa "></i> Nouvelle affiliation
            </a>

        </div><!-- fin col-6 -->
    </main>
</div><!-- fin container -->

<%@include file="../templates/footer.jsp"%>