package com.allstate.training;

import org.hibernate.Session;

import com.allstate.training.conf.HibernateUtil;
import com.allstate.training.entities.*;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1=new Account();
		a1.setAccid(1212);
		a1.setName("sss");
		a1.setBalance(33232);
		
		SavingsAccount sav=new SavingsAccount();
		sav.setAccid(123);
		sav.setSacc_num(23324);
		
		CurrentAccount cur=new CurrentAccount();
		cur.setAccid(2113);
		cur.setCacc(5464);
		
		
Session session=		HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();
session.save(a1);
session.save(sav);
session.save(cur);

session.getTransaction().commit();
session.close();
	}

}
