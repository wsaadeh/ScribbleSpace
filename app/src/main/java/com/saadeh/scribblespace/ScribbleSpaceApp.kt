package com.saadeh.scribblespace

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saadeh.scribblespace.create.presentation.CreateNoteViewModel
import com.saadeh.scribblespace.create.presentation.ui.CreateNoteScreen
import com.saadeh.scribblespace.list.presentation.ui.NoteListScreen
import com.saadeh.scribblespace.list.presentation.NoteListViewModel

@Composable
fun ScribbleSpaceApp(
    noteListViewModel: NoteListViewModel,
    createNoteViewModel: CreateNoteViewModel
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "noteList") {
        composable(route = "noteList") {
            NoteListScreen(
                viewModel = noteListViewModel,
                navController = navController
            )
        }

        composable(route = "createNote") {
            CreateNoteScreen(
                viewModel = createNoteViewModel,
                navController = navController,
            )
        }

    }
}