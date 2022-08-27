package com.musica.app.modules.searchresiltprofile1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import com.musica.app.modules.podcastoptions.ui.PodcastOptionsFragment
import com.musica.app.modules.searchresiltprofile.ui.SearchResiltProfileFragment
import com.musica.app.modules.searchresultplaylist.ui.SearchResultPlaylistFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class SearchResiltProfile1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_songs),MyApp.getInstance().resources.getString(R.string.lbl_artists),MyApp.getInstance().resources.getString(R.string.lbl_albums),MyApp.getInstance().resources.getString(R.string.lbl_podcasts),MyApp.getInstance().resources.getString(R.string.lbl_playlists),MyApp.getInstance().resources.getString(R.string.lbl_profiles))

        val viewPages: List<Fragment> =
                listOf(SearchResultPlaylistFragment(),SearchResultPlaylistFragment(),SearchResultPlaylistFragment(),PodcastOptionsFragment(),SearchResultPlaylistFragment(),SearchResiltProfileFragment())

    }
}
