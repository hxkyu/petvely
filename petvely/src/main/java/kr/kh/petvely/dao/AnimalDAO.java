package kr.kh.petvely.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.kh.petvely.model.vo.AnimalVO;

public interface AnimalDAO {

	List<AnimalVO> selectPetList(int me_num);

	List<AnimalVO> selectDetailPetList(int po_num);

	List<AnimalVO> selectChoicePetList(int po_num);

	boolean insertMyPet(@Param("ani")AnimalVO animalVo, @Param("me_num")int me_num);

	boolean deleteMyPet(int ani_num);

	AnimalVO selectMyPet(int ani_num);

	boolean updateMyPet(AnimalVO animal);

	List<AnimalVO> selectOtherPet(int me_num);

}
