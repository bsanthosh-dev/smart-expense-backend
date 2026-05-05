package com.santhosh.expenseiq.service;

import com.santhosh.expenseiq.model.Expense;
import com.santhosh.expenseiq.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repo;

    public List<Expense> getAll() {
        return repo.findAll();
    }

    public Expense save(Expense expense) {
        return repo.save(expense);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Expense update(Long id, Expense newExpense) {
        Expense oldExpense = repo.findById(id).orElse(null);

        if (oldExpense != null) {
            oldExpense.setTitle(newExpense.getTitle());
            oldExpense.setAmount(newExpense.getAmount());
            oldExpense.setCategory(newExpense.getCategory());
            oldExpense.setDate(newExpense.getDate());

            return repo.save(oldExpense);
        }

        return null;
    }
    // ✅ ADD HERE
    public Expense getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found"));

    }
}
