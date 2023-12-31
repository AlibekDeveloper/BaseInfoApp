package com.example.composelearningnecombeginnercurs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemRow(itemRowModel: ItemRowModel) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = itemRowModel.imageId),
            contentDescription = "Steve Jobs",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(4.dp)
                .size(64.dp)
                .clip(CircleShape)
        )
        Column(
            modifier = Modifier.padding(start = 8.dp, top = 8.dp)
        ) {
            Text(
                text = itemRowModel.name
            )
            Text(
                modifier = Modifier.clickable {
                    isExpanded = !isExpanded
                },
                maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                text = itemRowModel.description
            )
        }
    }
}