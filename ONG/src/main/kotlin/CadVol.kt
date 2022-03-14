import kotlin.system.exitProcess

open class CadVol(nome: String, endereco: String,
                  telefone: String, email: String, private val cpf: String
) : Cadastro(
    nome, endereco, telefone, email,){

    private var saldo:Double = 0.0

    constructor(
        nome: String, endereco: String, telefone: String, email: String,
        cnpj: String, saldo: Double) :
            this(nome, endereco, telefone, email, cnpj) {

        this.saldo = saldo}

    init {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()
            || cpf.isEmpty()){
            throw Exception("\n$nome, houve erro ao realizar seu cadastro, verifique novamente!")
        }else{
            println("\n$nome, seu cadastro realizado com sucesso!")
        }
    }

    fun doar(valor: Double): Double {
        if (valor <= 0.0) {
            println("$nome, valor R$$valor não pode ser realizado!\n")
            altdoar()
        } else {
            saldo += valor

            println("$nome, o valor informado foi de R$$valor\n")
        }
        return valor
    }

    private fun altdoar():Int {
        var alt: Int
        do{
            println("Por favor digite, um valor valido. Considerando:")
            println( "Digite 1 - para alterar o valor da doação ")
            println( "Digite 2 - para sair do programa ")
            alt = readLine()!!.toInt()

            if (!(alt == 1 || alt == 2 )) {
                println("Opção inválida\n") }
        }while (!(alt == 1 || alt == 2 ))

        when (alt) {

            1 -> {
                println("Agora digite um valor valido:")
                val doar = readLine()!!.toDouble()
                saldo += doar
                println("O valor informado por $nome, foi de R$$doar\n")
            }
            2 -> {
                println("$nome, Cadastro realizado com suceso, fim do programa!")
                exitProcess(0)
            }
            else -> {
            }
        }
        return alt
    }

    fun metPag():Int {
        var ret:Int
        do {
            println("Agora qual metodo de pagamento que deseja realizar para finalizar sua doação?")
            println("Considerando:")
            println("Digite 1 - para pix ")
            println("Digite 2 - para deposito ")
            println("Digite 3 - para sair do programa")
            ret = readLine()!!.toInt()

            if (!(ret == 1 || ret == 2|| ret == 3)) {
                println("Opção inválida\n")
            }
        }while (!(ret == 1 || ret == 2 || ret == 3))
        when (ret) {
            1 -> {
                println("O método pagamento escolhido por $nome,foi pix")
                val valor = 0.0
                saldo += valor
                println("$nome, o pix  no valor de R$$saldo, " +
                        "feito com sucesso, agradecemos sua doação!\n")
            }
            2 -> {
                println("O método escolhido por $nome,foi deposito")
                println("$nome, o deposito  no valor de R$$saldo, " +
                        "feito com sucesso, agradecemosagradecemos sua doação!\n")
            }
            3 -> {
                println("$nome, fim do programa!")
                exitProcess(0)
            }
            else -> {
            } }
        return ret
    }
}











