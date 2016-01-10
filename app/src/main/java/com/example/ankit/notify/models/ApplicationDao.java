package com.example.ankit.notify.models;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Application DAO.
 *
 * Created by pieter on 26/09/14.
 */
public interface ApplicationDao extends Dao<Application, String> {
    public List<Application> getIgnoredApps() throws SQLException;

}
