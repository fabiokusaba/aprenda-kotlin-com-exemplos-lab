// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val name: String, val email: String, val password: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        for(usuario in usuarios) {
            inscritos.add(usuario)
            println("Usuário ${usuario.name} matriculado(a) com sucesso.")
        }    
    }
}

fun main() {
    val nivel = Nivel.BASICO
    
    val usuario1 = Usuario("Maria", "maria@email.com", "maria123")
    val usuario2 = Usuario("João", "joão@email.com", "joao1234")
    val usuario3 = Usuario("Pedro", "pedro@email.com", "1234567")
    
    val kotlinIntroducao = ConteudoEducacional("Kotlin Introdução", 2)
    val kotlinFuncoes = ConteudoEducacional("Kotlin Funções", 2)
    val kotlinClasses = ConteudoEducacional("Kotlin Classes", 2)
    val kotlinComExemplos = ConteudoEducacional("Kotlin com exemplos", 2)
    
    val listaConteudosEducacionais = listOf(kotlinIntroducao, kotlinFuncoes, kotlinClasses, kotlinComExemplos)
    
    val bootcampKotlin = Formacao("NTT Data Bootcamp com Kotlin", nivel, listaConteudosEducacionais)
    
    println(bootcampKotlin)
    
    bootcampKotlin.matricular(usuario1, usuario2, usuario3)
    
    println(bootcampKotlin.inscritos)
}
