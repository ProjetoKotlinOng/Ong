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

                print("Digite o valor que deseja doar: ")
                doacao = readLine()!!.toDouble()

                doador1.doar(doacao)


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

                print("Digite o valor que a Ong tem em caixa, somente números: ")
                val valorAtualO = readLine()!!.toDouble()

                val ong1=CadOng(nomeO,enderecoO,telefoneO,emailO,cnpjO,razaoSocO,datCriacaoO,valorAtualO)

                ong1.arrecadar(doacao)

            } catch (e:Exception){
                println(e.message)
            }
        }

    }
        println("Pressione qualquer tecla para visualizar o menu, ou 0 para sair: ")
        val menu = readLine()!!
        if(menu!="0"){
            menu()
        }

   }  while (menu!="0")

}

fun menu():Int{
    println("Você desejar tornar o mundo um lugar melhor?")
    println( "Digite 1 - para ser Doador ")
    println( "Digite 2 - para ser Ong parceira ")

    var opc = readLine()!!.toInt()
    while (opc<1|| opc> 2){
        println("Opção inválida")
        println( "Seja um Doador -  digite 1")
        println( "Seja uma Ong parceira - digite 2")
        opc= readLine()!!.toInt()
    }
    return opc
}

