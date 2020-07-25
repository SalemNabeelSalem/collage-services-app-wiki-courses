package com.salemnabeel.wikicoursesapp.converter;

import com.salemnabeel.wikicoursesapp.dto.ClassificationDto;
import com.salemnabeel.wikicoursesapp.model.Classification;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClassificationConverter {

    public ClassificationDto entityToDto(Classification classification) {

        ClassificationDto classificationDto = new ClassificationDto();

        classificationDto.setId(classification.getId());

        classificationDto.setTitle(classification.getTitle());

        classificationDto.setIsActive(classification.getIsActive());

        return classificationDto;
    }

    public List<ClassificationDto> entityToDto(List<Classification> classificationsList) {

        return classificationsList.stream().map(
                classification -> entityToDto(classification)
            ).collect(Collectors.toList()
        );
    }

    public Classification dtoToEntity(ClassificationDto classificationDto) {

        Classification classification = new Classification();

        classification.setId(classificationDto.getId());

        classification.setTitle(classificationDto.getTitle());

        classification.setIsActive(classificationDto.getIsActive());

        return classification;
    }

    public List<Classification> dtoToEntity(List<ClassificationDto> classificationsDtoList) {
        return classificationsDtoList.stream().map(
                classificationDto -> dtoToEntity(classificationDto)
            ).collect(Collectors.toList()
        );
    }
}