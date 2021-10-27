package com.vitaly.dms.repository;

import com.vitaly.dms.model.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Doc,Long>{

}
