package brycen.vn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import brycen.vn.model.Grammardict;
import brycen.vn.repositories.GrammardictRepository;

@Service("grammardictService")
@Transactional
public class GrammardictServiceImpl implements IGrammardictService{

	@Autowired
	private GrammardictRepository grammardictRepository;
	
	@Override
	public Optional<Grammardict> findById(Long id) {
		
		return grammardictRepository.findById(id);
	}

	@Override
	public Grammardict findByTitleJp(String title_jp) {
		return grammardictRepository.findByTitleJp(title_jp);
	}

	@Override
	public void saveGrammardict(Grammardict grammardict) {
		grammardictRepository.save(grammardict);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGrammardict(Grammardict grammardict) {
		saveGrammardict(grammardict);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGrammardictById(Long id) {
		grammardictRepository.deleteById(id);
		
	}

	
	@Override
	public void deleteAllGrammardict() {
		grammardictRepository.deleteAll();
		
	}

	@Override
	public List<Grammardict> findAllGrammardict() {
		return grammardictRepository.findAll();
	}

	@Override
	public boolean isGrammardictExist(Grammardict grammardict) {
		return findByTitleJp(grammardict.getTitleJp()) != null;
	}

}
