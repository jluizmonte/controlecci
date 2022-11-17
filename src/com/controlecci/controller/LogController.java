package com.controlecci.controller;

import com.controlecci.model.LogModel;
import com.controlecci.model.dao.LogDao;

/**
 *
 * @author joseluiz
 */
public class LogController {

    LogDao logDao = new LogDao();

    public boolean salvarLog(LogModel logModel) {
        return logDao.salvarLog(logModel);
    }

}
