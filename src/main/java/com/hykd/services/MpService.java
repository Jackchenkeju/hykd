package com.hykd.services;

import com.jfinal.plugin.activerecord.Page;
import com.hykd.models.Mp;
import io.jboot.db.model.Columns;

import java.util.List;

public interface MpService  {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public Mp findById(Object id);


    /**
     * find all model
     *
     * @return all <Mp
     */
    public List<Mp> findAll();


    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(Mp model);


    /**
     * save model to database
     *
     * @param model
     * @return id value if save success
     */
    public Object save(Mp model);


    /**
     * save or update model
     *
     * @param model
     * @return id value if save or update success
     */
    public Object saveOrUpdate(Mp model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(Mp model);


    /**
     * page query
     *
     * @param page
     * @param pageSize
     * @return page data
     */
    public Page<Mp> paginate(int page, int pageSize);


    /**
     * page query by columns
     *
     * @param page
     * @param pageSize
     * @param columns
     * @return page data
     */
    public Page<Mp> paginateByColumns(int page, int pageSize, Columns columns);


    /**
     * page query by columns
     *
     * @param page
     * @param pageSize
     * @param columns
     * @param orderBy
     * @return page data
     */
    public Page<Mp> paginateByColumns(int page, int pageSize, Columns columns, String orderBy);


}