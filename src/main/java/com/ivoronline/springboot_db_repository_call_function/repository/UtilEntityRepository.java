package com.ivoronline.springboot_db_repository_call_function.repository;

import com.ivoronline.springboot_db_repository_call_function.entity.UtilEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UtilEntityRepository extends CrudRepository<UtilEntity, Integer> {

   //CALL FUNCTION
   @Query(value = "SELECT TEST.MY_FUNCTION(:name, :age) FROM DUAL", nativeQuery = true)
   String callFunction(String name, Integer age);

   //CALL FUNCTION WITH ALIASES
   @Query(value = "SELECT TEST.MY_FUNCTION(:personName, :personAge) FROM DUAL", nativeQuery = true)
   String callFunctionWithAliases(
     @Param("personName") String  name,
     @Param("personAge" ) Integer age,
  );

}
