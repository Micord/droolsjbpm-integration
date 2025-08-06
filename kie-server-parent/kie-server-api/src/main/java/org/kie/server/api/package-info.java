/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@XmlJavaTypeAdapters({
        @XmlJavaTypeAdapter(type = BendableScore.class, value = BendableScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = BendableLongScore.class, value = BendableLongScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = HardMediumSoftScore.class, value = HardMediumSoftScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = HardMediumSoftLongScore.class, value = HardMediumSoftLongScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = HardSoftScore.class, value = HardSoftScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = HardSoftLongScore.class, value = HardSoftLongScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = HardSoftBigDecimalScore.class, value = HardSoftBigDecimalScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = SimpleScore.class, value = SimpleScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = SimpleLongScore.class, value = SimpleLongScoreJaxbAdapter.class),
        @XmlJavaTypeAdapter(type = SimpleBigDecimalScore.class, value = SimpleBigDecimalScoreJaxbAdapter.class)
})
package org.kie.server.api;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import org.optaplanner.core.api.score.buildin.bendable.BendableScore;
import org.optaplanner.core.api.score.buildin.bendablelong.BendableLongScore;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;
import org.optaplanner.core.api.score.buildin.hardmediumsoftlong.HardMediumSoftLongScore;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.score.buildin.hardsoftbigdecimal.HardSoftBigDecimalScore;
import org.optaplanner.core.api.score.buildin.hardsoftlong.HardSoftLongScore;
import org.optaplanner.core.api.score.buildin.simple.SimpleScore;
import org.optaplanner.core.api.score.buildin.simplebigdecimal.SimpleBigDecimalScore;
import org.optaplanner.core.api.score.buildin.simplelong.SimpleLongScore;
import org.optaplanner.persistence.jaxb.api.score.buildin.bendable.BendableScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.bendablelong.BendableLongScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.hardmediumsoft.HardMediumSoftScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.hardmediumsoftlong.HardMediumSoftLongScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.hardsoft.HardSoftScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.hardsoftbigdecimal.HardSoftBigDecimalScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.hardsoftlong.HardSoftLongScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.simple.SimpleScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.simplebigdecimal.SimpleBigDecimalScoreJaxbAdapter;
import org.optaplanner.persistence.jaxb.api.score.buildin.simplelong.SimpleLongScoreJaxbAdapter;
