package biblioteca

class Autor {
    // Atributos da classe
    String nome
    String nacionalidade
    Date dataNascimento

    // Relacionamentos com outras classes
    static hasMany = [livros: Livro] // Um autor pode ter vários livros

    // Restrições de validação
    static constraints = {
        nome blank: false, unique: true // O nome não pode ser vazio nem repetido
        nacionalidade inList: ['Brasil', 'Portugal', 'Angola', 'Moçambique', 'Cabo Verde', 'Guiné-Bissau', 'São Tomé e Príncipe', 'Timor-Leste'] // A nacionalidade deve ser um dos países de língua portuguesa
        dataNascimento nullable: true, max: new Date() // A data de nascimento pode ser nula, mas não pode ser maior que a data atual
    }
}

