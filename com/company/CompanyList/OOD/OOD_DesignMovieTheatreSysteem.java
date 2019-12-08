package com.company.CompanyList.OOD;

import java.util.List;

//platform connect to theatre DB
//use theatre API
public class OOD_DesignMovieTheatreSysteem {
    public class Theatre{
        int theatreId;
        String name;
        List<Movie> showingMovies;

    }
    public class booking{

    }

    public class User{
        int userId;
    }

    public class Movie{
        int movieId;
        int TheatreId;
    }

}
