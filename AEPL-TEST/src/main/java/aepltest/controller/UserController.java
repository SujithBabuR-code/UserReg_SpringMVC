package aepltest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aepltest.dao.UserDao;
import aepltest.dto.UserDto;

@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@ResponseBody
	@RequestMapping("/insert")
	public String userRegistration(@ModelAttribute UserDto userDto)
	{
		userDao.userRegistration(userDto);
		return "User Registration is successfull";
	}
	@ResponseBody
	@RequestMapping("/fetchall")
	public ModelAndView fetchAll()
	{
		List<UserDto> lct=userDao.fetchAll();
//		System.out.println(lct);
		
		ModelAndView view=new ModelAndView("download.jsp");
		view.addObject("objects", lct);
		return view;
	}
}
