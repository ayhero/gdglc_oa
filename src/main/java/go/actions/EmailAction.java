package go.actions;

import go.actions.entitys.Email;
import go.actions.entitys.User;
import go.services.EmailService;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.googlecode.scopeplugin.ScopeType;
import com.googlecode.scopeplugin.annotations.In;
import com.googlecode.scopeplugin.annotations.Out;
import com.opensymphony.xwork2.ActionSupport;
@ParentPackage("struts-default")
@Namespace("/")
@Results({@Result(name="success",location="jsp/emails/mailsList.jsp")
		,@Result(name="mail",location="jsp/emails/mail.jsp")
		,@Result(name="error",location="base/error.jsp")
		,@Result(name="newMail",location="jsp/emails/newMail.jsp")
		,@Result(name="sendSuccess",location="jsp/emails/sendSuccess.jsp")

})
public class EmailAction extends ActionSupport {

	@In (scope=ScopeType.CONVERSATION)
	@Out (scope=ScopeType.CONVERSATION)
	private String mailType;

	@In (scope=ScopeType.CONVERSATION)
	@Out (scope=ScopeType.CONVERSATION)
	private List<Email> mailsList;

	@In (scope=ScopeType.CONVERSATION)
	@Out (scope=ScopeType.CONVERSATION)
	private long id;
	

	@In (scope=ScopeType.CONVERSATION)
	@Out (scope=ScopeType.CONVERSATION)
	private Email mail;
	
	@Resource(name="emailService")
	private EmailService emailService;
	
	
	/**
	 * 邮件列表
	 * @return
	 */
	@Action("/mails")
	public String mailsList(){
		this.mailsList=emailService.getMailsList(this.mailType);
		return SUCCESS;
	}

	/**
	 * 邮件查看
	 * @return
	 */
	@Action("/mail")
	public String mail(){
		this.mail=emailService.getMail(this.id);
		return "mail";
	}
	
	/**
	 * 新邮件
	 * @return
	 */
	@Action("newMail")
	public String newMail(){
		
		if(this.mail==null)
			return "newMail";
		this.emailService.sendMail(mail);
		return "sendSuccess";
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public void setMailType(String mailType) {
		this.mailType = mailType;
	}
	public List<Email> getMailsList() {
		return mailsList;
	}

	public void setMailsList(List<Email> mailsList) {
		this.mailsList = mailsList;
	}


	public Email getMail() {
		return mail;
	}

	public void setMail(Email mail) {
		this.mail = mail;
	}
}
