class CadOng(
    nome: String, endereco: String,
    telefone: String, email: String, private var cnpj: String
) : Cadastro(
    nome, endereco,
    telefone, email
) {

    private var razaoSoc: String = ""
    private var datCriacao: String = ""
    private var metaValor: String = ""

    /*private val listarOng = MutableList<String>()
    private val caixaOng = 0.0
     */
    constructor(
        nome: String, endereco: String, telefone: String, email: String,
        cnpj: String, razaoSoc: String, datCriacao: String, metaValor: String
    ) :
            this(nome, endereco, telefone, email,cnpj) {

        this.razaoSoc = razaoSoc
        this.datCriacao = datCriacao
        this.metaValor = metaValor
    }


    init {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()
            || cnpj.isEmpty()){
            throw Exception(" $nome, houve erro ao realizar seu cadastro, verifique novamente!")
        }else{
            println("$nome, seu cadastro realizado com sucesso!")
        }
    }


}


