package com.example.appcursos.ui.components.organisms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcursos.ui.components.atoms.BotonPrimary

@Composable
fun CursoActualCard(
    titulo: String,
    progreso: Float,
    onContinuar: () -> Unit
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
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "MI CURSO ACTUAL",
                    fontSize = 10.sp,
                    color = Color.Gray
                )

                Text(
                    text = "${(progreso * 100).toInt()}%",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2146F3)
                )
            }

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            Text(
                text = titulo,
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF202124)
            )

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            Text(
                text = "Continúa donde lo dejaste",
                fontSize = 12.sp,
                color = Color.Gray
            )

            Spacer(
                modifier = Modifier.height(14.dp)
            )

            LinearProgressIndicator(
                progress = { progreso },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp),
                color = Color(0xFF2146F3),
                trackColor = Color(0xFFE5E7EB)
            )

            Spacer(
                modifier = Modifier.height(14.dp)
            )

            BotonPrimary(
                texto = "Continuar →",
                onClick = onContinuar
            )
        }
    }
}