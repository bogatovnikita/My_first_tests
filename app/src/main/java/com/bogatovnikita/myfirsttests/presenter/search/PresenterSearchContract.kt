package com.bogatovnikita.myfirsttests.presenter.search

import com.bogatovnikita.myfirsttests.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
    //onAttach
    //onDetach
}