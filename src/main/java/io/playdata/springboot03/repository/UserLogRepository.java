package io.playdata.springboot03.repository;

import io.playdata.springboot03.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//데이터를 관리하는 역할을 할 자바클래스
@Repository // Repository로 등록
public interface UserLogRepository extends JpaRepository<User, Long > {

}
