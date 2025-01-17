package com.asidg4.parentservice.controllers;

import com.asidg4.parentservice.model.DTOs.ParentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import com.asidg4.parentservice.service.ParentService;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parents")
public class ParentController {

    private final ParentService parentService;

    @Autowired
    public ParentController(ParentService parentService) {
        this.parentService = parentService;
    }

    @GetMapping
    public ResponseEntity<List<ParentDTO>> getAllParents() {
        return ResponseEntity
                .ok(parentService.getAllParents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParentDTO> getParentById(@PathVariable("id") Long parentId) {
        Optional<ParentDTO> parent = this.parentService.getParentById(parentId);

        if (parent.isEmpty()) {
            return ResponseEntity
                    .notFound()
                    .build();

        } else {
            return ResponseEntity
                    .ok(parent.get());

        }
    }

    @PostMapping
    public ResponseEntity<ParentDTO> addParent(@Valid @RequestBody ParentDTO parentDTO,
                                               UriComponentsBuilder uriComponentsBuilder) {

        long newParentId = parentService.addParent(parentDTO);

        parentDTO.setId(newParentId);
        return ResponseEntity
        .created(uriComponentsBuilder.path("/parents/{id}")
                .build(newParentId))
        .body(parentDTO);
    }

    /*@PostMapping("/{parentId}/student/{studentId}")
    public ResponseEntity<StudentDTO> assignParentToStudent(@PathVariable("parentId") Long parentId, @PathVariable("studentId") Long studentId) {
        Optional<StudentDTO> studentToMapOptional = parentService.assignParentToStudent(parentId, studentId);

        if (studentToMapOptional.isEmpty()) {
            return ResponseEntity
                    .notFound()
                    .build();
        } else {
            return ResponseEntity
                    .ok(studentToMapOptional.get());
        }

    }*/


    @DeleteMapping("/{id}")
    public ResponseEntity<ParentDTO> deleteParentById(@PathVariable("id") Long parentId) {
        this.parentService.deleteParentById(parentId);

        return ResponseEntity
                .noContent()
                .build();
    }

}
