package moviestack.core.usecases.movies

import moviestack.core.data.movies.MoviesRepository
import moviestack.core.domain.DomainMovie
import moviestack.core.usecases.Interactor

class GetMoviesInteractor(private val moviesRepository: MoviesRepository) : Interactor {
    operator fun invoke(): List<DomainMovie> = moviesRepository.getMovies()
}