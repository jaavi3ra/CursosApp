package com.example.appcursos.ui.components.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun tituloHome(
    nombreUsuario: String
) {
    Column {
        Text(
            text = "¡Hola, $nombreUsuario!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF202124)
        )

        Text(
            text = "Bienvenido a tu aula virtual",
            fontSize = 14.sp,
            color = Color(0xFF7A7A7A)
        )
    }
}