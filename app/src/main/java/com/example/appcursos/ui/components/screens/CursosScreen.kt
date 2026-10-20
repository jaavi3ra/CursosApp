package com.example.appcursos.ui.components.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.appcursos.ui.components.organisms.BottomNavigation
import com.example.appcursos.ui.components.organisms.HeaderInicio
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import com.example.appcursos.ui.components.molecules.BarraBusqueda
import com.example.appcursos.ui.components.organisms.FiltrosCursos
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.appcursos.ui.components.models.Curso
import com.example.appcursos.ui.components.molecules.CursoCard

@Composable
fun CursosScreen(
    modifier: Modifier = Modifier,
    onOpcionClick: (String) -> Unit,
    onCursoClick: (Curso) -> Unit
) {

    var busqueda by remember {
        mutableStateOf("")
    }

    var filtroSeleccionado by remember {
        mutableStateOf("Todos")
    }

    val cursos = listOf(
        Curso(
            titulo = "HTML y CSS",
            descripcion = "Aprende la estructura básica y estilos web desde cero.",
            lecciones = 12
        ),
        Curso(
            titulo = "Diseño UI",
            descripcion = "Fundamentos de interfaz, tipografía, color y espaciado.",
            lecciones = 8
        ),
        Curso(
            titulo = "JavaScript Básico",
            descripcion = "Variables, funciones y lógica práctica para páginas interactivas.",
            lecciones = 15
        )
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6))
    ) {

        // HEADER
        HeaderInicio(
            seccion = "Cursos"
        )

        // CONTENIDO DE LA PANTALLA
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            // BARRA DE BÚSQUEDA
            BarraBusqueda(
                texto = busqueda,
                onTextoCambio = {
                    busqueda = it
                }
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            // FILTROS
            FiltrosCursos(
                filtroSeleccionado = filtroSeleccionado,
                onFiltroClick = {
                    filtroSeleccionado = it
                }
            )

            Spacer(
                modifier = Modifier.height(18.dp)
            )

            Text(
                text = "Cursos Disponibles",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF202124)
            )

            Spacer(
                modifier = Modifier.height(14.dp)
            )

            // CURSOS
            cursos.forEach { curso ->

                CursoCard(
                    curso = curso,
                    onClick = {
                        onCursoClick(curso)
                    }
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )
            }
        }

        // BARRA INFERIOR
        BottomNavigation(
            opcionSeleccionada = "Cursos",
            onOpcionClick = onOpcionClick
        )
    }
}
