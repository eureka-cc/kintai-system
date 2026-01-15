package com.ucl.kintai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ucl.kintai.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // 可以按需要加自定义查询方法
}
