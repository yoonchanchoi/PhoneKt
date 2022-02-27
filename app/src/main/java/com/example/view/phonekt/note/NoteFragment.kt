package com.example.view.phonekt.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.view.phonekt.R
import com.example.view.phonekt.adapter.NoteAdapter
import com.example.view.phonekt.databinding.FragmentNoteBinding


/**
 * A simple [Fragment] subclass.
 * Use the [NoteFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NoteFragment : Fragment() {

    private var nfBinding: FragmentNoteBinding?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val noteList = arrayListOf(
            NoteModel("title1","내용1","2022-02-21"),
            NoteModel("제목2","내용2","2022-02-22"),
            NoteModel("제목3","내용3","2022-02-23"),
            NoteModel("제목4","내용4","2022-02-24"),
            NoteModel("제목5","내용5","2022-02-25"),
            NoteModel("제목6","내용6","2022-02-26"),
            NoteModel("제목7","내용7","2022-02-27")
        )

        val binding = FragmentNoteBinding.inflate(inflater,container, false)

        nfBinding = binding

        nfBinding?.rvNote?.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        nfBinding?.rvNote?.setHasFixedSize(true)

        nfBinding?.rvNote?.adapter = NoteAdapter(noteList)


        nfBinding?.btnCreat?.setOnClickListener{
            val test:String
        }


        return nfBinding?.root



    }

    override fun onDestroyView() {
        nfBinding = null
        super.onDestroyView()
    }


}