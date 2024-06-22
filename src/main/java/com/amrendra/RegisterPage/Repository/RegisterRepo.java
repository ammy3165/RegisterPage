package com.amrendra.RegisterPage.Repository;

import com.amrendra.RegisterPage.Entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer> {

}
