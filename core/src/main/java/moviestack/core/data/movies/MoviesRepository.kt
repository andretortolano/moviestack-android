package moviestack.core.data.movies

import moviestack.core.data.Repository
import moviestack.core.domain.DomainDetailedMovie
import moviestack.core.domain.DomainMovie

interface MoviesRepository : Repository {
    fun getMovies(): List<DomainMovie>

    fun getMovieDetail(movie: DomainMovie): DomainDetailedMovie
}