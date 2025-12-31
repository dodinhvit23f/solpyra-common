package com.solpyra.common.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class PageObject {
  protected int page;
  protected int totalPages;
  protected long totalElements;
  protected int pageSize;
}
