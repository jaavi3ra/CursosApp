package com.example.appcursos.ui.components.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.appcursos.ui.components.models.Curso

@Composable
fun ListaCursos(
    cursos: List<Curso>,
    onCursoClick: (Curso) -> Unit
) {
    Column {
        cursos.forEach { curso ->
            Text(text = curso.titulo)
            Text(text = curso.descripcion)
            Text(text = "${curso.lecciones} lecciones")
        }
    }
}