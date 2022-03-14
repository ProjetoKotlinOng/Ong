fun main(){

    var doacao= 0.0

    do {
        when(menu()){

            1 -> {
                try {
                    print("Digite o seu nome: ")
                    val nomeD = readLine()!!

                    print("Digite o seu endereco: ")
                    val enderecoD = readLine()!!

                    print("Digite o seu telefone: ")
                    val telefoneD = readLine()!!

                    print("Digite o seu email: ")
                    val emailD = readLine()!!

                    print("Digite o seu cpf, somente números: ")
                    val cpfD = readLine()!!

                    val doador1=CadVol(nomeD,enderecoD,telefoneD,emailD,cpfD)

                    println("Digite o valor que deseja doar: ")
                    doacao = readLine()!!.toDouble()

                    doador1.doar(doacao)
                    doador1.metPag()


                } catch (e:Exception){
                    println(e.message)
                }

            }
            2 -> {
                try {
                    print("Digite o nome da Ong: ")
                    val nomeO = readLine()!!

                    print("Digite o endereco da Ong: ")
                    val enderecoO = readLine()!!

                    print("Digite o telefone da Ong: ")
                    val telefoneO = readLine()!!

                    print("Digite o email da Ong: ")
                    val emailO = readLine()!!

                    print("Digite o seu cnpj, somente números: ")
                    val cnpjO = readLine()!!

                    print("Digite a razaõ social: ")
                    val razaoSocO = readLine()!!

                    print("Digite a data de criação da ong, somente números: ")
                    val datCriacaoO = readLine()!!

                    println("\nDigite o valor que a Ong deseja arrecadar, somente números: ")
                    val metaOng = readLine()!!.toDouble()

                    val ong1=CadOng(nomeO,enderecoO,telefoneO,emailO,cnpjO,razaoSocO,datCriacaoO,metaOng)

                    ong1.arrecadar(doacao)

                    println("Digite o valor que deseja receber: ")
                    doacao = readLine()!!.toDouble()

                    ong1.metRec(doacao)

                } catch (e:Exception){
                    println(e.message)
                }
            }

        }
        println("Pressione qualquer tecla para visualizar o menu ou 0 para sair: ")
        val menu = readLine()!!
        menu!="0"

    }  while (menu!="0")

}

fun menu():Int{
    var opc: Int
    do {
        println("Você desejar tornar o mundo um lugar melhor?")
        println( "Digite 1 - para ser Doador ")
        println( "Digite 2 - para ser Ong parceira ")

        opc = readLine()!!.toInt()
        if (!(opc == 1 || opc == 2 )) {
            println("Opção inválida\n")
        }
    }while (!(opc == 1 || opc == 2 ))
    when (opc) {

        1 -> println( "Doador \n")
        2 -> println( "Ong parceira \n ")
        else -> {
            println("Opção invalida\n")
        }
    }
    return opc
}





