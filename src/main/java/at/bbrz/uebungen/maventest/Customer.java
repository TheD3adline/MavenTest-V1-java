package at.bbrz.uebungen.maventest;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class Customer {
    private Integer id;
    @NonNull
    private String name;
    private String address;

}
