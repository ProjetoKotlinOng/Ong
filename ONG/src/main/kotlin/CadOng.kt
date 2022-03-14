import kotlin.system.exitProcess

class CadOng(
    nome: String, endereco: String,
    telefone: String, email: String, private val cnpj: String,private var metaOng: Double
):
    Cadastro(nome, endereco, telefone, email) {

    private var razaoSoc: String = ""
    private var datCriacao: String = ""
    var valorAtual: Double = 0.0

    constructor(
        nome: String, endereco: String, telefone: String, email: String,
        cnpj: String, razaoSoc: String, datCriacao: String,metaOng: Double
    ) :
            this(nome, endereco, telefone, email, cnpj,metaOng) {

        this.razaoSoc = razaoSoc
        this.datCriacao = datCriacao

    }

    init {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()
            || cnpj.isEmpty()
        ) {
            throw Exception("\n$nome, houve erro ao realizar seu cadastro, verifique novamente!")
        } else {
            println("\n$nome, seu cadastro realizado com sucesso!")
        }
    }

    fun arrecadar(valorR: Double) {
        valorAtual += valorR
        println("$nome: Valor arrecado até o momento é $valorAtual")

    }


    fun metRec(valorR:Double):Int {

        var ret: Int
        do {
            println("Agora qual metodo de recebimento que deseja realizar para finalizar transação?")
            println("Considerando:")
            println("Digite 1 - para pix ")
            println("Digite 2 - para Doc ")
            println("Digite 3 - para sair do programa")
            ret = readLine()!!.toInt()

            if (!(ret == 1 || ret == 2|| ret == 3)) {
                println("Opção inválida\n")
            }
        }while (!(ret == 1 || ret == 2 || ret == 3))
        when (ret) {
            1 -> {
                println("O método recebimento escolhido por $nome,foi pix")
                if (valorAtual <=0.0){
                    println ("$nome: Saldo insuficiente para realizar Pix")
                }else if (valorR > valorAtual){
                    println ("$nome: Quantia solicitada maior que o saldo disponibilizado")
                }else{
                    valorAtual -= valorR
                    println ("$nome: Pix de R$$valorR realizado com sucesso")
                }

            }
            2 -> {
                println("O método escolhido por $nome,foi doc")

                if (valorAtual <=0.0){
                    println ("$nome: Saldo insuficiente para realizar transferencia")
                }else if (valorR <= 0.0){
                    println ("$nome : Transferencia impossivel de ser realizado")
                }else if (valorR > valorAtual){
                    println ("$nome : Quantia solicitada maior que o saldo disponibilizado")
                }else{
                    valorAtual -= valorR
                    println ("$nome: Transferencia de R$$valorR realizado com sucesso")
                }
            }
            3 -> {
                println("$nome, fim do programa!")
                exitProcess(0)
            }
            else -> {
            }
        }
        return ret
    }
}