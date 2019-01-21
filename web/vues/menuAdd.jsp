<%@include file="../templates/header.jsp"%>
<%@include file="../templates/navigation.jsp"%>

<div class="container contenu">
    <main class="row justify-content-center">
        <div class="col-6">
            <h2>Ajout d'une affiliation</h2>
            <form action="add-menu" method="post">
                <div class="form-group">
                    <input class="form-control" placeholder="Nom"
                           type="text" name="nom">
                </div>
                <div class="form-group">
                    <input class="form-control" placeholder="Club"
                           type="text" name="club">
                    <input class="form-control" placeholder="Sport"
                           type="text" name="sport">
                </div>

                <a href="add-menu" class="btn btn-info btn-block">
                    <i class="fa "></i> Affiliation supplementaire
                </a>

                <input type="submit" class="btn btn-primary btn-block" value="Confirmation">
            </form>
        </div><!-- fin col-6 -->
    </main>
</div><!-- fin container -->
<%@include file="../templates/footer.jsp"%>