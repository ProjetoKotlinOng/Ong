open class CadVol(nome: String, endereco: String,
                  telefone: String, email: String, private val cpf: String) : Cadastro(
    nome, endereco, telefone, email
) {
    init {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()
            || cpf.isEmpty()){
            throw Exception("\n$nome, houve erro ao realizar seu cadastro, verifique novamente!")
        }else{
            println("\n$nome, seu cadastro realizado com sucesso!")
        }
    }
    fun doar (valor:Double){
        println("O valor doado por $nome , foi de R$$valor, agradecemos!\n")

    }

}

