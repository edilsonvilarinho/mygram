package br.com.edilsonvilarinho.mygram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edilsonvilarinho.mygram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapterStory: StoryRecyclerViewAdapter
    private lateinit var adapterPost: PostRecyclerViewAdapter

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
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
    }

}