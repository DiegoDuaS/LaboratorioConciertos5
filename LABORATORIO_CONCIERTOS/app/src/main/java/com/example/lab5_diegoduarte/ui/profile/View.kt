package com.example.lab5_diegoduarte.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.lab5_diegoduarte.R
import com.example.lab5_diegoduarte.ui.theme.Fondo
import com.example.lab5_diegoduarte.ui.theme.Fondo1

@Composable
fun Pantalla4(){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Fondo),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .size(500.dp, 250.dp)
                .background(color = Color.Transparent)
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter,
        ) {
            Image(
                painter = painterResource(id = R.drawable.fondouser1),
                contentDescription = null,
                modifier = Modifier
                    .size(400.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
            ){
                Image(
                    painter = painterResource(id = R.drawable.usericon1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                        .padding(bottom = 0.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "USUARIO PRUEBA",
                    style =  MaterialTheme.typography.h6,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .padding(horizontal = 4.dp),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .padding(vertical = 4.dp)
                .background(color = Fondo)
        ){
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Fondo)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Fondo1
                )
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

                ){
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(color = Color.White)
                            .align(Alignment.CenterVertically)
                            .align(Alignment.CenterVertically)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.usericon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "Editar Perfil",
                        style = MaterialTheme.typography.subtitle1,
                        modifier = Modifier
                            .padding(vertical = 2.dp),
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Fondo1)

                    ) {
                        Text("...")
                    }

                }
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .padding(vertical = 2.dp)
                .background(color = Fondo)
        ){
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Fondo)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Fondo1
                )
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

                ){
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(color = Color.White)
                            .align(Alignment.CenterVertically)
                            .align(Alignment.CenterVertically)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.lockicon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "Reiniciar Contraseña",
                        style = MaterialTheme.typography.subtitle1,
                        modifier = Modifier
                            .padding(vertical = 2.dp),
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Fondo1)

                    ) {
                        Text("...")
                    }

                }
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .padding(vertical = 4.dp)
                .background(color = Fondo)
        ){
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Fondo)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Fondo1
                )
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

                ){
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(color = Color.White)
                            .align(Alignment.CenterVertically)
                            .align(Alignment.CenterVertically)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.bellicon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "Notificaciones",
                        style = MaterialTheme.typography.subtitle1,
                        modifier = Modifier
                            .padding(vertical = 2.dp),
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    val checkedState = remember { mutableStateOf(true) }
                    Switch(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                        modifier = Modifier
                            .padding(0.dp),
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = Fondo,
                            uncheckedThumbColor = Color.White,
                            uncheckedTrackColor = Color.Black
                        )
                    )

                }
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .padding(vertical = 4.dp)
                .background(color = Fondo)
        ){
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Fondo)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Fondo1
                )
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

                ){
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(color = Color.White)
                            .align(Alignment.CenterVertically)
                            .align(Alignment.CenterVertically)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.staricon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "Favoritos",
                        style = MaterialTheme.typography.subtitle1,
                        modifier = Modifier
                            .padding(vertical = 2.dp),
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Fondo1)

                    ) {
                        Text("...")
                    }

                }
            }

        }

    }
}