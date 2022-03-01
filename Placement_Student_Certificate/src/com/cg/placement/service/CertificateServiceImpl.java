package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.ICertificateRepository;
import com.cg.placement.repository.CertificateRepositoryImpl;

public class CertificateServiceImpl implements ICertificateService 
{

	// Step 1: Establishing connection between Service and Repo
		private ICertificateRepository dao;
		
		public CertificateServiceImpl() 
		{
			dao = new CertificateRepositoryImpl();
		}
	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}
	// Changes required
	@Override
	public Certificate updateCertificate(Certificate certificate) 
	{
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}
	@Override
	public Certificate searchCertificate(int id) 
	{
		Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) 
	{
		Certificate certificate = dao.deleteCertificate(id);
		return certificate;
	}

}
