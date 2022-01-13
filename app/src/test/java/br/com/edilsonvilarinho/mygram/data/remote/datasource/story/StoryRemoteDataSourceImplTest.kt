package br.com.edilsonvilarinho.mygram.data.remote.datasource.story

import br.com.edilsonvilarinho.mygram.TestDataFactory
import br.com.edilsonvilarinho.mygram.data.api.story.StoryService
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

@ExperimentalCoroutinesApi
class StoryRemoteDataSourceImplTest {

    private fun remoteDataSource(
        api: StoryService = mock(),
    ) = StoryRemoteDataSourceImpl(api)

    @Test
    fun `get story`() = runBlockingTest {
        val postResponseList = TestDataFactory.storyResponseList()
        val api = mock<StoryService>()
        whenever(api.getStorys()).thenReturn(postResponseList)
        val remoteDataSource = remoteDataSource(
            api = api
        )
        remoteDataSource.getStorys()
        verify(api).getStorys()
    }
}