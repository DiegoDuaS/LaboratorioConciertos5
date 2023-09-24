package com.example.lab5_diegoduarte.navegacion.model
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab5_diegoduarte.Conciertos
import com.example.lab5_diegoduarte.ui.concerts.Pantalla1
import com.example.lab5_diegoduarte.ui.detail.Pantalla3
import com.example.lab5_diegoduarte.ui.favorites.Pantalla2
import com.example.lab5_diegoduarte.ui.profile.Pantalla4


const val concierto = "concierto"

sealed class Screen(val route:String){
    object conciertos: Screen(route= "conciertos_screen")
    object detalles: Screen(route = "detalles_screen/{$concierto}"){
        fun passConcert(concert: Conciertos): Conciertos {
            return concert
        }
    }
    object favorites: Screen(route = "favoritos_screen")
    object profile: Screen(route= "perfil_screen")
}

@Composable
fun YourApp(sharedViewModel: SharedViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.conciertos.route
    ) {
        composable(
            route = Screen.conciertos.route
        ) {
            Pantalla1(navController, sharedViewModel)
        }
        composable(
            route = Screen.detalles.route
        ){
            val actualconcert =
                navController.previousBackStackEntry?.savedStateHandle?.get<Conciertos>("concierto")
            if (actualconcert != null) {
                Pantalla3(navController = navController, actualconcert, sharedViewModel)
            }
        
        }
        composable(
            route = Screen.favorites.route
        ){
            Pantalla2(navController,sharedViewModel)
        }
        composable(
            route = Screen.profile.route
        ){
            Pantalla4()
        }
    }
}