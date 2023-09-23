package com.example.lab5_diegoduarte.navegacion.model
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab5_diegoduarte.Conciertos
import com.example.lab5_diegoduarte.R
import com.example.lab5_diegoduarte.ui.concerts.Pantalla1
import com.example.lab5_diegoduarte.ui.detail.Pantalla3
import com.example.lab5_diegoduarte.ui.favorites.Pantalla2
import com.example.lab5_diegoduarte.ui.profile.Pantalla4


data class ConciertoViewModel(
    val concierto: Conciertos
)
@Composable
fun YourApp() {
    val navController = rememberNavController()
    val conciertoViewModel = remember { ConciertoViewModel(concierto = Conciertos("r","2", R.drawable.clockicon, "s", "s")) }
    val conciertoListViewModel = remember {  mutableStateListOf<Conciertos>() }

    NavHost(
        navController = navController,
        startDestination = "Conciertos"
    ) {
        composable("Conciertos") {
            Pantalla1(navController)
        }
        composable("Detalles"){
            Pantalla3(conciertoViewModel = conciertoViewModel)
        }
        composable("Favorites"){
            Pantalla2(conciertoListViewModel, navController)
        }
        composable("Profile"){
            Pantalla4()
        }
    }
}