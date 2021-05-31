package com.ka4.pl_hw1

class MainPresenter(val view: MainView) {
    val model = CountersModel()

    fun incrementCounter1() {
        val nextValue = model.next(0)
        view.setButtonText(0, nextValue.toString())
    }

    fun incrementCounter2() {
        val nextValue = model.next(1)
        view.setButtonText(1, nextValue.toString())
    }

    fun incrementCounter3() {
        val nextValue = model.next(2)
        view.setButtonText(2, nextValue.toString())
    }

}

