package com.example.lab5_diegoduarte.ui.favorites

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.lab5_diegoduarte.Conciertos
import com.example.lab5_diegoduarte.navegacion.model.Screen
import com.example.lab5_diegoduarte.navegacion.model.SharedViewModel
import com.example.lab5_diegoduarte.ui.theme.BlueOscuro
import com.example.lab5_diegoduarte.ui.theme.Fondo
import com.example.lab5_diegoduarte.ui.theme.Fondo1
import com.google.android.material.snackbar.Snackbar

@Composable
fun Pantalla2(navController: NavHostController, sharedViewModel: SharedViewModel = viewModel()){
    val conciertosList = sharedViewModel.concirtosFav

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Fondo),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        if (conciertosList.isEmpty()){
            Text(
                text = "No tienes conciertos favoritos.",
                style = androidx.compose.material.MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(bottom = 8.dp, top = 8.dp),
                color = BlueOscuro,
                textAlign = TextAlign.Center,
            )
        }
        else {
            LazyColumn {
                items(conciertosList) { concierto ->
                    Lugares(concierto = concierto, navController)
                }
            }
        }
    }
}

@Composable
fun Lugares(concierto: Conciertos, navController: NavHostController) {
    val firstLetter = concierto.name.take(1).uppercase()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Fondo)
            .clickable {
                navController.currentBackStackEntry?.savedStateHandle?.set(
                    key = "concierto",
                    value  = concierto
                )
                navController.navigate(Screen.detalles.route)
            },
        colors = CardDefaults.cardColors(
            containerColor = Fondo1
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(color = Fondo)
                    .align(Alignment.CenterVertically)
                    .align(Alignment.CenterVertically)
            ){
                Text(
                    text = firstLetter,
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(Alignment.Center),
                    color = Color.Black,
                )
            }
            Column(
                modifier = Modifier
                    .padding(8.dp),
                horizontalAlignment = Alignment.End
            ){
                Text(
                    text = concierto.name,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier
                        .padding(vertical = 2.dp),
                    textAlign = TextAlign.End,
                    color = Color.White
                )
                Text(
                    text = concierto.venue,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier
                        .padding(vertical = 2.dp),
                    color = Color.White,
                    textAlign = TextAlign.End,
                )
            }

        }
    }
}