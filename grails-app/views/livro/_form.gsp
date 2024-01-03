<div>
    <label for="titulo">Título *</label>
    <g:textField name="titulo" required="true" />

    </br>

    <label for="isbn">Isbn *</label>
    <g:textField name="isbn" required="true" />

    </br>

    <label for="ano">Ano *</label>
    <g:textField name="ano" required="true" />

    </br>

    <label for="paginas">Páginas *</label>
    <g:textField name="paginas" required="true" />

    </br>

    <label for="preco">Preço</label>
    <g:textField name="preco" />

    </br>

    <label for="autor">Autores</label>
    <g:select name="autor" from="${biblioteca.Autor.list()}" optionKey="id" optionValue="nome" />

    </br>

    <label for="categoria">Categorias</label>
    <g:select name="categoria" from="${biblioteca.Categoria.list()}" optionKey="id" optionValue="nome" />
</div>