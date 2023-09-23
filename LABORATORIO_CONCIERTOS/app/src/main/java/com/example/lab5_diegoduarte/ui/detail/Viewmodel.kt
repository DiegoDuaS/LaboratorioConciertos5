package com.example.lab5_diegoduarte.ui.detail

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab5_diegoduarte.Conciertos
import com.example.lab5_diegoduarte.R
import com.example.lab5_diegoduarte.ui.theme.LAB5_DiegoDuarteTheme

@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    LAB5_DiegoDuarteTheme {
        Pantalla3(Conciertos("Latin Mafia", "20 de Octubre, 2023", R.drawable.latinmafia, "Prepárate para una noche llena de ritmo, pasión y energía desbordante con el concierto más esperado del año: Latin Mafia en el Parque de la Industria. Este evento promete ser una experiencia única que fusiona la música latina más candente con un espectáculo visual deslumbrante que dejará a todos sin aliento.", "Parque de la Industria"))
    }
}