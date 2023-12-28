package biblioteca

class Usuario {
    // Atributos da classe
    String nome
    String email
    String senha
    String perfil

    // Relacionamentos com outras classes
    static hasMany = [livros: Livro] // Um usuário pode emprestar vários livros

    // Restrições de validação
    static constraints = {
        nome blank: false // O nome não pode ser vazio
        email blank: false, unique: true, email: true // O email não pode ser vazio nem repetido, e deve ser um email válido
        senha blank: false, password: true // A senha não pode ser vazia, e deve seguir um padrão de segurança
        perfil inList: ['admin', 'user'] // O perfil deve ser um dos valores definidos na lista
    }
}

