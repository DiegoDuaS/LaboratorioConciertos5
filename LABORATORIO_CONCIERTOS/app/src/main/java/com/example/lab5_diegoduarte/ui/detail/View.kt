package com.example.lab5_diegoduarte.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.lab5_diegoduarte.Conciertos
import com.example.lab5_diegoduarte.R
import com.example.lab5_diegoduarte.ui.theme.Fondo
import com.example.lab5_diegoduarte.ui.theme.Fondo1

@Composable
fun Pantalla3(navController: NavHostController, concierto: Conciertos?){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Fondo),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .size(400.dp)
                .background(color = Fondo1)
        ){
            if (concierto != null) {
                Image(
                    painter = painterResource(id = concierto.image),
                    contentDescription = null,
                    modifier = Modifier
                        .size(400.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Fondo)
            ){
                if (concierto != null) {
                    Text(
                        text = concierto.name,
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier
                            .padding(vertical = 2.dp),
                        textAlign = TextAlign.Start
                    )
                }
                if (concierto != null) {
                    Text(
                        text = concierto.venue,
                        style = MaterialTheme.typography.subtitle1,
                        modifier = Modifier
                            .padding(vertical = 2.dp),
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .padding(vertical = 4.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.calendaricon),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp),
                contentScale = ContentScale.Crop
            )
            if (concierto != null) {
                Text(
                    text = concierto.date,
                    style =  MaterialTheme.typography.subtitle1,
                    modifier = Modifier
                        .padding(vertical = 2.dp)
                        .padding(horizontal = 4.dp)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.clockicon),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "7:20 p.m",
                style =  MaterialTheme.typography.subtitle1,
                modifier = Modifier
                    .padding(horizontal = 4.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .padding(vertical = 4.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Fondo)
            ){
                Text(
                    text = "ABOUT",
                    style =  MaterialTheme.typography.subtitle1,
                    modifier = Modifier
                        .padding(vertical = 2.dp)
                        .padding(horizontal = 4.dp)
                )
                if (concierto != null) {
                    Text(
                        text = concierto.des,
                        style =  MaterialTheme.typography.subtitle2,
                        modifier = Modifier
                            .padding(vertical = 2.dp)
                            .padding(horizontal = 4.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Fondo1)

            ) {
                Text("Favorito")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Fondo1)

            ) {
                Text("Comprar")
            }
        }
    }
}