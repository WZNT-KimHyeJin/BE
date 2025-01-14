package com.team7.be.domain.repository;
import com.team7.be.domain.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup,Long> {


    //그룹 식별키로 그룹을 찾는 부분. 인자로 Long형 값을 받음.
    Optional<UserGroup> findByGroupId(@Param("groupId")Long groupId);
    //그룹 식별키로 그룹을 제거하는 부분. 인자로 Long형 값을 받음.
    void deleteByGroupId(@Param("groupId")Long groupId);

    //그룹 이름으로 그룹을 찿는 부분 그룹이름은 unique제약속성을 가짐.
    Optional<UserGroup> findByGroupName(@Param("groupName") String groupName);


}
