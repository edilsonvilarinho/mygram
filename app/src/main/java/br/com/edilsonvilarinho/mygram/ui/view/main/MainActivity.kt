package br.com.edilsonvilarinho.mygram.ui.view.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edilsonvilarinho.mygram.databinding.ActivityMainBinding
import br.com.edilsonvilarinho.mygram.ui.view.main.adpter.PostRecyclerViewAdapter
import br.com.edilsonvilarinho.mygram.ui.view.main.adpter.StoryRecyclerViewAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var adapterStory: StoryRecyclerViewAdapter
    private lateinit var adapterPost: PostRecyclerViewAdapter

    private lateinit var binding: ActivityMainBinding

    private val mainViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        initObservers()
    }

    private fun init() {
        adapterStory = StoryRecyclerViewAdapter()
        binding.storyList.adapter = adapterStory
        binding.storyList.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        adapterPost = PostRecyclerViewAdapter()
        binding.postList.adapter = adapterPost
        binding.postList.layoutManager = LinearLayoutManager(this)
    }

    private fun initObservers() {
        mainViewModel.storeList.observe(this, Observer {
            adapterStory.mStorys = it
        })
        mainViewModel.postList.observe(this, Observer {
            adapterPost.mPosts = it
        })
        mainViewModel.loadingStorys.observe(this, Observer {
            binding.progressBarStorys.isVisible = it
        })
        mainViewModel.loadingPosts.observe(this, Observer {
            binding.progressBarPosts.isVisible = it
        })
    }

}