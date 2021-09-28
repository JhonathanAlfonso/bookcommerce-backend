package com.salajhon69.bookcommerce.service;

import com.salajhon69.bookcommerce.model.PurchaseHistory;
import com.salajhon69.bookcommerce.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);
    List<IPurchaseItem> findPurchaseItemsOfUser(Long userId);
}
