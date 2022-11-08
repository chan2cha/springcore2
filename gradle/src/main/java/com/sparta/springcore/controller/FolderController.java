package com.sparta.springcore.controller;

@RestController
public class FolderController{

    @PostMapping("api/folders")
    public List<Folder> addFolders(
            @RequestBody FolderRequestDto folderRequestDto
    ){

    }
}