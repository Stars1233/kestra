package io.kestra.core.models.dashboards.filters;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;

@SuperBuilder
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@Schema(title = "NOT_EQUAL_TO")
public class NotEqualTo <F extends Enum<F>> extends AbstractFilter<F> {
    @NotNull
    @JsonInclude
    @Builder.Default
    protected FilterType type = FilterType.NOT_EQUAL_TO;

    @NotNull
    @Schema(anyOf = {Number.class, ZonedDateTime.class, String.class})
    private Object value;
}