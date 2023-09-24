package com.example.lab5_diegoduarte.ui.concerts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
import com.example.lab5_diegoduarte.ui.theme.Tarjetitas

@Composable
fun Pantalla1(navController: NavHostController, sharedViewModel: SharedViewModel = viewModel()){

    val ConciertosAll = sharedViewModel.conciertosList

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Fondo),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .background(color = Fondo1)
                .fillMaxWidth()
        ){
            Text(
                text = "Todo Eventos",
                style = androidx.compose.material.MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(bottom = 8.dp, top = 8.dp)
                    .align(Alignment.Center),
                color = Color.White
            )
        }
        Text(
            text = "Eventos Favoritos",
            style = androidx.compose.material.MaterialTheme.typography.h6,
            modifier = Modifier
                .padding(bottom = 8.dp, top = 8.dp),
            color = BlueOscuro,
            textAlign = TextAlign.Start,
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            if (sharedViewModel.concirtosFav.isEmpty()){
                Text(
                    text = "No tienes conciertos favoritos.",
                    style = androidx.compose.material.MaterialTheme.typography.subtitle1,
                    modifier = Modifier.padding(bottom = 8.dp, top = 8.dp),
                    color = BlueOscuro,
                    textAlign = TextAlign.Center,
                )
            }
            else {
                sharedViewModel.concirtosFav.forEach { concierto ->
                    CardConcierto(concierto = concierto,navController)
                }
            }
        }
        Text(
            text = "Todos Los Conciertos",
            style = androidx.compose.material.MaterialTheme.typography.h6,
            modifier = Modifier.padding(bottom = 8.dp, top = 8.dp),
            color = BlueOscuro
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ){
            ConciertosAll.forEach { concierto ->
                CardConcierto(concierto = concierto,navController)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(
                onClick = {
                    navController.navigate(Screen.profile.route)
                },
                colors = ButtonDefaults.buttonColors(containerColor = Fondo1)

            ) {
                Text("Usuario")
            }
            Button(
                onClick = {
                    navController.navigate(Screen.favorites.route)
                },
                colors = ButtonDefaults.buttonColors(containerColor = Fondo1)

            ) {
                Text("Favoritos")
            }
        }
    }
}

@Composable
fun CardConcierto(concierto: Conciertos, navController:NavHostController){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .background(color = Fondo)
            .width(150.dp)
            .clickable {
                navController.currentBackStackEntry?.savedStateHandle?.set(
                    key = "concierto",
                    value  = concierto
                )
                navController.navigate(Screen.detalles.route)
            }
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Tarjetitas),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .background(color = Tarjetitas)
            ){
                Image(
                    painter = painterResource(id = concierto.image),
                    contentDescription = null,
                    modifier = Modifier
                        .size(170.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                text = concierto.name,
                style = androidx.compose.material.MaterialTheme.typography.h6,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                color = BlueOscuro,
                textAlign = TextAlign.Center

            )
            Text(
                text = concierto.date,
                style = androidx.compose.material.MaterialTheme.typography.body2,
                modifier = Modifier
                    .padding(vertical = 2.dp)
                    .fillMaxWidth(),
                color = BlueOscuro,
                textAlign = TextAlign.Center
            )
        }
    }
}
