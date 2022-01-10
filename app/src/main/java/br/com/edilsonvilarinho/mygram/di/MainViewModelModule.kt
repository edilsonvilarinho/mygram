package br.com.edilsonvilarinho.mygram

import br.com.edilsonvilarinho.mygram.ui.view.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainViewModelModule = module {
    viewModel { MainViewModel() }
}