package com.surrus.peopleinspace.ui

import androidx.compose.getValue
import androidx.compose.mutableStateOf
import androidx.compose.setValue
import com.surrus.common.remote.Assignment

sealed class Screen {
    object Home : Screen()
    data class PersonDetails(val person: Assignment) : Screen()
}

object PeopleInSpaceNavigation {
    var currentScreen by mutableStateOf<Screen>(Screen.Home)
}

/**
 * Temporary solution pending navigation support.
 */
fun navigateTo(destination: Screen) {
    PeopleInSpaceNavigation.currentScreen = destination
}
