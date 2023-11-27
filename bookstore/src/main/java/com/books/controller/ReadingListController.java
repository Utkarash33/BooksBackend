package com.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.entities.ReadingList;
import com.books.services.ReadingListService;

@RestController
@RequestMapping("/api/reading-lists")
public class ReadingListController {

    @Autowired
    private ReadingListService readingListRepository;

    @GetMapping("/{userId}")
    public ResponseEntity<List<ReadingList>> getUserReadingList(@PathVariable Long userId) {
       
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping("/{userId}")
    public ResponseEntity<ReadingList> addToReadingList(@PathVariable Long userId, @RequestBody ReadingList readingListItem) {
        

       
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @DeleteMapping("/{readingListId}")
    public ResponseEntity<String> removeFromReadingList(@PathVariable Long readingListId) {
        
            return new ResponseEntity<>(null,HttpStatus.OK);
        }
 
}
