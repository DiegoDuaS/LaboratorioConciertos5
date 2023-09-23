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
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.lab5_diegoduarte.Conciertos
import com.example.lab5_diegoduarte.R
import com.example.lab5_diegoduarte.navegacion.model.Screen
import com.example.lab5_diegoduarte.ui.theme.Fondo
import com.example.lab5_diegoduarte.ui.theme.Fondo1

@Composable
fun Pantalla2(navController: NavHostController){
    val conciertosList = remember { mutableStateListOf<Conciertos>() }
    conciertosList.add(Conciertos("Young Miko", "9 de Septiembre, 2023", R.drawable.youngmiko, "El primer concierto en latinoamerica de Young Miko. Vive esta experiencia unica con sus exitos del momento:'Classy 101' , 'Chulo', 'Wiggy'", "Cardales de Cayala"))
    conciertosList.add(Conciertos("Latin Mafia", "20 de Octubre, 2023", R.drawable.latinmafia, "Prepárate para una noche llena de ritmo, pasión y energía desbordante con el concierto más esperado del año: Latin Mafia en el Parque de la Industria. Este evento promete ser una experiencia única que fusiona la música latina más candente con un espectáculo visual deslumbrante que dejará a todos sin aliento.", "Parque de la Industria"))
    conciertosList.add(Conciertos("Twice", "2 de Noviembre, 2023", R.drawable.twice, "¡Prepárate para una noche de pura energía y entretenimiento con el esperado concierto en vivo de TWICE en el Foro Sol! Este evento promete ser una celebración inolvidable de la música pop, el baile y el carisma único de este talentoso grupo de chicas surcoreanas.", "Foro Sol"))
    conciertosList.add(Conciertos("Feid", "4 de Diciembre, 2023", R.drawable.ferxxo, "¡Prepárate para una experiencia musical única y vibrante con el esperado concierto en vivo de Ferxxo en Cardales de Cayala! Este evento promete llevar a los asistentes a un viaje musical que fusiona el reguetón, el trap y el pop en una actuación llena de energía y pasión.", "Cardales de Cayala"))
    conciertosList.add(Conciertos("Taylor Swift", "5 de Enero, 2024", R.drawable.taylorswith, "La gira de tour de Taylor número 6. La primera vez que sale en gira desde la pandemia. Es un concierto que te llevará por todas las eras de Taylor Swift desde sus origenes con el album 'Taylor Swift' hasta su era actual con '1989: Taylor's Version", "Foro Sol"))
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Fondo),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        LazyColumn {
            items(conciertosList) { concierto ->
                Lugares(concierto = concierto, navController)
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