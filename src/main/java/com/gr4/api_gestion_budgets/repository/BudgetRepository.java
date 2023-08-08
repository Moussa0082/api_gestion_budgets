package com.gr4.api_gestion_budgets.repository;

import com.gr4.api_gestion_budgets.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gr4.api_gestion_budgets.models.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Integer>{
    
    Budget findBudgetById(Integer id);

}
