package br.com.edilsonvilarinho.mygram.ui.view.main


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.model.Story
import br.com.edilsonvilarinho.mygram.data.repository.PostRepository
import br.com.edilsonvilarinho.mygram.data.repository.StoryRepository
import kotlinx.coroutines.launch

class MainViewModel(
    private val storyRepository: StoryRepository,
    private val postRepository: PostRepository
) : ViewModel() {

    private val mStoreList = MutableLiveData<List<Story>>()
    val storeList: LiveData<List<Story>> = mStoreList

    private val mPostList = MutableLiveData<List<Post>>()
    val postList: LiveData<List<Post>> = mPostList

    private val mLoadingStorys = MutableLiveData<Boolean>().apply { this.value = true }
    val loadingStorys: LiveData<Boolean> = mLoadingStorys

    private val mLoadingPosts = MutableLiveData<Boolean>().apply { this.value = true }
    val loadingPosts: LiveData<Boolean> = mLoadingPosts

    init {
        getStors()
        getPosts()
    }

    fun getStors() {
        viewModelScope.launch {
            try {
                storyRepository.getStorys()?.let {
                    mStoreList.value = it
                }
            } catch (e: Exception) {
                e.printStackTrace()
                mStoreList.value = storyRepository.getStorysLocalData()
            } finally {
                mLoadingStorys.value = false
            }

        }
    }

    fun getPosts() {
        viewModelScope.launch {
            try {
                postRepository.getPosts()?.let {
                    mPostList.value = it
                }
            } catch (e: Exception) {
                e.printStackTrace()
                mPostList.value = postRepository.getPostsLocalData()
            } finally {
                mLoadingPosts.value = false
            }

        }
    }

}