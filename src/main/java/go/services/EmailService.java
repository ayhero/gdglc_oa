package go.services;

import go.actions.entitys.Email;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
@Service("emailService")
public class EmailService {

	public List<Email> getMailsList(String mailType){
		List<Email> mails=new ArrayList<Email>();
		while(mails.size()<10){
			Email m=new Email();
			m.setId(mails.size());
			m.setUserFrom(1);
			m.setUserTo(2);
			m.setContent("邮件内容");
			m.setTitle("标题");
			m.setDate(new Date());
			if(mails.size()/3==0){
				m.setIsRead(0);
			}
			mails.add(m);
		}
		return mails;
	}
	
	public Email getMail(long id){
		Email m=new Email();
		m.setId(id);
		m.setUserFrom(1);
		m.setUserTo(2);
		m.setContent("邮件内容");
		m.setTitle("标题");
		m.setDate(new Date());
		return m;
	}

	public void sendMail(Email mail){
		System.out.println(mail.getContent());
	}
}
