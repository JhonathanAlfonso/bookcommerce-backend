package com.salajhon69.bookcommerce.service;

import com.salajhon69.bookcommerce.model.PurchaseHistory;
import com.salajhon69.bookcommerce.repository.IPurchaseHistoryRepository;
import com.salajhon69.bookcommerce.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService {

    @Autowired
    private IPurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory)
    }

    @Override
    public List<IPurchaseItem> findPurchaseItemsOfUser(Long userId) {
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
