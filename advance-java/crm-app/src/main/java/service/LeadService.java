package service;

import dao.LeadDao;
import model.Lead;

public class LeadService {
    public LeadDao leadDao = new LeadDao();
    public void addLead(Lead lead){
        leadDao.addLead(lead);
    }
}
