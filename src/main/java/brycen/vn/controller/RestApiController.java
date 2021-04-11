package brycen.vn.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import brycen.vn.exception.ResourceNotFoundException;
import brycen.vn.model.Exampledict;
import brycen.vn.model.Grammardict;
import brycen.vn.model.Level;
import brycen.vn.repositories.DictionaryRepository;
import brycen.vn.repositories.ExampledictRepository;
import brycen.vn.repositories.GrammardictRepository;
import brycen.vn.repositories.LevelRepository;
import brycen.vn.service.IGrammardictService;

@RestController
@RequestMapping("/api/v1")
public class RestApiController {
	
//	@Autowired
//	private GrammardictRepository grammardictRepository;
//	
	@Autowired
	private ExampledictRepository exampledictRepository;
	
	@Autowired
	private LevelRepository levelRepository;
	
	@Autowired
	private DictionaryRepository dictionaryRepository;
	
	@Autowired
	private IGrammardictService iGrammardictService;
	
	@GetMapping("/gramardict")
	public List<Grammardict> getAllGrammardict(){
		
		return iGrammardictService.findAllGrammardict();
		//return grammardictRepository.findAll();
	}
	
	@GetMapping("/exampledict")
	public List<Exampledict> getAllExampledict(){
		return exampledictRepository.findAll();
	}
	
	@GetMapping("/level")
	public List<Level> getAllLevel(){
		return levelRepository.findAll();
	}
	
	@GetMapping("/dictionary/{level}")
	public List<Grammardict> getDictionaryByLevel(@PathVariable(value = "level") Long level)
			throws ResourceNotFoundException {
		
		return dictionaryRepository.getDictionaryByLevel(level);
		
	}

}
