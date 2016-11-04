package me.jaegyu.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.jaegyu.blog.domain.model.entity.Hello;
import me.jaegyu.blog.infrastructure.dao.HelloDao;

@RestController
public class HelloRestController {

	@Autowired
	private HelloDao helloDao;

	@RequestMapping(value = "/add")
	public Hello add(Hello hello) {
		Hello helloData = helloDao.save(hello);
		return helloData;
	}

	@RequestMapping(value = "/list")
	public List<Hello> list() {
		List<Hello> helloList = helloDao.findAll();
		return helloList;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello World!";
	}
}
