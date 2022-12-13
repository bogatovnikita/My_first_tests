package com.bogatovnikita.myfirsttests.presenter.details

import com.bogatovnikita.myfirsttests.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}