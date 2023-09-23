package com.example.lab5_diegoduarte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.lab5_diegoduarte.navegacion.model.YourApp
import com.example.lab5_diegoduarte.ui.theme.LAB5_DiegoDuarteTheme

data class Venues(val name: String, val place:String)
data class Conciertos(val name: String, val date: String, val image: Int)

//Prueba Committ Lab 6
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LAB5_DiegoDuarteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    YourApp()
                }
            }
        }
    }
}






