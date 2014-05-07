package go.actions;

import go.actions.entitys.User;
import go.services.UserService;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.*;

import com.googlecode.scopeplugin.ScopeType;
import com.googlecode.scopeplugin.annotations.*;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;
import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.annotations.*;
@ParentPackage("struts-default")
@Namespace("/")
@Results({@Result(name="success",location="jsp/main.jsp")
,@Result(name="getLogin",location="jsp/login.jsp")
,@Result(name="error",location="base/error.jsp")
,@Result(name="input",location="jsp/login.jsp")

})
public class LoginAction extends ActionSupport {

	@In (scope=ScopeType.SESSION)
	@Out (scope=ScopeType.SESSION)
	private String title;
	
	@In (scope=ScopeType.SESSION)
	@Out (scope=ScopeType.SESSION)
	private User user;
	
	@Resource
	private UserService userService;
	
	
	@InputConfig(resultName="input")
	@Action(value="login")
	@Validations(
			requiredStrings = {@RequiredStringValidator(type=ValidatorType.SIMPLE,fieldName = "user.username",shortCircuit=true,message = "用户名不能为空~~") },
			stringLengthFields = {@StringLengthFieldValidator(type = ValidatorType.SIMPLE, trim = true, minLength="6" ,shortCircuit=true, fieldName = "user.password", message = "密码长度不少于6")}
	   )
	public String getLogin(){
		if(this.user==null){
			this.title="登陆";
			return "getLogin";
			
		}
		if(this.userService.loginCheck(this.user)){
			this.title="登陆成功~!";
			return SUCCESS;
			/*
			 * 注意，这里并没有定义begins的返回视图，则struts2会在同一包下查找login-begins的action，作为chain方式传递
			 */
		}
		return ERROR;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
