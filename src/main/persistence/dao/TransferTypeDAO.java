package main.persistence.dao;

import main.persistence.entities.TransferType;
import java.util.List;

public interface TransferTypeDAO {
    void create(TransferType transferType);
    void update(TransferType transferType);
    void delete(Long id);
    TransferType findById(Long id);
    List<TransferType> findAll();
}