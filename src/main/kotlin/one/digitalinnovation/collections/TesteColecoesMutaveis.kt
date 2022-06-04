package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0,"CLT")
    val maria = Funcionario("Maria", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")

    val funcionarios= mutableListOf(joao, maria)
    funcionarios.forEach {println(it)}

    println("---------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach {println (it)}

    println("---------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("---------------------------")
    val funcionarioset = mutableListOf(joao)
    funcionarioset.forEach{println(it)}

    println("---------------------------")
    funcionarioset.add(pedro)
    funcionarioset.add(maria)
    funcionarioset.forEach{println(it)}


}