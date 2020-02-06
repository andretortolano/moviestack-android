package moviestack.core.data.movies

import moviestack.core.domain.DomainDetailedMovie
import moviestack.core.domain.DomainMovie

class MoviesRepositoryImpl(
    private val local: MoviesLocalSource,
    private val remote: MoviesRemoteSource
) : MoviesRepository {
    override fun getMovies(): List<DomainMovie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMovieDetail(movie: DomainMovie): DomainDetailedMovie {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}