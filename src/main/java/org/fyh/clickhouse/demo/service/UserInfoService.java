package org.fyh.clickhouse.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.fyh.clickhouse.demo.entity.UserInfo;

import java.util.List;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2022/2/16 16:29
 */
public interface UserInfoService extends IService<UserInfo> {
    // 写入数据
    void saveData (UserInfo userInfo) ;
    // ID 查询
    UserInfo selectById (@Param("id") Integer id) ;
    // 查询全部
    List<UserInfo> selectList () ;
}