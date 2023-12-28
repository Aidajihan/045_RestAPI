package com.example.consumeapi.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.consumeapi.ui.theme.home.screen.DestinasiEntry
import com.example.consumeapi.ui.theme.home.screen.DestinasiHome
import com.example.consumeapi.ui.theme.home.screen.EntryKontakScreen
import com.example.consumeapi.ui.theme.home.screen.HomeScreen

@Composable
fun PengelolaHalaman(navController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier,
    ) {

        composable(DestinasiHome.route) {
            HomeScreen(navigateToItemEntry = {
                navController.navigate(DestinasiEntry.route)
            },
                onDetailClick = {

                })
        }
        composable(DestinasiEntry.route) {
            EntryKontakScreen(navigetBack = {
                navController.navigate(

                ) {
                    popUpTo(DestinasiHome.route){
                        inclusive = true
                    }
                }
            })
        }
    }
}