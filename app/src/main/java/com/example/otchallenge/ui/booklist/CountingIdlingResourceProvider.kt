package com.example.otchallenge.ui.booklist

import androidx.test.espresso.idling.CountingIdlingResource

/**
 * To help with espresso tests for real time synchronization.
 */
object CountingIdlingResourceProvider {
    private const val RESOURCE = "GLOBAL"

    val countingIdlingResource = CountingIdlingResource(RESOURCE)

    fun increment() {
        countingIdlingResource.increment()
    }

    fun decrement() {
        if (!countingIdlingResource.isIdleNow) {
            countingIdlingResource.decrement()
        }
    }
}
