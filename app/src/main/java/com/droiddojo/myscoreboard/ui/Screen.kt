package com.droiddojo.myscoreboard.ui

sealed class Screen(val route : String) {
    object ScoreBoardScreen : Screen(route = "score_board_screen")
    object DetailsScreen : Screen(route = "details_screen")

}
