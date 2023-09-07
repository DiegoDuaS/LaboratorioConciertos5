package com.example.lab5_diegoduarte.ui.favorites

import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.lab5_diegoduarte.Venues
import com.example.lab5_diegoduarte.ui.theme.Fondo
import com.example.lab5_diegoduarte.ui.theme.Fondo1

@Composable
fun Pantalla2(){
    val Lista = remember { mutableStateListOf<Venues>() }
    Lista.add(Venues("Bad Bunny", "Explanada Cayala"))
    Lista.add(Venues("Martin Garrix", "Forum Majadas"))
    Lista.add(Venues("Latin Mafia", "Parque de la Industria"))
    Lista.add(Venues("Taylor Swift", "Foro Sol"))

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Fondo),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        LazyColumn {
            items(Lista) { venue ->
                Lugares(lugar = venue)
            }
        }
    }
}

@Composable
fun Lugares(lugar: Venues) {
    val firstLetter = lugar.name.take(1).uppercase()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Fondo),
        colors = CardDefaults.cardColors(
            containerColor = Fondo1
        )
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
                horizontalAlignment = Alignment.Start
            ){
                Text(
                    text = lugar.name,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier
                        .padding(vertical = 2.dp),
                    textAlign = TextAlign.Start,
                    color = Color.White
                )
                Text(
                    text = lugar.place,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier
                        .padding(vertical = 2.dp),
                    color = Color.White,
                    textAlign = TextAlign.Start,
                )
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Fondo1)

            ) {
                Text("...")
            }
        }
    }
}