package com.bogatovnikita.myfirsttests.view.search

import com.bogatovnikita.myfirsttests.model.SearchResult
import com.bogatovnikita.myfirsttests.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}