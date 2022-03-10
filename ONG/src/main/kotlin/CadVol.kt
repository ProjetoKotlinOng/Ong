class CadVol(nome: String, endereco: String,
    telefone: String, email: String, private val cpf: String) : Cadastro(
    nome, endereco, telefone, email
) {
    init {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()
            || cpf.isEmpty()){
            throw Exception(" $nome, houve erro ao realizar seu cadastro, verifique novamente!")
        }else{
            println("$nome, seu cadastro realizado com sucesso!")
        }
    }


}

