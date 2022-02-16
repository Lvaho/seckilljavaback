package com.zjc.seckilldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjc.seckilldemo.pojo.Deposit;
import com.zjc.seckilldemo.vo.DepositVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lvaho
 * @since 2022-02-07
 */
public interface DepositMapper extends BaseMapper<Deposit> {
   Deposit findDepositByIdentity(String identity);
   int updateDepositByIdentity(Deposit deposit);
   int createOrder(DepositVo depositVo,String orderNo);
}