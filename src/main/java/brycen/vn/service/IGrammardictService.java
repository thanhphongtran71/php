package brycen.vn.service;

import java.util.List;
import java.util.Optional;

import brycen.vn.model.Grammardict;

public interface IGrammardictService {
	Optional<Grammardict> findById(Long id);

	Grammardict findByTitleJp(String title_jp);

	void saveGrammardict(Grammardict grammardict);

	void updateGrammardict(Grammardict grammardict);

	void deleteGrammardictById(Long id);

	void deleteAllGrammardict();

	List<Grammardict> findAllGrammardict();

	boolean isGrammardictExist(Grammardict grammardict);
}
