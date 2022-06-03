package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0,"CLT")
    val maria = Funcionario("Maria", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach {println(it) }

    println("------------------------------")
    println (funcionarios.find { it.nome == "Maria"})

    println("------------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{println(it)}
}

data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
    ) {
    override fun toString(): String =
        """
           Nome: $nome
           Salário: $salario
        """.trimIndent()
}