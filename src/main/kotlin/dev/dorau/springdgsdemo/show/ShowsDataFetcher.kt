package dev.dorau.springdgsdemo.show

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsData
import com.netflix.graphql.dgs.InputArgument

@DgsComponent
internal class ShowsDataFetcher {

    companion object {
        val SHOWS = listOf(
            Show("Stranger Things", 2016),
            Show("Ozark", 2017),
            Show("The Crown", 2016),
            Show("Dead to Me", 2019),
            Show("Orange is the New Black", 2013)
        )
    }

    @DgsData(parentType = "Query", field = "shows")
    fun shows(@InputArgument("titleFilter") titleFilter: String?): List<Show> {
        return if (titleFilter != null) {
            SHOWS.filter { it.title.contains(titleFilter) }
        } else {
            SHOWS
        }
    }
}
