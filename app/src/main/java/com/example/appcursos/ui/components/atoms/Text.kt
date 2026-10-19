package com.example.appcursos.ui.components.atoms

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(
    text: String
) {
    Text(
        text = text,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}

@Composable
fun DescripText(
    text: String
) {
    Text(
        text = text,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}
@Composable
fun EtiquetaText(
    text: String
) {
    Text(
        text = text,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}