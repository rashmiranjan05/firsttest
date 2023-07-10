package com.firsttest.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.firsttest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
//    @Query(value = "SELECT PERIOD_DIFF(DATE_FORMAT(?2, '%Y%m'), DATE_FORMAT(?1, '%Y%m')) AS months, " +
//            "DATEDIFF(?2, ?1) % 30 AS days FROM Employee e WHERE e.id = ?3", nativeQuery = true)
//    Object[] getDateDifferenceInMonthsAndDays(LocalDate startDate, LocalDate endDate, Long employeeId);
//	@Query(value = "SELECT " +
//	        "TIMESTAMPDIFF(MONTH, ?1, ?2) as months, " +
//	        "MOD(TIMESTAMPDIFF(DAY, ?1, ?2), 30) as days " +
//	        "FROM Employee e WHERE e.id = ?3", nativeQuery = true)
//	Object[] getDateDifferenceInMonthsAndDays(LocalDate startDate, LocalDate endDate, Long employeeId);
	
//	@Query(value = "SELECT " +
//            "PERIOD_DIFF(DATE_FORMAT(:endDate, '%Y%m'), DATE_FORMAT(:startDate, '%Y%m')) AS months, " +
//            "DATEDIFF(:endDate, :startDate) % 30 AS days " +
//            "FROM Employee e WHERE e.id = :employeeId", nativeQuery = true)
//    Object[] getDateDifferenceInMonthsAndDays(
//            @Param("startDate") LocalDate startDate,
//            @Param("endDate") LocalDate endDate,
//            @Param("employeeId") Long employeeId);
//	@Query(value = "SELECT " +
//	        "PERIOD_DIFF(DATE_FORMAT(:endDate, '%Y%m'), DATE_FORMAT(:startDate, '%Y%m')) AS months, " +
//	        "TIMESTAMPDIFF(DAY, :startDate, :endDate) - (PERIOD_DIFF(DATE_FORMAT(:endDate, '%Y%m'), DATE_FORMAT(:startDate, '%Y%m')) * 30) AS days " +
//	        "FROM Employee e WHERE e.id = :employeeId", nativeQuery = true)
//	Object[] getDateDifferenceInMonthsAndDays(
//	        @Param("startDate") LocalDate startDate,
//	        @Param("endDate") LocalDate endDate,
//	        @Param("employeeId") Long employeeId);
	
	@Query(value = "SELECT " +
	        "PERIOD_DIFF(DATE_FORMAT(:endDate, '%Y%m'), DATE_FORMAT(:startDate, '%Y%m')) AS months, " +
	        "DATEDIFF(:endDate, :startDate) - (PERIOD_DIFF(DATE_FORMAT(:endDate, '%Y%m'), DATE_FORMAT(:startDate, '%Y%m')) * 30) AS days " +
	        "FROM Employee e WHERE e.id = :employeeId", nativeQuery = true)
	Object[] getDateDifferenceInMonthsAndDays(
	        @Param("startDate") LocalDate startDate,
	        @Param("endDate") LocalDate endDate,
	        @Param("employeeId") Long employeeId);



}
