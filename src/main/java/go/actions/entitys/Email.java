package go.actions.entitys;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email")
public class Email {

	@Id
	private long id;
	private int userFrom;
	private int userTo;
	private Date date;
	private String title;
	private String content;
	private int isSend;
	private int isRead;
	private int isDelete;
	private int group;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getUserFrom() {
		return userFrom;
	}
	public void setUserFrom(int userFrom) {
		this.userFrom = userFrom;
	}
	public int getUserTo() {
		return userTo;
	}
	public void setUserTo(int userTo) {
		this.userTo = userTo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getIsSend() {
		return isSend;
	}
	public void setIsSend(int isSend) {
		this.isSend = isSend;
	}
	public int getIsRead() {
		return isRead;
	}
	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
