package cl.desafiolatam.herodataapp.model.pojo

data class Hero (
    val id: Int,
    val name: String,
    val powerstats: Powerstats,
    val slug: String,
    val images : HeroImages
)
