package com.example.springbootdemo.repository;

import com.example.springbootdemo.bean.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository<实体名,Id类型>
public interface GirlRepository extends JpaRepository<Girl,Integer> {
  /**
   * 扩展：通过身高查询的方法
   */
  public List<Girl> findByHeight(Integer height);
}
