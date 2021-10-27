package com.vitaly.dms.service;

import com.vitaly.dms.model.Doc;

import java.util.List;

public interface DocumentService {
    List<Doc> getAll();

    Doc add(Doc doc);
}
