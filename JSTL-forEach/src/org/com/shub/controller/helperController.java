package org.com.shub.controller;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.com.shub.model.FetchData;
import org.com.shub.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helperController{ 
	
	@Autowired
	FetchData fd;
	
	@RequestMapping(value="/show.sh",method = RequestMethod.GET)
	public ModelAndView result(HttpServletRequest req, HttpServletResponse res) throws Exception{
		//System.out.println("This is runnning");
		List<Student> list = fd.getAll();
		Map<String, List<Student>> m = new Hashtable<>();
		m.put("data", list);
		return new ModelAndView("success",m);
	}

}
