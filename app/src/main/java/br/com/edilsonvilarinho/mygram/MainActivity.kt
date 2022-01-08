package br.com.edilsonvilarinho.mygram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edilsonvilarinho.mygram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapterStory: StoryRecyclerViewAdapter
    private lateinit var adapterPost: PostRecyclerViewAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val storyList: ArrayList<Story> = ArrayList()
        for (index in 0..100) {
            storyList.add(Story("username:$index", "img"))
        }
        adapterStory = StoryRecyclerViewAdapter()
        adapterStory.mStorys = storyList
        binding.storyList.adapter = adapterStory
        binding.storyList.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        val postList: ArrayList<Post> = ArrayList()
        for (index in 0..100) {
            postList.add(Post("username:$index"))
        }
        adapterPost = PostRecyclerViewAdapter()
        adapterPost.mPosts = storyList
        binding.postList.adapter = adapterPost
        binding.postList.layoutManager = LinearLayoutManager(this)

    }
}