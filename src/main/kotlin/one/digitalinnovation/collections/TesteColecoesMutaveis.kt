package one.digitalinnovation.collections

fun main(){
    val joao = Funcionarios("Joao", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")

    println("_____________LIST_____________________")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("_____________----_____________________")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("__________________________________")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("_____________SET_____________________")
    val funcionariosSet = mutableListOf(joao)
    funcionariosSet.forEach{println(it)}

    println("__________________________________")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{println(it)}

    println("__________________________________")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}

}