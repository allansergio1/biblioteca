package biblioteca

class Categoria {
    // Atributos da classe
    String nome
    String descricao

    // Relacionamentos com outras classes
    static hasMany = [livros: Livro] // Uma categoria pode ter vários livros

    // Restrições de validação
    static constraints = {
        nome blank: false, unique: true // O nome não pode ser vazio nem repetido
        descricao nullable: true, maxSize: 500 // A descrição pode ser nula, mas não pode ter mais de 500 caracteres
    }
}

