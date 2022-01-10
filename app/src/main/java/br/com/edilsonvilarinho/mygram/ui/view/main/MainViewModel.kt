package br.com.edilsonvilarinho.mygram.ui.view.main


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.model.Story

class MainViewModel : ViewModel() {

    private val mStoreList = MutableLiveData<List<Story>>().apply {
        for (index in 0..100) {
            val storyList: ArrayList<Story> = ArrayList()
            for (index in 0..100) {
                storyList.add(Story("username:$index", "img"))
            }
            this.value = storyList
        }
    }
    val storeList: LiveData<List<Story>> = mStoreList

    private val mPostList = MutableLiveData<List<Post>>().apply {
        val postList: ArrayList<Post> = ArrayList()
        for (index in 0..100) {
            postList.add(Post("username:$index"))
        }
        this.value = postList
    }
    val postList: LiveData<List<Post>> = mPostList


}