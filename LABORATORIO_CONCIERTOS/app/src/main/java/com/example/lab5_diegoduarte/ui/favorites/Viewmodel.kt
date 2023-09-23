package com.example.lab5_diegoduarte.ui.favorites

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab5_diegoduarte.Conciertos
import com.example.lab5_diegoduarte.R
import com.example.lab5_diegoduarte.ui.theme.LAB5_DiegoDuarteTheme

@Preview(showBackground = true)
@Composable
fun FavoritesPreview() {
    LAB5_DiegoDuarteTheme {
        val ConciertosFav = remember { mutableStateListOf<Conciertos>() }
        val ConciertosAll = remember { mutableStateListOf<Conciertos>() }
        ConciertosAll.add(Conciertos("Young Miko", "9 de Septiembre, 2023", R.drawable.youngmiko, "El primer concierto en latinoamerica de Young Miko. Vive esta experiencia unica con sus exitos del momento:'Classy 101' , 'Chulo', 'Wiggy'", "Cardales de Cayala"))
        ConciertosAll.add(Conciertos("Latin Mafia", "20 de Octubre, 2023", R.drawable.latinmafia, "Prepárate para una noche llena de ritmo, pasión y energía desbordante con el concierto más esperado del año: Latin Mafia en el Parque de la Industria. Este evento promete ser una experiencia única que fusiona la música latina más candente con un espectáculo visual deslumbrante que dejará a todos sin aliento.", "Parque de la Industria"))
        ConciertosAll.add(Conciertos("Twice", "2 de Noviembre, 2023", R.drawable.twice, "¡Prepárate para una noche de pura energía y entretenimiento con el esperado concierto en vivo de TWICE en el Foro Sol! Este evento promete ser una celebración inolvidable de la música pop, el baile y el carisma único de este talentoso grupo de chicas surcoreanas.", "Foro Sol"))
        ConciertosAll.add(Conciertos("Feid", "4 de Diciembre, 2023", R.drawable.ferxxo, "¡Prepárate para una experiencia musical única y vibrante con el esperado concierto en vivo de Ferxxo en Cardales de Cayala! Este evento promete llevar a los asistentes a un viaje musical que fusiona el reguetón, el trap y el pop en una actuación llena de energía y pasión.", "Cardales de Cayala"))
        ConciertosAll.add(Conciertos("Taylor Swift", "5 de Enero, 2024", R.drawable.taylorswith, "La gira de tour de Taylor número 6. La primera vez que sale en gira desde la pandemia. Es un concierto que te llevará por todas las eras de Taylor Swift desde sus origenes con el album 'Taylor Swift' hasta su era actual con '1989: Taylor's Version", "Foro Sol"))

    }
}