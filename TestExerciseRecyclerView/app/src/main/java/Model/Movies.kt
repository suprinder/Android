package Model

class Movie(val name:String){

    companion object {
        val movies = mutableListOf<Movie>()
        var movie: Int =0
        fun getMovies(numOfmovies: Int): List<Movie>{
            for (i in 1..numOfmovies){
                movies.add(Movie("Movie :"+ ++movie))
            }
            return movies
        }
    }
}