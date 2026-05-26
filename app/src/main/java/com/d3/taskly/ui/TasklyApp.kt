package com.d3.taskly.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.d3.taskly.ui.task.TaskScreen

@Composable
fun TasklyApp() {
    val viewModel: TaskViewModel = hiltViewModel()
    TaskScreen(viewModel = viewModel)
}