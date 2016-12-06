/*
 * European Variation Archive (EVA) - Open-access database of all types of genetic
 * variation data from all species
 *
 * Copyright 2016 EMBL - European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.ebi.eva.server.repository;

import org.springframework.data.domain.Pageable;

import uk.ac.ebi.eva.commons.models.metadata.VariantEntity;

import java.util.List;

/**
 * Interface to declare additional repository methods with a custom implementation,
 * instead of the one that Spring Data would provide by default.
 */
interface VariantEntityRepositoryCustom {

    List<VariantEntity> findByRegionAndComplexFilters(String chr, int start, int end, List<String> studies,
                                                      List<String> consequenceType,
                                                      VariantEntityRepository.RelationalOperator mafOperator,
                                                      Double mafValue,
                                                      VariantEntityRepository.RelationalOperator polyphenScoreOperator,
                                                      Double polyphenScoreValue,
                                                      VariantEntityRepository.RelationalOperator siftOperator,
                                                      Double siftValue, Pageable pageable);

}
