package com.example.appcursos.ui.components.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.appcursos.ui.components.organisms.BottomNavigation
import com.example.appcursos.ui.components.organisms.HeaderInicio

@Composable
fun PerfilScreen(
    modifier: Modifier = Modifier,
    onOpcionClick: (String) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6))
    ) {

        HeaderInicio(
            seccion = "Perfil"
        )
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            // contenido de cursos
        }

        BottomNavigation(
            opcionSeleccionada = "Perfil",
            onOpcionClick = onOpcionClick
        )
    }


}
