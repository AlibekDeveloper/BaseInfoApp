package com.example.composelearningnecombeginnercurs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composelearningnecombeginnercurs.ui.theme.ComposeLearningNecomBeginnerCursTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearningNecomBeginnerCursTheme {
                LazyColumn(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Gray)
                ) {
                    itemsIndexed(
                        listOf(
                            ItemRowModel(
                                R.drawable.jobs, "Jobs", getString(R.string.steve_jobs)
                            ),
                            ItemRowModel(
                                R.drawable.gates, "Gates", getString(R.string.bill_gates)
                            ),
                            ItemRowModel(
                                R.drawable.bezos, "Bezos", getString(R.string.jeff_bezos)
                            ),
                            ItemRowModel(
                                R.drawable.musk, "Musk", getString(R.string.elon_musk)
                            ),
                            ItemRowModel(
                                R.drawable.jack, "Jack Ma", getString(R.string.jack_ma)
                            ),
                            ItemRowModel(
                                R.drawable.mark, "Mark", getString(R.string.mark_zuckerberg)
                            ),
                        )
                    ) { _, value ->
                        ItemRow(itemRowModel = value)
                    }
                }
            }
        }
    }
}
