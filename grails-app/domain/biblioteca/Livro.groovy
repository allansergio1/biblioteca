package biblioteca

class Livro {
    // Atributos da classe
    String titulo
    String isbn
    Integer ano
    Integer paginas
    BigDecimal preco

    // Relacionamentos com outras classes
    static belongsTo = Autor // Um livro pertence a um autor
    static hasMany = [autores: Autor, categorias: Categoria] // Um livro pode ter vários autores e categorias

    // Restrições de validação
    static constraints = {
        titulo blank: false, unique: true // O título não pode ser vazio nem repetido
        isbn blank: false, unique: true, matches: /\d{3}-\d{10}/ // O ISBN não pode ser vazio nem repetido, e deve seguir o padrão 999-9999999999
        ano min: 1900, max: 2023 // O ano deve estar entre 1900 e 2023
        paginas min: 1 // O número de páginas deve ser maior que zero
        preco min: 0.0 // O preço deve ser maior ou igual a zero
    }
}
