package com.example.compose2

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BarkHomeContent() {
    val puppies = remember { DataProvider.puppyList }
    LazyVerticalGrid(
        cells = GridCells.Fixed(2)
    ) {
        items(
                items = puppies,
                itemContent = {
                    PuppyListItem(puppy = it)
                })
        }
    }


