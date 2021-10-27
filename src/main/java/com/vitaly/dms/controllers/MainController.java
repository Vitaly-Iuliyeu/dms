package com.vitaly.dms.controllers;

import com.vitaly.dms.model.Doc;
import com.vitaly.dms.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private DocumentService documentService;
    //private Date date = new Date(System.currentTimeMillis());

    @GetMapping("/doc")
    public List<Doc> getStudent() {
        return documentService.getAll();
    }

    @PostMapping("/add")
    public Doc addDoc(@RequestParam("name") String name){
        Doc doc = new Doc();
        doc.setName(name);
        return documentService.add(doc);
    }
}
