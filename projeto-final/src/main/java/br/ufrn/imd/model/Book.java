package br.ufrn.imd.model;

import br.ufrn.imd.model.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Long id;
    private String title;
    private String author;
    private Genre genre;
    private Integer publicationYear;
    private String isbn;
    @Builder.Default
    private Boolean isAvailable = true;
    
}
