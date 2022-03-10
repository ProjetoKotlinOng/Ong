fun main(){


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
    when(opc){

        1 -> {
            try {
                print("Digite o seu nome: ")
                var nomeD = readLine()!!

                print("Digite o seu endereco: ")
                var enderecoD = readLine()!!

                print("Digite o seu telefone: ")
                var telefoneD = readLine()!!

                print("Digite o seu email: ")
                var emailD = readLine()!!

                print("Digite o seu cpf, somente números: ")
                var cpfD = readLine()!!

                var doador1=CadVol(nomeD,enderecoD,telefoneD,emailD,cpfD)

            } catch (e:Exception){
                println(e.message)
            }

        }
        2 -> {
            try {
                print("Digite o nome da Ong: ")
                var nomeO = readLine()!!

                print("Digite o endereco da Ong: ")
                var enderecoO = readLine()!!

                print("Digite o telefone da Ong: ")
                var telefoneO = readLine()!!

                print("Digite o email da Ong: ")
                var emailO = readLine()!!

                print("Digite o seu cnpj, somente números: ")
                var cnpjO = readLine()!!

                print("Digite a razaõ social: ")
                var razaoSocO = readLine()!!

                print("Digite a data de criação da ong, somente números: ")
                var datCriacaoO = readLine()!!

                print("Digite a meta que a Ong deseja arrecadar, somente números: ")
                var metaValorO = readLine()!!

                var ong1=CadOng(nomeO,enderecoO,telefoneO,emailO,cnpjO,razaoSocO,datCriacaoO,metaValorO)
            } catch (e:Exception){
                println(e.message)
            }
        }

    }
}

