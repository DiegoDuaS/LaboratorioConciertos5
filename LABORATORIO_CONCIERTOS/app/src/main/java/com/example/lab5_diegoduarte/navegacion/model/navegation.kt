package com.example.lab5_diegoduarte.navegacion.model
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab5_diegoduarte.ui.concerts.Pantalla1
import com.example.lab5_diegoduarte.ui.detail.Pantalla3
import com.example.lab5_diegoduarte.ui.favorites.Pantalla2
import com.example.lab5_diegoduarte.ui.profile.Pantalla4

@Composable
fun YourApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Conciertos"
    ) {
        composable("Conciertos") {
            Pantalla1(navController)
        }
        composable("Detalles"){
            Pantalla3()
        }
        composable("Favorites"){
            Pantalla2()
        }
        composable("Profile"){
            Pantalla4()
        }
    }
}