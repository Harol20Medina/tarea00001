package pe.edu.upeu.clase01.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.daoImpl.CustomersDaoIMpl;
import pe.edu.upeu.clase01.daoImpl.InvoicesDaoIMpl;
import pe.edu.upeu.clase01.entity.Customers;
import pe.edu.upeu.clase01.entity.Invoices;
	@Service
	public class CustomersService implements Todo<Customers>{
		
		@Autowired
		private CustomersDaoIMpl daoIMpl;
		@Override
		public int create(Customers t) {
			// TODO Auto-generated method stub
			return daoIMpl.create(t);
		}

		@Override
		public int update(Customers t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Customers read(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customers> readAll() {
			// TODO Auto-generated method stub
			return daoIMpl.readAll();
		}

	}
