package com.sxt.dao;

public class DeptDaoProxy implements DeptDao {

    private DeptDao deptDao;

    public DeptDaoProxy(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public void update() {
        System.out.println("得到Session");
        System.out.println("开启事务");
        deptDao.update();
        System.out.println("提交事务");
    }
}
