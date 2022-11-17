package com.example.dummymovieapp.utils

import com.example.dummymovieapp.data.MovieEntity

import com.example.dummymovieapp.data.source.remote.response.MovieResponse


object DataDummy {
    fun getMovies(): List<MovieEntity>{
        var movies = ArrayList<MovieEntity>()
        movies.add(
            MovieEntity(
                "460465",
                "Mortal Kombat",
                "2021-04-07",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                4.0

            )
        )
        movies.add(
            MovieEntity(
                "399566",
                "Godzilla vs. Kong",
                "2021-03-24",
                "https://image.tmdb.org/t/p/w500/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                4.1
            )
        )
        movies.add(
            MovieEntity(
                "632357",
                "The Unholy",
                "2021-04-07",
                "https://image.tmdb.org/t/p/w500/zDq2pwPyt4xwSFHKUoNN2LohDWj.jpg",
                "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                4.1

            )
        )
        movies.add(
            MovieEntity(
                "791373",
                "Zack Snyder's Justice League",
                "2021-03-18",
                "https://image.tmdb.org/t/p/w500/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                4.2
            )
        )
        movies.add(
            MovieEntity(
                "460495",
                "Nobody",
                "2021-03-18",
                "https://image.tmdb.org/t/p/w500/6zbKgwgaaCyyBXE4Sun4oWQfQmi.jpg",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                3.9
            )
        )
        movies.add(
            MovieEntity(
                "634528",
                "The Marksman",
                "2021-01-15",
                "https://image.tmdb.org/t/p/w500/6vcDalR50RWa309vBH1NLmG2rjQ.jpg",
                "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                3.9
            )
        )
        movies.add(
            MovieEntity(
                "635302",
                "Demon Slayer -Kimetsu no Yaiba- The Movie: Mugen Train",
                "2020-10-16",
                "https://image.tmdb.org/t/p/w500/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
                "Tanjiro Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyojuro Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
                3.4
            )
        )
        movies.add(
            MovieEntity(
                "615678",
                "Thunder Force",
                "2021-04-09",
                "https://image.tmdb.org/t/p/w500/duK11VQd4UPDa7UJrgrGx90xJOx.jpg",
                "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
                3.4

            )
        )
        movies.add(
            MovieEntity(
                "412656",
                "Chaos Walking",
                "2021-04-07",
                "https://image.tmdb.org/t/p/w500/ovggmAOu1IbPGTQE8lg4lBasNC7.jpg",
                "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
                3.1
            )
        )
        movies.add(
            MovieEntity(
                "587996",
                "Bajocero",
                "2021-01-29",
                "https://image.tmdb.org/t/p/w500/6TPZSJ06OEXeelx1U1VIAt0j9Ry.jpg",
                "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
                4.3
            )
        )
        return movies
    }


    fun getMoviesResponse(): List<MovieResponse>{
        val movies = ArrayList<MovieResponse>()
        movies.add(
            MovieResponse(
                "460465",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "2021-04-07",
                4.0,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",


            )
        )
        movies.add(
            MovieResponse(
                "399566",
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "2021-03-24",
                4.1,
                "https://image.tmdb.org/t/p/w500/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",

            )
        )
        movies.add(
            MovieResponse(
                "632357",
                "The Unholy",
                "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                "2021-04-07",
                4.1,
                "https://image.tmdb.org/t/p/w500/zDq2pwPyt4xwSFHKUoNN2LohDWj.jpg",

            )
        )
        movies.add(
            MovieResponse(
                "791373",
                "Zack Snyder's Justice League",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "2021-03-18",
                4.2,
                "https://image.tmdb.org/t/p/w500/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "460495",
                "Nobody",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "2021-03-18",
                3.9,
                "https://image.tmdb.org/t/p/w500/6zbKgwgaaCyyBXE4Sun4oWQfQmi.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "634528",
                "The Marksman",
                "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                "2021-01-15",
                3.9,
                "https://image.tmdb.org/t/p/w500/6vcDalR50RWa309vBH1NLmG2rjQ.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "635302",
                "Demon Slayer -Kimetsu no Yaiba- The Movie: Mugen Train",
                "Tanjiro Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyojuro Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
                "2020-10-16",
                3.4,
                "https://image.tmdb.org/t/p/w500/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "615678",
                "Thunder Force",
                "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
                "2021-04-09",
                3.4,
                "https://image.tmdb.org/t/p/w500/duK11VQd4UPDa7UJrgrGx90xJOx.jpg",

            )
        )
        movies.add(
            MovieResponse(
                "412656",
                "Chaos Walking",
                "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
                "2021-04-07",
                3.1,
                "https://image.tmdb.org/t/p/w500/ovggmAOu1IbPGTQE8lg4lBasNC7.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "587996",
                "Bajocero",
                "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
                "2021-01-29",
                4.3,
                "https://image.tmdb.org/t/p/w500/6TPZSJ06OEXeelx1U1VIAt0j9Ry.jpg",
            )
        )
        return movies
    }

}