package com.QA.controllers;

import com.QA.models.Note;
import com.QA.respository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class NotesController {

    @Autowired
    private NotesRepository notesRepository;


    @RequestMapping(value = "notes", method = RequestMethod.GET)
    public List<Note> listAllNotes(){
        return notesRepository.findAll();
    }

    @RequestMapping(value = "notes", method = RequestMethod.POST)
    public Note addNote (@RequestBody Note note){
        return notesRepository.saveAndFlush(note);
    }

}