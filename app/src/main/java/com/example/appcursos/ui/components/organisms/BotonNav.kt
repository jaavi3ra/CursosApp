package com.example.appcursos.ui.components.organisms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavigation(
    opcionSeleccionada: String,
    onOpcionClick: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {

        BottomNavigationItem(
            texto = "Inicio",
            seleccionado = opcionSeleccionada == "Inicio",
            icono = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Inicio",
                    modifier = Modifier.size(20.dp)
                )
            },
            onClick = {
                onOpcionClick("Inicio")
            }
        )

        BottomNavigationItem(
            texto = "Cursos",
            seleccionado = opcionSeleccionada == "Cursos",
            icono = {
                Icon(
                    imageVector = Icons.Default.School,
                    contentDescription = "Cursos",
                    modifier = Modifier.size(20.dp)
                )
            },
            onClick = {
                onOpcionClick("Cursos")
            }
        )

        BottomNavigationItem(
            texto = "Perfil",
            seleccionado = opcionSeleccionada == "Perfil",
            icono = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Perfil",
                    modifier = Modifier.size(20.dp)
                )
            },
            onClick = {
                onOpcionClick("Perfil")
            }
        )
    }
}

@Composable
fun BottomNavigationItem(
    texto: String,
    seleccionado: Boolean,
    icono: @Composable () -> Unit,
    onClick: () -> Unit
) {
    val color = if (seleccionado) {
        Color(0xFF4B6BFB)
    } else {
        Color.Gray
    }

    Column(
        modifier = Modifier
            .clickable {
                onClick()
            }
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        androidx.compose.runtime.CompositionLocalProvider(
            androidx.compose.material3.LocalContentColor provides color
        ) {
            icono()
        }

        Text(
            text = texto,
            fontSize = 10.sp,
            color = color
        )
    }
}