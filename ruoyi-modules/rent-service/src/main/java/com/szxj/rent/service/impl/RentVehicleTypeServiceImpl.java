package com.szxj.rent.service.impl;

import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.core.utils.bean.BeanUtils;
import com.szxj.rent.domain.RentVehicleType;
import com.szxj.rent.domain.vo.RentVehicleTypeVo;
import com.szxj.rent.mapper.RentVehicleTypeMapper;
import com.szxj.rent.service.IRentVehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 车辆配置Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Service
public class RentVehicleTypeServiceImpl implements IRentVehicleTypeService
{
    @Autowired
    private RentVehicleTypeMapper rentVehicleTypeMapper;

    /**
     * 查询车辆配置
     *
     * @param id 车辆配置主键
     * @return 车辆配置
     */
    @Override
    public RentVehicleType selectRentVehicleTypeById(String id)
    {
        return rentVehicleTypeMapper.selectRentVehicleTypeById(id);
    }

    /**
     * 查询车辆配置列表
     *
     * @param rentVehicleType 车辆配置
     * @return 车辆配置
     */
    @Override
    public List<RentVehicleTypeVo> selectRentVehicleTypeList(RentVehicleType rentVehicleType)
    {
        List<RentVehicleType> rentVehicleTypeList = rentVehicleTypeMapper.selectRentVehicleTypeList(rentVehicleType);
        // 获取树形结构
        return buildTree(rentVehicleTypeList);
    }

    /**
     * 新增车辆配置
     *
     * @param rentVehicleType 车辆配置
     * @return 结果
     */
    @Override
    public int insertRentVehicleType(RentVehicleType rentVehicleType)
    {
//        rentVehicleType.setCreateTime(DateUtils.getNowDate());
        return rentVehicleTypeMapper.insertRentVehicleType(rentVehicleType);
    }

    /**
     * 修改车辆配置
     *
     * @param rentVehicleType 车辆配置
     * @return 结果
     */
    @Override
    public int updateRentVehicleType(RentVehicleType rentVehicleType)
    {
        rentVehicleType.setUpdateTime(DateUtils.getNowDate());
        return rentVehicleTypeMapper.updateRentVehicleType(rentVehicleType);
    }

    /**
     * 批量删除车辆配置
     *
     * @param ids 需要删除的车辆配置主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleTypeByIds(String[] ids)
    {
        return rentVehicleTypeMapper.deleteRentVehicleTypeByIds(ids);
    }

    /**
     * 删除车辆配置信息
     *
     * @param id 车辆配置主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleTypeById(String id)
    {
        return rentVehicleTypeMapper.deleteRentVehicleTypeById(id);
    }

    private List<RentVehicleTypeVo> buildTree(List<RentVehicleType> list) {
        List<RentVehicleTypeVo> voList = new ArrayList<>();
        // 使用hashMap存储节点数据
        Map<Integer, RentVehicleTypeVo> typeMap = new HashMap<>();
        // 遍历数据存储所有节点信息
        for (RentVehicleType rentVehicleType : list) {
            RentVehicleTypeVo vo = new RentVehicleTypeVo();
            BeanUtils.copyBeanProp(vo, rentVehicleType);
            typeMap.put(rentVehicleType.getId(), vo);
        }
        // 遍历数据 获取树形结构
        for (RentVehicleType rentVehicleType : list) {
            // 是否为根节点
            if (Objects.equals(rentVehicleType.getParentId(), 0)) {
                RentVehicleTypeVo rootNode = typeMap.get(rentVehicleType.getId());
                voList.add(rootNode);
            }else {
                // 非根节点时，将数据存入其父节点的子集中
                RentVehicleTypeVo childNode = typeMap.get(rentVehicleType.getId());
                RentVehicleTypeVo parentNode = typeMap.get(rentVehicleType.getParentId());
                if (Objects.isNull(parentNode)) {
                    voList.add(childNode);
                }else {
                    parentNode.getChildren().add(childNode);
                }
            }
        }
        // 排序
        treeSort(voList);
        return voList;
    }

    private void treeSort(List<RentVehicleTypeVo> voList) {
        // 自排序
        voList.sort(Comparator.comparing(RentVehicleType::getOrderNum));
        // 子元素排序
        for (RentVehicleTypeVo vo : voList) {
            if (!vo.getChildren().isEmpty()) {
                treeSort(vo.getChildren());
            }
        }
    }
}
