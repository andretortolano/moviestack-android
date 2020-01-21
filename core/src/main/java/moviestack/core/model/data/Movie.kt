package moviestack.core.model.data

data class Movie(
    val id: Int,
    val title: String,
    val rated: String,
    val releaseDate: String,
    val duration: String,
    val genre: String,
    val description: String,
    val posterURL: String
)