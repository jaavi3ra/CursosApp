package com.example.appcursos.ui.components.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.appcursos.ui.components.organisms.BottomNavigation
import com.example.appcursos.ui.components.organisms.CursoActualCard
import com.example.appcursos.ui.components.organisms.HeaderInicio
import com.example.appcursos.ui.components.organisms.ItemInicioCard
import com.example.appcursos.ui.components.organisms.tituloHome

@Composable
fun InicioScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6))
    ) {

        HeaderInicio(
            seccion = "Inicio"
        )

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.Top
        ) {

            tituloHome(
                nombreUsuario = "Alex"
            )

            Spacer(modifier = Modifier.height(16.dp))

            CursoActualCard(
                titulo = "Fundamentos de Diseño",
                progreso = 0.6f,
                onContinuar = { }
            )

            Spacer(modifier = Modifier.height(16.dp))

            ItemInicioCard(
                titulo = "Mis Tareas",
                subtitulo = "Actividades pendientes",
                tipo = "tareas",
                onClick = { }
            )

            Spacer(modifier = Modifier.height(12.dp))

            ItemInicioCard(
                titulo = "Mis Clases",
                subtitulo = "Horario y sesiones",
                tipo = "clases",
                onClick = { }
            )
        }

        BottomNavigation(
            opcionSeleccionada = "Inicio",
            onOpcionClick = { opcion ->
                // navegación después
            }
        )
    }
}