package com.cg.rms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.rms.bean.CandidatePersonal;
import com.cg.rms.service.IRmsService;



@Controller
public class HomeController {

	
	@Autowired
	IRmsService irs;
	
	
	public IRmsService getIrs() {
		return irs;
	}

	public void setIrs(IRmsService irs) {
		this.irs = irs;
	}

	@RequestMapping("Login")
	public String getLoginPage(){
		return "loginval"; 
	}
	
	@RequestMapping("userLogin")
	public String validateUser(Model model ,
			  @RequestParam("username") String uname,
			  @RequestParam("password")String pass){
		if(uname.equals("candidate") && pass.equals("candidate"))
		{
		model.addAttribute("successMsg",
				"Welcome to candidate Page");
		model.addAttribute("username", uname);
		return "candidateMenu";
		}
		else if(uname.equals("admin") && pass.equals("admin"))
				{
			model.addAttribute("successMsg",
					"Welcome to admin Page");
			model.addAttribute("username", uname);
			return "adminMenu";
			}
		
		else if(uname.equals("company") && pass.equals("company"))
		{
	model.addAttribute("successMsg",
			"Welcome to company Page");
	model.addAttribute("username", uname);
	return "comanyMenu";
	}
				
				{
			model.addAttribute
			("errorMsg", "Invalid Username/Password");
			return "Error";
	
	}
				}
	
	@RequestMapping("insertResume")
	public String getCandidatePage(Model model) 
	
	{
		CandidatePersonal cpersonal = new CandidatePersonal();
		model.addAttribute("CandidateBean", cpersonal);
		return "insertPersonalDetails";
		}
	
	
	
	 @RequestMapping("insertcandidater")
	 public String registerUser(   Model model,  @ModelAttribute("CandidateBean") @Valid CandidatePersonal cpersonal, BindingResult result )
	 {
		 

			
			if(result.hasErrors()){
				return "insertPersonalDetails";
			}
			
			else{
				
				cpersonal = irs.addCandidate(cpersonal);
				
				model.addAttribute("cpersonal", cpersonal);
				 
				model.addAttribute("successMsg","Student added ");
	    		
				return "CandidateSuccess";
			}
	  }
	
	
	
	
	
	
	
	
}
