/**===========================================
 *        Copyright (C) 2014 Tempus
 *           All rights reserved
 *
 *  项 目 名： jeecg-framework
 *  文 件 名： JeecgDictDao.java
 *  版本信息： V1.0.0 
 *  作    者： Administrator
 *  日    期： 2014年5月11日-上午2:07:36
 * 
 ============================================*/

package org.jeecgframework.web.system.dao;

import java.util.List;

import org.jeecgframework.minidao.annotation.Arguments;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.web.system.pojo.base.DictEntity;
import org.springframework.stereotype.Repository;

@Repository("jeecgDictDao")
public interface JeecgDictDao {

	/**
	 * 方法描述:  查询自定义字典
	 * 返回类型： List<DictEntity>
	 */
	@Arguments({"dicTable", "dicCode", "dicText"})
	@ResultType(DictEntity.class)
	public List<DictEntity> queryCustomDict(String dicTable, String dicCode,String dicText);
	
	
	/**
	 * 方法描述:  查询系统字典
	 * 返回类型： List<DictEntity>
	 */
	@Arguments({"dicCode"})
	@ResultType(DictEntity.class)
	public List<DictEntity> querySystemDict(String dicCode);
}
