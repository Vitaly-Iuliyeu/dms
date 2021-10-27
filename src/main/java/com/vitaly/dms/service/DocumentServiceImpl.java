package com.vitaly.dms.service;

import com.vitaly.dms.model.Doc;
import com.vitaly.dms.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public List<Doc> getAll() {
        return documentRepository.findAll();
    }
    @Override
    public Doc add(Doc doc) {
        return documentRepository.save(doc);
    }
}
