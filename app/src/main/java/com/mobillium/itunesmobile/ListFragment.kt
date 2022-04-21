package com.mobillium.itunesmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.mobillium.itunesmobile.databinding.FragmentListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListFragment : Fragment() {
/*
    private var _binding:FragmentListBinding? = null
    private val binding get() = _binding!!

    private val songViewModel: SongViewModel by viewModels()

    private var currentList = ArrayList<Song>()

    private lateinit var songAdapter: SongAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        songAdapter = SongAdapter {
            val action = SongListFragmentDirections.actionSongListFragmentToSongDetailsFragment(it)
            view.findNavController().navigate(action)
        }
        binding.gridRv.apply {
            adapter = songAdapter
        }

        binding.apply {
            searchView.isSubmitButtonEnabled = true
            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    query?.let {
                        searchUser(it)
                    }
                    return true
                }
                override fun onQueryTextChange(newText: String?): Boolean { return true}

            })

            songViewModel.songList.observe(viewLifecycleOwner, {
                currentList = it as ArrayList<Song>
                songAdapter.submitList(it)

            })
        }

        songViewModel.status.observe(viewLifecycleOwner,{
            when(it) {
                is NetworkStatus.Success -> {
                    binding.progressBar.isVisible = false
                    binding.gridRv.isVisible = true
                    binding.errorImageView.isVisible = false

                }
                is NetworkStatus.Loading -> {
                    binding.progressBar.isVisible = true
                    binding.gridRv.isVisible =false
                    binding.errorImageView.isVisible = false
                }

                is NetworkStatus.Error -> {
                    binding.progressBar.isVisible = false
                    binding.gridRv.isVisible =false
                    binding.errorImageView.isVisible = true
                }
            }
        })
    }

    private fun searchUser(query:String) {
        if(currentList.isNotEmpty()){
            songViewModel.deleteAllSongs()
        }
        songViewModel.fetchFromNetwork(query)
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
*/
}