package com.example.appcursos.ui.components.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
    Spacer(
        modifier = Modifier.height(12.dp)
    )
}