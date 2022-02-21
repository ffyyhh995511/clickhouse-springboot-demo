package org.fyh.clickhouse.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.fyh.clickhouse.demo.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2022/2/16 16:22
 */

@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    // 写入数据
    void saveData (UserInfo userInfo) ;
    // ID 查询
    UserInfo selectById (@Param("id") Integer id) ;
    // 查询全部
    List<UserInfo> selectList () ;
}