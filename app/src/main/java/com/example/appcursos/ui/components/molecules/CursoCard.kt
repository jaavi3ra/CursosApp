package com.example.appcursos.ui.components.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcursos.ui.components.atoms.BotonPrimary
import com.example.appcursos.ui.components.atoms.BotonVerCursos
import com.example.appcursos.ui.components.models.Curso

@Composable
fun CursoCard(
    curso: Curso,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                // Icono de ejemplo
                Spacer(
                    modifier = Modifier
                        .size(42.dp)
                        .background(
                            color = Color(0xFFDDE4FF),
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                Spacer(
                    modifier = Modifier.width(12.dp)
                )

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = curso.titulo,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "${curso.lecciones} lecciones",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = curso.descripcion,
                fontSize = 13.sp,
                color = Color.Gray
            )

            Spacer(
                modifier = Modifier.padding(top = 12.dp)
            )

            BotonVerCursos(
                texto = "Ver curso →",
                onClick = onClick,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}