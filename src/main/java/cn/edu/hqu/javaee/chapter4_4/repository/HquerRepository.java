package cn.edu.hqu.javaee.chapter4_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cn.edu.hqu.javaee.chapter4_4.entity.Hquer;

@Repository
public interface HquerRepository extends JpaRepository<Hquer,String>{
	Hquer findByUserName(String userName);
}
