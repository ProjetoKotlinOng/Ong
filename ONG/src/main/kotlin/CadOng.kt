class CadOng(
    nome: String, endereco: String,
    telefone: String, email: String, private var cnpj: String
) : Cadastro(
    nome, endereco,
    telefone, email
) {

    private var razaoSoc: String = ""
    private var datCriacao: String = ""
    private var valorAtual: Double = 0.0

    /*private val listarOng = MutableList<String>()
    private val caixaOng = 0.0
     */
    constructor(
        nome: String, endereco: String, telefone: String, email: String,
        cnpj: String, razaoSoc: String, datCriacao: String, valorAtual: Double
    ) :
            this(nome, endereco, telefone, email,cnpj) {

        this.razaoSoc = razaoSoc
        this.datCriacao = datCriacao
        this.valorAtual = valorAtual
    }

    init {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()
            || cnpj.isEmpty()){
            throw Exception("\n$nome, houve erro ao realizar seu cadastro, verifique novamente!")
        }else{
            println("\n$nome, seu cadastro realizado com sucesso!")
        }
    }

    fun arrecadar (valorR:Double){
        valorAtual += valorR
        println( "Valor arrecado até o momento é $valorAtual")

    }
}




